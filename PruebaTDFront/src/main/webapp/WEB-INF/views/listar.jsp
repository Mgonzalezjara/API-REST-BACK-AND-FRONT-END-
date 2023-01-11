<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
 <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Flix Prime</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>

<div class="container">
	
		<h1 class="py-3 px-1">Listado de películas</h1>
		<br>
	

		<div class="container">		
			
			<table class="table">
				<thead class="thead-light">
					<tr>
						<th scope="col">ID Producto</th>
										
					</tr>
				</thead>
				<tbody>
					<c:forEach var="categorias" items="${categorias}">
					<tr>
						<td>${categorias.productId}</td>	
						
							
					</tr>
					</c:forEach>
				</tbody>
			</table>
		
		</div>
	</div>

</body>
</html>