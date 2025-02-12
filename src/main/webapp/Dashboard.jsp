<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Dashboard</title>
    <style>
        body { 
            font-family: Arial, sans-serif; 
            background-image: url('dashboard-bg.jpg'); 
            background-size: cover; 
            background-repeat: no-repeat; 
            display: flex; 
            justify-content: center; 
            align-items: center; 
            height: 100vh; 
            margin: 0; 
            color: #fff;
        }
        .dashboard { 
            text-align: center; 
            padding: 30px; 
            background-color: rgba(0, 0, 0, 0.7); 
            box-shadow: 0px 0px 20px 0px #000; 
            border-radius: 10px; 
            width: 400px; 
            animation: fadeIn 1s ease-in-out;
        }
        .dashboard h2 { 
            color: #4CAF50; 
            font-size: 24px; 
        }
        .dashboard p { 
            color: #ccc; 
            font-size: 18px; 
            margin: 5px 0;
        }
        .logout-button { 
            margin-top: 20px; 
            background-color: #4CAF50; 
            color: white; 
            border: none; 
            padding: 10px; 
            cursor: pointer; 
            text-decoration: none; 
            font-size: 16px;
            border-radius: 5px;
        }
        .logout-button:hover { 
            background-color: #45a049;
        }
        @keyframes fadeIn { 
            from { opacity: 0; } 
            to { opacity: 1; }
        }
        .details {
            display: flex;
            justify-content: space-between;
            margin-bottom: 10px;
            border-bottom: 1px solid #555;
            padding-bottom: 5px;
        }
        .details span {
            flex: 1;
            text-align: left;
            padding: 5px;
            font-weight: bold;
        }
        .details span:nth-child(2) {
            text-align: right;
            font-weight: normal;
        }
    </style>
</head>
<body>
    <div class="dashboard">
        <h2>Welcome, <%= request.getSession().getAttribute("fullname") %>!</h2>
        <div class="details">
            <span>Email:</span> <span><%= request.getSession().getAttribute("email") %></span>
        </div>
        <div class="details">
            <span>Date of Birth:</span> <span><%= request.getSession().getAttribute("dob") %></span>
        </div>
        <div class="details">
            <span>Gender:</span> <span><%= request.getSession().getAttribute("gender") %></span>
        </div>
        <div class="details">
            <span>Address:</span> <span><%= request.getSession().getAttribute("address") %></span>
        </div>
        <form action="LogoutServlet" method="post">
            <button class="logout-button" type="submit">Logout</button>
        </form>
    </div>
</body>
</html>
