<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="utilities.Utilities" %>
<!DOCTYPE html>
<html>
<head>
	<link rel="icon" href="${pageContext.request.contextPath}/Images/pixelprinter-high-resolution-logo.png" type="image/png">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/Register.css">
    <title>Register</title>
</head>
<body background="${pageContext.request.contextPath}/Images/RegBg.png">
    <div class="container">
        <div class="card">
            <form method="post" action="${pageContext.request.contextPath}/UserRegister" enctype="multipart/form-data">
                <h2 class="register">Register</h2>
                <p id="passwordError"></p>
                <input type="text" placeholder="Username" autocomplete="username" name="user_name">
                <input type="password" minlength="8" id="password" placeholder="Password" autocomplete="new-password" oninput="checkPasswords()" name="password">
                <input type="password" minlength="8" id="confirmPassword" placeholder="Confirm Password" oninput="checkPasswords()"> 
                <input type="text" id="fullName" placeholder="Full Name" name="full_name">
                <input type="email" id="email" placeholder="Email Account" name="email">
                <input type="tel" id="phoneNumber" placeholder="Phone Number" name="phone_Num">
                <input type="file" id="profilePicture" placeholder="Profile Picture" name="image">
                <button class="tombol-register" type="submit" id="registerButton" disabled>Register</button>
            </form>
            <div class="switch">
                <h5>Already have an account?</h5>
                <a href="${pageContext.request.contextPath}/pages/Login.jsp">Login</a>
            </div>
    <% if (request.getAttribute(Utilities.SUCCESS_MESSAGE) != null) { %>
        <p class="successMessage"><%= request.getAttribute(Utilities.SUCCESS_MESSAGE) %></p>
    <% } else if (request.getAttribute(Utilities.ERROR_MESSAGE) != null) { %>
        <p class="errorMessage"><%= request.getAttribute(Utilities.ERROR_MESSAGE) %></p>
    <%} %>
        </div>
    </div>
    <script src="${pageContext.request.contextPath}/js/Register.js"></script>

</body>
</html>
