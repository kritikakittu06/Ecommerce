<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="utilities.Utilities"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Contact Us</title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/Contact.css" />
</head>
<body>
	<section id="header" class="header">
		<a href="#"><img
			src="${pageContext.request.contextPath}/Images/logo.png" class="logo"
			style="width: 120px; height: auto;"></a>
		<nav class="navbar">
			<a class="active"
				href="${pageContext.request.contextPath}/pages/Index.jsp">Home</a> <a
				href="${pageContext.request.contextPath}/pages/product.jsp">Product</a>
			<a href="${pageContext.request.contextPath}/pages/Contact.jsp">About
				Us</a> <a href="${pageContext.request.contextPath}/Login.jsp">Login</a>
		</nav>
		<div class="icons">
			<div id="menu-btn" class="fas fa-bars"></div>
			<a href="#" class="fas fa-user-circle"></a> <a href="#"
				class="fas fa-search"></a> <a href="#" class="fas fa-heart"></a>
		</div>
	</section>
	<br>
	<br>
	<div class="message-from-backend">
		<% if (session.getAttribute(Utilities.Successfully_Stored_Message) != null) { %>
		<div class="alert alert-success" role="alert">
			<%= session.getAttribute(Utilities.Successfully_Stored_Message) %>
		</div>
		<% } else if (request.getAttribute(Utilities.ERROR_MESSAGE) != null) {
                  if (request.getAttribute(Utilities.ERROR_MESSAGE).equals(Utilities.INCORRECT_FORM_DATA_MESSAGE)) { %>
		<div class="alert alert-danger" role="alert">
			<%= request.getAttribute(Utilities.ERROR_MESSAGE) %>
		</div>
		<%   } else if (request.getAttribute(Utilities.ERROR_MESSAGE).equals(Utilities.SERVER_ERROR_MESSAGE)) { %>
		<div class="alert alert-danger" role="alert">
			<%= request.getAttribute(Utilities.ERROR_MESSAGE) %>
		</div>
		<%   }
                  } %>
	</div>
	<div class="container">
		<div class="content">
			<div class="left">
				<!-- Address Details -->
				<div class="address details">
					<i class="fas fa-map-marker-alt"></i>
					<div class="topic">Address</div>
					<div class="text-one">Dulari</div>
					<div class="text-two">sunsari</div>
				</div>
				<!-- Phone Details -->
				<div class="phone details">
					<i class="fas fa-phone-alt"></i>
					<div class="topic">Phone</div>
					<div class="text-one">(977) 9842630796</div>
				</div>
				<!-- Email Details -->
				<div class="email details">
					<i class="fas fa-envelope"></i>
					<div class="topic">Email</div>
					<div class="text-one">pixelPrinter123@gmail.com</div>
				</div>
			</div>
			<br> <br>
			<!-- Contact Form -->
			<div class="right">
				<div class="topic-text">Send us a message</div>
				<p >If you have any queries regarding our products or overall
					system, you can contact us here.</p>
				<form action="${pageContext.request.contextPath}/StoreContactUsMessage" method="post">
					<div class="input-box">
						<input name="name" type="text" id="name"
							placeholder="Enter your name" required>
					</div>
					<div class="input-box">
						<input name="email" type="text" id="email"
							placeholder="Enter your email" required>
					</div>
					<div class="input-box">
						<input type="tel" id="phoneNumber" placeholder="Phone Number"
							name="phone_Num">
					</div>
					<div class="input-box message-box">
						<textarea name="message" id="message"
							placeholder="write us a message" rows="4" cols="50" required></textarea>
					</div>
					<div class="button">
						<button type="submit">Send Now</button>
					</div>
				</form>
			</div>
		</div>
	</div>
	<section class="footer">
		<div class="box-container">
			<div class="box">
				<h3>quick links</h3>
				<a class="link" href="#home"> <i class="fas fa-angle-right"></i>
					home
				</a> <a class="link" href="#about"> <i class="fas fa-angle-right"></i>
					Blogs
				</a> <a class="link" href="#shop"> <i class="fas fa-angle-right"></i>
					Contact US
				</a> <a class="link" href="#gallery"> <i class="fas fa-angle-right"></i>
					About US
				</a> <a class="link" href="#message"> <i class="fas fa-angle-right"></i>
					Log In
				</a>
			</div>
			<div class="box">
				<h3>extra links</h3>
				<a class="link" href="#"> <i class="fas fa-angle-right"></i> my
					favorite
				</a> <a class="link" href="#"> <i class="fas fa-angle-right"></i> my
					order
				</a> <a class="link" href="#"> <i class="fas fa-angle-right"></i> my
					wish list
				</a> <a class="link" href="#"> <i class="fas fa-angle-right"></i>
					private policy
				</a> <a class="link" href="#"> <i class="fas fa-angle-right"></i>
					terms of use
				</a>
			</div>
			<div class="box">
				<h3>contact info</h3>
				<a class="link" href="#"> <i class="fas fa-phone"></i> +9779825908706
				</a> <a class="link" href="#"> <i class="fas fa-phone"></i> +977 9814961231
				</a> <a class="link" href="#"> <i class="fas fa-envelope"></i>
					pixelPrinter123@gmail.com
				</a> <a class="link" href="#"> <i class="fas fa-map"></i> Damak, Nepal - 401203
				</a>
				<div class="share">
					<a href="#" class="fab fa-facebook-f"></a> <a href="#"
						class="fab fa-twitter"></a> <a href="#" class="fab fa-instagram"></a>
					<a href="#" class="fab fa-linkedin"></a>
				</div>
			</div>
			<div class="box">
				<h3>newsletter</h3>
				<p>subscribe for latest updates</p>
				<form action="">
					<input type="email" name="" placeholder="enter your email" id=""
						class="email"> <input type="submit" value="subscribe"
						class="btn">
				</form>
			</div>
		</div>
		<div class="credit">
			created by <span>Pixel Printer</span> || all rights reserved!
		</div>
	</section>
</body>
</html>