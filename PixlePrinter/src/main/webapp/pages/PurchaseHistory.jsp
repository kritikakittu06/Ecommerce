<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="models.PurchaseModel" %>
<html>
<head>
    <title>Purchase History</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }
        h1 {
            text-align: center;
        }
        table {
            width: 100%;
            border-collapse: collapse;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
        img {
            max-width: 100px;
            max-height: 100px;
        }
    </style>
</head>
<body>
    <h1>Purchase History</h1>
    <table>
        <tr>
            <th>Purchase ID</th>
            <th>Date and Time</th>
            <th>Product Name</th>
            <th>Quantity</th>
            <th>Total Amount</th>
            <th>Product Image</th>
        </tr>
        <% for (PurchaseModel purchase : purchaseHistory) { %>
            <tr>
                <td><%= purchase.getPurchaseId() %></td>
                <td><%= purchase.getDateTime() %></td>
                <td><%= purchase.getProductName() %></td>
                <td><%= purchase.getQuantity() %></td>
                <td><%= purchase.getTotalAmount() %></td>
                <td><img src="<%= purchase.getProductImage() %>" alt="<%= purchase.getProductName() %>"></td>
            </tr>
        <% } %>
    </table>
</body>
</html>
