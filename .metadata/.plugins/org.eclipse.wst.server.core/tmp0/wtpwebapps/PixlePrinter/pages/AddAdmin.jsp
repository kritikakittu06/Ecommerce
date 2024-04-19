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
<body>
	<form method="post"
		action="${pageContext.request.contextPath}/AdminRegister">
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
		<button class="tombol-register" type="submit" id="registerButton"
			disabled>Register</button>
	</form>
</body>
<script src="${pageContext.request.contextPath}/js/Register.js"></script>
</html>