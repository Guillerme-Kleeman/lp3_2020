<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Nueva Pelicula</title>
</head>
<body>
	<form:form modelAttribute="nuevaPelicula" action="guardar" method="POST">
        <form:label path="nombre">Nombre</form:label>
        <form:input path="nombre" />
        <form:label path="genero">Género</form:label>
		<form:select path="genero">
		      <form:options items="${generos}"></form:options>
		</form:select>
     	<input type="submit" value="Enviar">
     </form:form>   
</body>
</html>