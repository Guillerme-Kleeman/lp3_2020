<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>${ titulo } Nota</title>
		<link href="/webjars/bootstrap/4.5.0/css/bootstrap.min.css" rel="stylesheet" />
		<script src="/webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
	</head>
	<body>
		<div class="container">
			<form:form action="guardar" method="post" modelAttribute="noticia">
				<h3>${ titulo } Nota  </h3>
				
				<form:input type="hidden" path="id" class="form-control"/>
				
				<label>Titulo</label>
				<form:input type="text" path="titulo" placeholder="Ingrese el titulo de la nota" class="form-control"/><br>
				
				<label>Fecha</label>
				<form:input type="date" path="fecha" placeholder="Ingrese el titulo de la nota" class="form-control"/><br>
				
				<label>Categoria</label>
				<form:select path="categoria" id="categoria" class="form-control">
					 <form:options items="${categorias}" itemLabel="nombre" itemValue="id"/>
				</form:select><br>
				
				<label>Contenido</label>
				<form:textarea rows="5" cols="80" path="contenido" placeholder="Ingrese el contenido de su nota"  class="form-control"/><br>
				
				<button type="submit" class="btn btn-secondary">Enviar </button> 
			</form:form>
		</div>
	</body>
</html>