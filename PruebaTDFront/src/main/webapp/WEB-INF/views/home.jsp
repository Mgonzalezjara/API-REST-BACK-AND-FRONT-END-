<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
 <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BikeShop Catalog y Inventory TD</title>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
    <link rel="stylesheet">
</head>
<body>
	<div class="container">
		<h1>Monitor de inventario</h1>
		<br>
		<div>
			<form:form action="/listar" method="POST" modelAttribute="BusquedaDTO">
				<div class="form-group row col-12">
				
				
				  <div class="form-group row col-3">
				  
			      	 <p class="text-muted">Stores  </p>
			      	 <br>
			      	 
			     	 <select  name="storeName" class="form-control">
			     	 	<c:forEach items="${stores}" var="stores">
			     	 		<option class="col-6" value="${stores.storeName}"><c:out value="${stores.storeName}"></c:out></option>
			     	 	</c:forEach>
					 </select>
				  </div>
				  
				    <div class="form-group row col-3 mr-1">
			      	 <p class="text-muted">Categorias  </p>
			      	 <br>
			     	 <select name="productId" class="form-control">
			     	 	<c:forEach items="${productos}" var="productos">
			     	 		<option class="col-6" value="${productos.productId}"><c:out value="${productos.productId}"></c:out></option>
			     	 	</c:forEach>
					 </select>
				  </div>
				  
				  <div class="form-group row col-3 mr-1">
			      	 <p class="text-muted">Marca  </p>
			      	 <br>
			     	 <select name="brandId" class="form-control">
			     	 	<c:forEach items="${brand}" var="brand">
			     	 		<option class="col-6" value="${brand.brandId}"><c:out value="${brand.brandId}"></c:out></option>
			     	 	</c:forEach>
					 </select>
				  </div>
				
				</div>
			  <br>
			  <div class="form-group row">
				 <div >
					 <button type="submit" class="btn btn-primary">Buscar</button>
				 </div>
			  </div>
		   </form:form>
		</div>
		<br>

	</div>
	
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-u1OknCvxWvY5kfmNBILK2hRnQC3Pr17a+RTT6rIHI7NnikvbZlHgTPOOmMi466C8" crossorigin="anonymous"></script>
  
</body>
</html>