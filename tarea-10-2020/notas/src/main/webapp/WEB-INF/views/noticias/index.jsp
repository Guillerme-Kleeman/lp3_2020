<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>${titulo}  </title>
		<link href="/webjars/bootstrap/4.5.0/css/bootstrap.min.css" rel="stylesheet" />
		<script src="/webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
	</head>
	<body>
		<h1>${titulo}</h1>
		
		<p>${contenido}</p> 
		<div class="container">
			<a href="nuevo" class="btn btn-success">Nuevo</a>
			<core:forEach  items="${datos}" var="dato"  >
				<div class="card" >
					<div class="card-header">
						<div class="row">
							<div class="col-9"><h3> ${ dato.getTitulo()}</h3><span>${ dato.getFecha()}</span>  </div>
							<div class="col-1"><a href="editar/${ dato.getId()}" class="btn btn-warning btn-sm">Editar</a></div>
							<div class="col-1"><a href="borrar/${ dato.getId()}" class="btn btn-danger btn-sm">Borrar</a></div>
						</div>
					</div>
				
					<div class="card-body">
						 ${ dato.getContenido()}
						 <br>
						<span>${ dato.getCategoria().getNombre()}(${ dato.getCategoria().getId()})</span>
					</div>
				</div>
			</core:forEach>
		</div>
	</body>
</html>