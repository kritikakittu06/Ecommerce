<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="utilities.Utilities" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<link rel="icon"
	href="${pageContext.request.contextPath}/Images/pixelprinter-high-resolution-logo.png"
	type="image/png">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Include common CSS files -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/Style.css" />
<!-- Dynamic title -->
<title><%=request.getAttribute(Utilities.Home_Page_Title)%></title>
</head>
<body>
	<section id="header" class="header">
		<a href="${pageContext.request.contextPath}/pages/Index.jsp"><img
			src="${pageContext.request.contextPath}/Images/logo.png" class="logo"
			style="width: 120px; height: auto;" alt=""></a>
		<nav class="navbar">
			<a class="active"
				href="${pageContext.request.contextPath}/pages/Index.jsp">Home</a> <a
				href="${pageContext.request.contextPath}/pages/product.jsp">Product</a>
			<a href="${pageContext.request.contextPath}/pages.jsp">About Us</a> <a
				href="${pageContext.request.contextPath}/pages/Login.jsp">Login</a>
		</nav>
		<div class="icons">
			<div id="menu-btn" class="fas fa-bars"></div>
			<a href="#" class="fas fa-user-circle"></a> <a href="#"
				class="fas fa-search"></a> <a href="#" class="fas fa-heart"></a>
		</div>
	</section>
	<!-- Main content -->
	<div class="main">
		<div class="container">
			<!-- This is where the content of other JSP files will be included -->
			<div id="content">
				<%-- This is a placeholder for the content of other JSP files --%>
				<%-- Other JSP files will include this file and add their content here --%>
			</div>
		</div>
	</div>
	<!-- Footer section -->
	<div class="footer">
		<div class="container">
			<div class="row">
				<div class="footer-col1">
					<h3>Download Our App</h3>
					<p>Download App for Android and IOS mobile phones</p>
					<div class="app-logo">
						<img src="${pageContext.request.contextPath}/Images/app-store.png"
							alt=""> <img
							src="${pageContext.request.contextPath}/Images/play-store.png"
							alt="">
					</div>
				</div>
				<div class="footer-col2">
					<img
						src="${pageContext.request.contextPath}/Images/pixelprinter-high-resolution-logo.png"
						width="160px" alt="" />
					<p>
						<strong>Our purpose is your satisfaction and happiness</strong>
					</p>
				</div>
				<div class="footer-col3">
					<h3>Useful links</h3>
					<ul type="none">
						<li>Coupons</li>
						<li class="blog-link"><a
							href="${pageContext.request.contextPath}/Html/blog.jsp"
							style="color: #8a8a8a;">Blog Post</a></li>
						<li>Return Policy</li>
					</ul>
				</div>
				<div class="footer-col4">
					<h3>Follow Us</h3>
					<i class='bx bxl-youtube'>Youtube</i><br> <i
						class='bx bxl-instagram'>Instagram</i><br> <i
						class='bx bxl-facebook-circle'>Facebook</i>
				</div>
			</div>
			<hr />
			<p class="copyright">&copy; All rights reserved- Pixel Printer</p>
		</div>
	</div>
</body>
</html>
