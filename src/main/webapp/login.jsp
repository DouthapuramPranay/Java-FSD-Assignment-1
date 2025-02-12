<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
    <style>
        body { 
            font-family: Arial, sans-serif; 
            background-color: #f2f2f2; 
            display: flex; 
            justify-content: center; 
            align-items: center; 
            height: 100vh; 
            margin: 0;
        }
        .login-container { 
            background-color: #fff; 
            padding: 20px; 
            box-shadow: 0px 0px 10px 0px #000; 
            border-radius: 8px; 
            width: 300px;
            text-align: center;
        }
        .login-container input {
            width: 100%; 
            padding: 10px; 
            margin: 10px 0; 
            border: 1px solid #ccc; 
            border-radius: 4px;
            box-sizing: border-box;
        }
        .login-container input[type="submit"] {
            background-color: #4CAF50; 
            color: white; 
            border: none; 
            cursor: pointer;
        }
        .login-container input[type="submit"]:hover {
            background-color: #45a049;
        }
        .login-container h2 {
            margin-bottom: 20px;
        }
    </style>
</head>
<body>
    <div class="login-container">
        <h2>Login</h2>
        <form method="post" action="LoginServlet">
            <input type="email" id="email" name="email" placeholder="Email" required/><br/>
            <input type="password" id="password" name="password" placeholder="Password" required/><br/>
            <input type="submit" value="Login"/>
        </form>
    </div>
</body>
</html>
