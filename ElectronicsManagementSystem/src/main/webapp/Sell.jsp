<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Electronics Management</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet" />
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css" />
</head>
<body>
	<nav class="navbar bg-primary">
		<label for="Brand" class="navbar-brand"> Electronics Management
			System </label>
	</nav>
	<br />
	<br />

	<div class="container">
		<form action="ProductServlet" method="get">
			<input type="hidden" name="command" value="Sell" /> 
			<div class="row">
          <div class="col-3">
            <label for="Product_id">Product_id:</label>
          </div>
          <div class="col-3">
            <input
              type="text"
              id="Product_id"
              name="Product_id"
              class="form-control"
              required
            />
          </div>
        </div>
        <br />
        <div class="row">
          <div class="col-3">
            <label for="Product_name">Product_name:</label>
          </div>
          <div class="col-3">
            <input
              type="text"
              id="Product_name"
              name="Product_name"
              class="form-control"
              required
            />
          </div>
        </div>
        <br />
        <div class="row">
          <div class="col-3">
            <label for="Brand">Brand:</label>
          </div>
          <div class="col-3">
            <input type="text" id="Brand" name="Brand" class="form-control" required/>
          </div>
        </div>
        <br />
        <div class="row">
          <div class="col-3">
            <label for="e">Category:</label>
          </div>
          <div class="col-3">
            <input
              type="text"
              id="Category"
              name="Category"
              class="form-control"
              required
            />
          </div>
        </div>
        <br />
        <div class="row">
          <div class="col-3">
            <label for="Price">Price:</label>
          </div>
          <div class="col-3">
            <input
              type="text"
              id="Price"
              name="Price"
              class="form-control"
              required
            />
          </div>
        </div>
        <br />
        <div class="row mt-3">
          <div class="col-6">
            <input type="submit" value="Submit" class="btn btn-primary" />
          </div>
        </div>
		</form>
		
		<br>
		<a href="ProductServlet">Back to list</a>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>