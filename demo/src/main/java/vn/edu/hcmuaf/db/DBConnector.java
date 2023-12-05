package vn.edu.hcmuaf.db;

import java.sql.*;

public class DBConnector {
    String url = "jdbc:mysql://localhost:3306/db";
    String username = "root"; // Thay đổi "ASUS" thành tên người dùng của bạn
    String password = "thinh3011"; // Thay đổi "mat_khau" thành mật khẩu của bạn

    Connection con= null;
    static DBConnector install;
    private DBConnector()throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static DBConnector getInstall() throws SQLException {
        if (install == null) install = new DBConnector();
        return install;
    }
    public Statement get(){
        if (con==null)return null;
        try {
           return con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException e) {
            return null;
        }
    }

    public static void main(String[] args) throws SQLException {
        Statement statement = DBConnector.getInstall().get();
        if (statement!= null)
            try {
                ResultSet rs = statement.executeQuery("select  * from users");
                rs.last();
                System.out.println(rs.getRow());
                rs.beforeFirst();
                while (rs.next()){
                    System.out.println(rs.getString(1)+ "---"+rs.getString(2));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        else{
            System.out.println("Không có kết quả");
        }
    }
}
