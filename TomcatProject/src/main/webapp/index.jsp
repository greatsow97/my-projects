<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

  <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
 <link rel="stylesheet" href="css/indexstyle.css">

</head>
<body>

<div class="wrapper">

<form action="LoginServlet" method="post">
  <h1>Login</h1>
  
  <div class="input-box">
  <input type="text" id="fname" name="username" placeholder="username" required><i class='bx bxs-user'></i>
</div>
  
  
<div class="input-box">
  <input type="password" id="pwd" name="pwd" placeholder="password" required>
  <i class='bx bxs-lock-alt'></i>
  </div>
  
  
  <input type="submit" class="btn" value="login">
  
  <div class="register-link">
    <p>Don't have an account? <a href="#">Register</a></p>
  </div>
  
  <div>
<% if(request.getAttribute("errorMessage") !=null){ %>
  <p style= "color:red; font-weight:bold;"><%= request.getAttribute("errorMessage") %></p>
  
  <%} %>
  
  </div>
  
</form>
  
  </div>

</body>
</html>