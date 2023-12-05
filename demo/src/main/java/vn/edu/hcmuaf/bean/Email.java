package vn.edu.hcmuaf.bean;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class Email {
    static final String from = "21130549@st.hcmuaf.edu.vn";
    static final String pass = "rhxjighqfgfslhqf";

    public static void main(String[] args) {

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        Authenticator auth = new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, pass);
            }
        };

        Session session = Session.getInstance(props, auth);

        final String to = "thinh913011@gmail.com";
//        final String to = "21130604@st.hcmuaf.edu.vn";

        MimeMessage message = new MimeMessage(session);
        try {
            message.addHeader("Content-type", "text/HTML; charset=UTF-8");
            message.setFrom(new InternetAddress(from));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to, false));
            message.setSubject("Thử nghiệm gửi mail");
            message.setText("<!DOCTYPE html>" +
                            "<html>"+
                            "<head>"+
                            "<title>Title</title>" +
                            "</head>" +
                            "<body>" +
                            "<h1>Gửi mail</h1>" +
                            "<p>Hãy nhấp vào liên kết để có tiền:</p>" +
                            "</body>" + "</html>");

            Transport.send(message);
            System.out.println("Đã gửi thành công");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}