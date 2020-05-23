<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de peliculas</title>
</head>
<body>
	<h1>Listado:</h1>
	<core:forEach  items="${peliculas}" var="pelicula">
		<h2>Título: ${ pelicula.getNombre() }</h2>
		<p>Género: ${ pelicula.getGenero() }</p>
	</core:forEach>
</body>
</html>