package vn.edu.hcmuaf;

import vn.edu.hcmuaf.bean.User;
import vn.edu.hcmuaf.serice.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginController", value = "/login")
public class LoginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email")==null?"":request.getParameter("email");
        String pass = request.getParameter("pass")==null?"":request.getParameter("pass");

        if(!email.contains("@")){
            request.setAttribute("emailErr","Email is wrong!");
            request.getRequestDispatcher("./login.jsp").forward(request,response);
        }
        User u= UserService.getInstance().checkLogin(email,pass);
        if(u!=null){
            HttpSession session = request.getSession();
            session.setAttribute("auth",u);
            response.sendRedirect("./index.jsp");
        }else{
            request.setAttribute("err","Email or Password is incorrect");
            request.getRequestDispatcher("./login.jsp").forward(request,response);

        }
    }
}
