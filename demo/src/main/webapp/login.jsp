<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/mdb.min.css">
    <link rel="stylesheet" href="">
</head>
<body>
 <div class="container">
     <!-- Default form login -->
     <form method="post" class="text-center border border-light p-5" action="./login">

         <p class="h4 mb-4">Sign in</p>

         <%
             String emailErr= (String) request.getAttribute("emailErr");
             String err= (String) request.getAttribute("err");
         %>
         <% if(emailErr!=null){ %>
         <p class="text-danger"><%= emailErr %> </p>
         <% }%>
         <% if(err!=null){ %>
         <p class="text-danger"><%= err %> </p>
         <% }%>
         <!-- Email -->
         <input type="text" name="email" id="defaultLoginFormEmail" class="form-control mb-4" placeholder="E-mail">

         <!-- Password -->
         <input type="password" name="pass" id="defaultLoginFormPassword" class="form-control mb-4" placeholder="Password">

         <div class="d-flex justify-content-around">
             <div>
                 <!-- Remember me -->
                 <div class="custom-control custom-checkbox">
                     <input type="checkbox" class="custom-control-input" id="defaultLoginFormRemember">
                     <label class="custom-control-label" for="defaultLoginFormRemember">Remember me</label>
                 </div>
             </div>
             <div>
                 <!-- Forgot password -->
                 <a href="">Forgot password?</a>
             </div>
         </div>

         <!-- Sign in button -->
         <button class="btn btn-info btn-block my-4" type="submit">Sign in</button>

         <!-- Register -->
         <p>Not a member?
             <a href="">Register</a>
         </p>

         <!-- Social login -->
         <p>or sign in with:</p>

         <a href="#" class="mx-2" role="button"><i class="fab fa-facebook-f light-blue-text"></i></a>
         <a href="#" class="mx-2" role="button"><i class="fab fa-twitter light-blue-text"></i></a>
         <a href="#" class="mx-2" role="button"><i class="fab fa-linkedin-in light-blue-text"></i></a>
         <a href="#" class="mx-2" role="button"><i class="fab fa-github light-blue-text"></i></a>

     </form>
     <!-- Default form login -->
 </div>
</body>
</html>
