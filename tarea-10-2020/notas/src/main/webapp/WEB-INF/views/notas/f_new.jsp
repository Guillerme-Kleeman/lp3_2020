<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nueva Nota</title>
<link href="/webjars/bootstrap/4.5.0/css/bootstrap.min.css" rel="stylesheet" />
<script src="/webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
<form action="nuevo" method="post" >
<h3>Crear Nota  </h3>
	<input type="hidden" name="id" value="0" class="form-control">
	<input type="text" name="titulo" placeholder="Ingrese el titulo de la nota"> 
	<br>
	<textarea rows="5" cols="80" name="contenido" placeholder="Ingrese el contenido de su nota"  class="form-control"></textarea>
	<br>
	<button type="submit" class="btn btn-secondary">Enviar </button> 

</form>

</div>
</body>
</html>