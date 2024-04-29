<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="utilities.Utilities"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/Register.css">
<title>Add Admin</title>
</head>
<style>
body {
	margin: 0;
	padding: 0;
	background-color: #1d2634;
	color: #9e9ea4;
	font-family: "Montserrat", sans-serif;
}
</style>
<body>
	<div class="conatainer">
	<div class="card">
	<div class="message-container">
		<%
		if (request.getAttribute("errorMessage") != null) {
		%>
		<div class="error-message"><%=request.getAttribute("errorMessage")%></div>
		<%
		} else if (request.getAttribute("successMessage") != null) {
		%>
		<div class="success-message"><%=request.getAttribute("successMessage")%></div>
		<%
		}
		%>
	</div>

	<form method="post"
		action="${pageContext.request.contextPath}/AdminRegister"
		enctype="multipart/form-data">
		<h2 class="register">Register</h2>
		<p id="passwordError"></p>
		<input type="text" placeholder="Username" autocomplete="username"
			name="user_name"> <input type="password" minlength="8"
			id="password" placeholder="Password" autocomplete="new-password"
			oninput="checkPasswords()" name="password"> <input
			type="password" minlength="8" id="confirmPassword"
			placeholder="Confirm Password" oninput="checkPasswords()"> <input
			type="text" id="fullName" placeholder="Full Name" name="full_name">
		<input type="email" id="email" placeholder="Email Account"
			name="email"> <input type="text" id="account_type"
			value="Admin" name="account_type" hidden> <input type="tel"
			id="phoneNumber" placeholder="Phone Number" name="phone_Num">
		<input type="file" name="image" placeholder="Profile Picture">
		<button class="tombol-register" type="submit" id="registerButton"
			disabled>Register</button>
	</form>
	</div>
	</div>
</body>
<script src="${pageContext.request.contextPath}/js/Register.js"></script>

</html>