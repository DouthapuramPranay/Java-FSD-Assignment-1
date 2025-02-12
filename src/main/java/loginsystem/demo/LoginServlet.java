package loginsystem.demo;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String storedEmail = (String) request.getSession().getAttribute("email");
        String storedPassword = (String) request.getSession().getAttribute("password");

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        if (storedEmail != null && storedEmail.equals(email) && storedPassword != null && storedPassword.equals(password)) {
            response.sendRedirect("Dashboard.jsp");
        } else {
            response.setContentType("text/html");
            response.getWriter().write("""
                <body>
                    <h2>Login Failed!</h2>
                    <a href="login.jsp">Try Again</a>
                </body>
            """);
        }
    }
}
