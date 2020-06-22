<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>${ titulo } Categoria</title>
		<link href="/webjars/bootstrap/4.5.0/css/bootstrap.min.css" rel="stylesheet" />
		<script src="/webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
	</head>
	<body>
		<div class="container">
			<form:form action="guardar" method="post" modelAttribute="categoria">
				<h3>${ titulo } Categoria  </h3>
				
				<form:input type="hidden" path="id" class="form-control"/>
				
				<label>Nombre</label>
				<form:input type="text" path="nombre" placeholder="Ingrese el nombre de la categoria" class="form-control"/><br>
				
				<button type="submit" class="btn btn-secondary">Enviar </button> 
			</form:form>
		</div>
	</body>
</html>