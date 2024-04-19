<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="utilities.Utilities"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add To Cart</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/Cart.css">
<script src="https://kit.fontawesome.com/11d376cef2.js" crossorigin="anonymous"></script>
</head>
<body>
	<div class ="header">
		<p class = "logo">Pixel Printer</p>
		<div class="cart"><i class="fa-solid fa-cart-shopping"></i><p id ="count">0</p></div>
	</div>
	<h1 style="text-align: left; padding-right: 250px; font-size: 28px;">Best Seller</h1>
	<div class="container">
		<div id="root"></div>
		<div class="sidebar">
			<div class="head"><p>My Cart</p></div>
			<div id="cartItem">Your cart is empty</div>
			<div class = "foot" style="margin-top: 400px;">
				<h1>Total</h1>
				<h2 id ="total">$0.00</h2>
				<button onclick="checkout()">Checkout</button>
			</div>
		</div>
	</div>
	<script src ="${pageContext.request.contextPath}/js/Cart.js"></script>
</body>
</html>