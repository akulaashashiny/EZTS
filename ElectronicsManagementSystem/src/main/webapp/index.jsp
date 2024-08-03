<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import = "java.util.* ,com.Product.jdbc.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Document</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet" />
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
</head>
<body>
	<% List<SettersGetters> theProduct = (List<SettersGetters>)request.getAttribute("Product_list"); %>
	
	<nav class="navbar bg-primary">
		<label for="Brand" class="navbar-brand"> Electronics Management
			System </label>
	</nav>
	<br>
	<br>
	<div class="container">
	<div class="row">
        <div class="col-9">
          <h1>Products Data</h1>
        </div>
        <div class="col-3">
          <input type="button" value="sell" onclick="window.location.href='Sell.jsp'">
        </div>
      </div>
		<table class="table table-bordered">
			<thead class="thead-dark ">
				<tr>
					<th>Product_id</th>
					<th>Product_name</th>
					<th>Brand</th>
					<th>Category</th>
					<th>Price</th>
					<th>Action</th>
				</tr>
			</thead>
			<% for (SettersGetters STD : theProduct ) { %>
			<tr>
			<td><%=STD.getProduct_id()%></td>
			<td><%=STD.getProduct_name()%></td>
			<td><%=STD.getBrand()%></td>
			<td><%=STD.getCategory()%></td>
			<td><%=STD.getPrice()%></td>	
				<td>
					<button class="btn btn-warning">
						Sell
					</button>
				</td>
			</tr>
			<% }%>
		</table>
	</div>




	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>