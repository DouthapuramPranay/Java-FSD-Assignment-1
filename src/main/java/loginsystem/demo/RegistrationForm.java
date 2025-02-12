package loginsystem.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class RegistrationForm
 */
@WebServlet("/RegistrationForm")
public class RegistrationForm extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public RegistrationForm() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().write("""
            <html>
            <head>
                <title>Student Registration Form</title>
                <style>
                    body { 
                        font-family: Arial, sans-serif; 
                        background-image: url('background.jpg'); 
                        background-size: cover; 
                        background-repeat: no-repeat; 
                        display: flex; 
                        justify-content: center; 
                        align-items: center; 
                        height: 100vh; 
                        margin: 0; 
                        color: #fff;
                    }
                    .form-container {
                        width: 400px;
                        padding: 30px;
                        background-color: rgba(0, 0, 0, 0.8);
                        box-shadow: 0px 0px 15px 0px #000;
                        border-radius: 10px;
                        animation: fadeIn 1s ease-in-out;
                    }
                    .form-container input,
                    .form-container textarea,
                    .form-container select {
                        width: 100%;
                        padding: 10px;
                        margin: 10px 0;
                        border: 1px solid #ccc;
                        border-radius: 5px;
                        box-sizing: border-box;
                        background-color: rgba(255, 255, 255, 0.1);
                        color: #fff;
                    }
                    .form-container input[type='submit'] {
                        background-color: #4CAF50;
                        color: white;
                        border: none;
                        cursor: pointer;
                        transition: background-color 0.3s ease;
                        border-radius: 5px;
                    }
                    .form-container input[type='submit']:hover {
                        background-color: #45a049;
                    }
                    .form-heading {
                        text-align: center;
                        font-size: 28px;
                        margin-bottom: 20px;
                        color: #4CAF50;
                    }
                    .form-label {
                        font-size: 16px;
                        margin-bottom: 5px;
                    }
                    @keyframes fadeIn { 
                        from { opacity: 0; } 
                        to { opacity: 1; }
                    }
                </style>
            </head>
            <body>
                <div class="form-container">
                    <div class="form-heading">Student Registration Form</div>
                    <form method='post' action='RegistrationForm'>
                        <div class="form-label">Full Name:</div>
                        <input type='text' id='fullname' name='fullname' required/><br/>
                        <div class="form-label">Email:</div>
                        <input type='email' id='email' name='email' required/><br/>
                        <div class="form-label">Password:</div>
                        <input type='password' id='password' name='password' required/><br/>
                        <div class="form-label">Gender:</div>
                        <select id='gender' name='gender' required>
                            <option value=''>Select</option>
                            <option value='male'>Male</option>
                            <option value='female'>Female</option>
                            <option value='other'>Other</option>
                        </select><br/>
                        <div class="form-label">Address:</div>
                        <textarea id='address' name='address' required></textarea><br/>
                        <input type='submit' value='Register'/>
                    </form>
                </div>
            </body>
            </html>
        """);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fullname = request.getParameter("fullname");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String gender = request.getParameter("gender");
        String address = request.getParameter("address");

        // Store user details in session
        request.getSession().setAttribute("fullname", fullname);
        request.getSession().setAttribute("email", email);
        request.getSession().setAttribute("password", password);
        request.getSession().setAttribute("gender", gender);
        request.getSession().setAttribute("address", address);

        response.setContentType("text/html");
        response.getWriter().write("""
            <body>
                <h2>Registration Successful!</h2>
                <a href="login.jsp">Go to Login</a>
            </body>
        """);
    }
}

