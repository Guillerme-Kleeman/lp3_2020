<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nota: ${titulo}  </title>
<link href="/webjars/bootstrap/4.5.0/css/bootstrap.min.css" rel="stylesheet" />
<script src="/webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>
<body>
${contenido}
<div class="container">
<div class="card" >
<div class="card-header"> ${nota.getTitulo()}</div>
<div class="card-body">
 ${ nota.getContenido()}
</div>
</div>
<a href="/notas/" class="btn btn-primary">Volcer a la lista</a>
</div>



</body>
</html>