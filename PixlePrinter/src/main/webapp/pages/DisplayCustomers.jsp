<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="models.UserModel" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/DisplayUsers.css"> 
    <title>Display Customers</title>
</head>
<body>
    <h1>Customer Details</h1>
    <table>
        <thead>
            <tr>
                <th>Username</th>
                <th>Full Name</th>
                <th>Email</th>
                <th>Phone Number</th>
                <th>Profile Picture</th>
            </tr>
        </thead>
        <tbody>
            <% 
            List<UserModel> userDetails = (List<UserModel>) request.getAttribute("userDetails");
            if (userDetails != null) {
                for (UserModel user : userDetails) {
            %>
            <tr>
                <td><%= user.getUserName() %></td>
                <td><%= user.getFullName() %></td>
                <td><%= user.getEmail() %></td>
                <td><%= user.getPhoneNumber() %></td>
                <td><img src="${pageContext.request.contextPath}/Uploads/ProfilePicture/<%= user.getProfilePicture() %>" alt="Profile Picture"></td>
            </tr>
            <% 
                }
            } else {
            %>
            <tr>
                <td colspan="5">No customer details found.</td>
            </tr>
            <% } %>
        </tbody>
    </table>
</body>
</html>
