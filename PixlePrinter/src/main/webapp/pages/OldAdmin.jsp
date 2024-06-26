<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
   <head>
      <meta charset="UTF-8" />
      <meta http-equiv="X-UA-Compatible" content="IE=edge" />
      <meta name="viewport" content="width=device-width, initial-scale=1.0" />
      <title>Admin Dashboard</title>
      <link
         href="https://fonts.googleapis.com/icon?family=Material+Icons+Sharp"
         rel="stylesheet" />
      <link rel="stylesheet"
         href="${pageContext.request.contextPath}/css/AdminHome.css" />
   </head>
   <body>
      <div class="container">
         <aside>
            <div class="top">
               <div class="logo">
                  <img src="${pageContext.request.contextPath}/Images/logo.png"
                     alt="" />
                  <h2 class="text-muted">PixlePrinters</h2>
               </div>
               <div class="close" id="btn-close">
                  <span class="material-icons-sharp"> close </span>
               </div>
            </div>
            <div class="sidebar">
               <a href="#">
                  <span class="material-icons-sharp">
                  dashboard </span>
                  <h3>Dashboard</h3>
               </a>
               <a href="#" class="actived">
                  <span class="material-icons-sharp">
                  person_outline </span>
                  <h3>Customers</h3>
               </a>
               <a href="#">
                  <span class="material-icons-sharp">
                  receipt_long </span>
                  <h3>Orders</h3>
               </a>
               <a href="#">
                  <span class="material-icons-sharp">
                  insights </span>
                  <h3>Analytics</h3>
               </a>
               <a href="#">
                  <span class="material-icons-sharp">
                  mail_outline </span>
                  <h3>Messagers</h3>
                  <span class="message-count">27</span> <!--yo chain ni messafe counter ho haii-->
               </a>
               <a href="${pageContext.request.contextPath}/DisplayProductServlet">
                  <span class="material-icons-sharp">
                  inventory </span>
                  <h3>Products</h3>
               </a>
               <a href="${pageContext.request.contextPath}/AddProductServlet">
                  <span class="material-icons-sharp"> add </span>
                  <h3>Add Product</h3>
               </a>
               <a href="${pageContext.request.contextPath}/pages/AddAdmin.jsp">
                  <span class="material-icons-sharp"> add </span>
                  <h3>Add Admin</h3>
                  </a>
                <a href="${pageContext.request.contextPath}/AddBrand">
                  <span class="material-icons-sharp"> add </span>
                  <h3>Add Brand</h3>
                  </a>  
               <a href="${pageContext.request.contextPath}/LogoutServlet">
                  <span class="material-icons-sharp"> logout </span>
                  <h3>Logoutt</h3>
               </a>
            </div>
         </aside>
         <main>
            <h1>Dashboard</h1>
            <div class="date">
               <input type="date" />
            </div>
            <div class="insights">
               <div class="sales">
                  <span class="material-icons-sharp">analytics</span>
                  <div class="middle">
                     <div class="left">
                        <h3>Total Sales</h3>
                        <h1>$25,024</h1>
                     </div>
                     <div class="progress">
                        <svg>
                           <circle cx="38" cy="38" r="36"
                              stroke-dashoffset="42.56" />
                        </svg>
                        <div class="number">
                           <p>81%</p>
                        </div>
                     </div>
                  </div>
                  <small class="text-muted">Last 24 Hours</small>
               </div>
               <!---------  END OF SALES   --------->
               <div class="expenses">
                  <span class="material-icons-sharp">bar_chart</span>
                  <div class="middle">
                     <div class="left">
                        <h3>Total Expenses</h3>
                        <h1>$27,174</h1>
                     </div>
                     <div class="progress">
                        <svg>
                           <circle cx="38" cy="38" r="36"
                              stroke-dashoffset="85" />
                        </svg>
                        <div class="number">
                           <p>62%</p>
                        </div>
                     </div>
                  </div>
                  <small class="text-muted">Last 24 Hours</small>
               </div>
               <!---------  END OF EXPENSES   --------->
               <div class="income">
                  <span class="material-icons-sharp">stacked_line_chart</span>
                  <div class="middle">
                     <div class="left">
                        <h3>Total Income</h3>
                        <h1>$11,270</h1>
                     </div>
                     <div class="progress">
                        <svg>
                           <circle cx="38" cy="38" r="36"
                              stroke-dashoffset="125.44" />
                        </svg>
                        <div class="number">
                           <p>44%</p>
                        </div>
                     </div>
                  </div>
                  <small class="text-muted">Last 24 Hours</small>
               </div>
               <!---------  END OF INCOME   --------->
            </div>
            <!---------  END OF INSIGHTS   --------->
            <div class="recent-orders">
               <h2>Recent Orders</h2>
               <table>
                  <thead>
                     <tr>
                        <th>Product Name</th>
                        <th>Product Number</th>
                        <th>Payment</th>
                        <th>Status</th>
                        <th></th>
                     </tr>
                  </thead>
                  <tbody>
                     <tr>
                        <td>Iphone 12</td>
                        <td>23242526</td>
                        <td>Due</td>
                        <td class="warning">Pending</td>
                        <td class="primary">Details</td>
                     </tr>
                     <tr>
                        <td>Iphone 12</td>
                        <td>23242526</td>
                        <td>Due</td>
                        <td class="warning">Pending</td>
                        <td class="primary">Details</td>
                     </tr>
                  </tbody>
               </table>
               <a href="#">Show More</a>
            </div>
            <!---------  END OF RECENT ORDER   --------->
         </main>
         <!---------  END OF MAIN   --------->
         <div class="right">
            <div class="top">
               <button id="btn-menu">
               <span class="material-icons-sharp"> menu </span>
               </button>
               <div class="theme-toggler">
                  <span class="material-icons-sharp actived"> light_mode </span> <span
                     class="material-icons-sharp"> dark_mode </span>
               </div>
               <div class="profile">
                  <div class="info">
                     <p>
                        <% String username = (String) request.getSession().getAttribute("username"); %>
                        <% if (username != null) { %>
                        Hey, <b><%= username %></b>
                        <% } %>	
                     </p>
                     <div class="text-muted">Admin</div>
                  </div>
                  <div class="profile-photo">
                     <img src="${pageContext.request.contextPath}/Uploads/ProfilePicture/Wanem1.png"alt="Admin"/>
                  </div>
               </div>
            </div>
            <!---------  END OF TOP   --------->
            <div class="recent-updates">
               <h2>Recent Updates</h2>
               <div class="updates">
                  <div class="update">
                     <div class="profile-photo">
                        <img src="./images/001.png" alt="" />
                     </div>
                     <div class="message">
                        <p>
                           <b>Ramuh Lino</b> received his order of Night lion tech GPS
                           drobe.
                        </p>
                        <small>3 Minutes Ago</small>
                     </div>
                  </div>
                  <div class="update">
                     <div class="profile-photo">
                        <img src="./images/002.jpg" alt="" />
                     </div>
                     <div class="message">
                        <p>
                           <b>Ramuh Lino</b> received his order of Night lion tech GPS
                           drobe.
                        </p>
                        <small>3 Minutes Ago</small>
                     </div>
                  </div>
               </div>
            </div>
            <!---------  END OF RECENT-UPDATES  --------->
            <div class="sales-analytics">
               <h2>Sales Analytics</h2>
               <div class="item online">
                  <div class="icon">
                     <span class="material-icons-sharp"> shopping_cart </span>
                  </div>
                  <div class="right">
                     <div class="info">
                        <h3>ONLINE ORDERS</h3>
                        <small class="text-muted">Last 24 Hours</small>
                     </div>
                     <h5 class="success">+39%</h5>
                     <h3>3480</h3>
                  </div>
               </div>
               <div class="item offline">
                  <div class="icon">
                     <span class="material-icons-sharp"> local_mall </span>
                  </div>
                  <div class="right">
                     <div class="info">
                        <h3>OFFLINE ORDERS</h3>
                        <small class="text-muted">Last 24 Hours</small>
                     </div>
                     <h5 class="warning">+23%</h5>
                     <h3>1380</h3>
                  </div>
               </div>
               <div class="item customers">
                  <div class="icon">
                     <span class="material-icons-sharp"> person </span>
                  </div>
                  <div class="right">
                     <div class="info">
                        <h3>NEW CUSTOMERS</h3>
                        <small class="text-muted">Last 24 Hours</small>
                     </div>
                     <h5 class="success">+27%</h5>
                     <h3>1380</h3>
                  </div>
               </div>
               <div class="item add-product">
                  <span class="material-icons-sharp"> add </span>
                  <h3>Add Product</h3>
               </div>
            </div>
         </div>
      </div>
      <span class="aside-overview"></span>
      <script src="${pageContext.request.contextPath}/js/AdminHome.js"></script>
   </body>
</html>