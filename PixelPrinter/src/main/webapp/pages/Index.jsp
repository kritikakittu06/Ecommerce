<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Printer Design </title>


    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">


   <link rel="stylesheet" href="${pageContext.request.contextPath}/stylesheet/style.css" />

</head>
<body>


<section id="header" class="header">
    <a href="#"><img src="${pageContext.request.contextPath}/Images/product/pixel-removebg-preview.png" class="logo" style="width: 120px; height: auto;"></a>
<nav class="navbar">
    <a class="active" href="${pageContext.request.contextPath}/pages/index.jsp">Home</a>
    <a href="${pageContext.request.contextPath}/pages/product.jsp">Product</a>
	<a href="${pageContext.request.contextPath}/pages.jsp">About Us</a>
	<a href="${pageContext.request.contextPath}/Login.jsp">Login</a>
</nav>

<div class="icons">
    <div id="menu-btn" class="fas fa-bars"></div>
    <a href="#" class="fas fa-user-circle"></a>
    <a href="#" class="fas fa-search"></a>
    <a href="#" class="fas fa-heart"></a>
</div>
    </section>
    
    <!-- Main Content -->
    <div class="main">
      <div class="container">
        <div class="row">
          <!-- Text and image content -->
          <div class="col2">
            <h1>
              Best Printers for you <br />
              Shop with us
            </h1>
            <p>
              Now make your office and academic work easier and convenient by connecting with us!
            </p>
            <br />
            <a href="${pageContext.request.contextPath}/Html/product.jsp" class="btn">Explore Now &#8594;</a>
          </div>
          <div class="col2">
            <img src="${pageContext.request.contextPath}/Images/Untitled design.png" />
          </div>
        </div>
      </div>
    </div>
    
    <!-- Featured Categories -->
    <div class="categories">
      <div class="small-container">
        <div class="row">
          <!-- Images for featured categories -->
          <div class="col3">
            <img src="${pageContext.request.contextPath}/Images/Product3.jpg" />
          </div>
          <div class="col3">
            <img src="${pageContext.request.contextPath}/Images/Product1.jpg" />
          </div>
          <div class="col3">
            <img src="${pageContext.request.contextPath}/Images/Product4.jpg" />
          </div>
        </div>
      </div>
    </div>
   
    <!-- Offer Section -->
    <div class="offer">
      <div class="small-container">
        <div class="row">
          <!-- Offer details and image -->
          <div class="col2">
            <img src="${pageContext.request.contextPath}/Images/Canon_All_in_one.jpg" class="offer Image" />
          </div>
          <div class="col2">
            <p>Exclusively available on Printer Hub</p>
            <h1>Canon all in One Printer</h1>
            <small>The Canon All in One Printer has all the function you need. It can print paper at the best quality and can also scan the documents you need</small>
            <br />
            <br />
            <a href="${pageContext.request.contextPath}/Html/CanonAllInOne.jsp" class="btn">Buy Now &#8594;</a>
          </div>
        </div>
      </div>
    </div>

    <!-- Footer Section -->
    <div class="footer">
      <div class="container">
        <div class="row">
          <!-- App download, company info, useful links, and social media -->
          <div class="footer-col1">
            <h3>Download Our App</h3>
            <p>Download App for Android and IOS mobile phones</p>
            <div class="app-logo">
              <img src="${pageContext.request.contextPath}/Images/app-store.png" alt="">
              <img src="${pageContext.request.contextPath}/Images/play-store.png" alt="">
            </div>
          </div>
          <div class="footer-col2">
            <img src="${pageContext.request.contextPath}/Images/pixelprinter-high-resolution-logo.png" width="160px" />
            <p><strong>Our purpose is your satisfaction and happiness</strong></p>
          </div>
          <div class="footer-col3">
            <!-- Useful links -->
            <h3>Useful links</h3>
            <ul type="none">
              <li>Coupons</li>
              <li class="blog-link"><a href="${pageContext.request.contextPath}/Html/blog.jsp" style="color: #8a8a8a;">Blog Post</a></li>
              <li>Return Policy</li>
            </ul>
          </div>
          <div class="footer-col4">
            <!-- Social media links -->
            <h3>Follow Us</h3>
            <i class='bx bxl-youtube' >Youtube</i><br>
            <i class='bx bxl-instagram' >Instagram</i><br>
            <i class='bx bxl-facebook-circle'>Facebook</i>
          </div>
        </div>
        <!-- Copyright Section -->
        <hr />
        <p class="copyright"> &copy; All rights reserved- Pixel Printer</p>
      </div>
    </div>
  </body>
</html>