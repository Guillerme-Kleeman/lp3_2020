<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>  </title>
</head>
<body>
<h1>
valor = ${valor} 
<form action="pparam" method="post" >
	<input name="nombre" type="text"  placeholder="ingrese un nombre"/>
	<button type="submit">Enviar</button>
</form>

</h1>
</body>
</html>