<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="utilities.Utilities"%>
<%@ page import="java.util.List, models.BrandModel"%>
<!DOCTYPE html>
<html>
<head>
<title>Add Brand</title>
</head>
<body>
	<div class="message-from-backend">
		<%
		if (request.getAttribute(Utilities.SUCCESS_MESSAGE) != null) {
		%>
		<div class="alert alert-success" role="alert">
			<%=request.getAttribute(Utilities.SUCCESS_MESSAGE)%>
		</div>
		<%
		} else if (request.getAttribute(Utilities.ERROR_MESSAGE) != null) {
		if (request.getAttribute(Utilities.ERROR_MESSAGE).equals(Utilities.INCORRECT_FORM_DATA_MESSAGE)) {
		%>
		<div class="alert alert-danger" role="alert">
			<%=request.getAttribute(Utilities.ERROR_MESSAGE)%>
		</div>
		<%
		} else if (request.getAttribute(Utilities.ERROR_MESSAGE).equals(Utilities.SERVER_ERROR_MESSAGE)) {
		%>
		<div class="alert alert-danger" role="alert">
			<%=request.getAttribute(Utilities.ERROR_MESSAGE)%>
		</div>
		<%
		}
		}
		%>
	</div>
	<h2>Add Brand</h2>
	<form action="${pageContext.request.contextPath}/AddBrand"
		method="post">
		<label for="companyName">Company Name:</label><br> <input
			type="text" id="companyName" name="company_name" required><br>
		<br> <input type="submit" value="Add Brand">
	</form>
	<div class="show-brands">
		<h1>List of Brands</h1>
		<ul>
			<%
			Object obj = request.getAttribute("brands");
			if (obj instanceof List) {
				List<BrandModel> brands = (List<BrandModel>) obj;
				if (!brands.isEmpty()) {
					for (BrandModel brand : brands) {
			%>
			<li><%=brand.getCompanyName()%></li>
			<%
			}
			} else {
			%>
			<li>No records found</li>
			<%
			}
			} else {
			%>
			<li>No records found</li>
			<%
}
%>

		</ul>
	</div>
</body>
</html>