<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Usuarios</title>
</head>
<body>
	<h1>Detalle de usuario</h1>
	
	<button onclicK="window.location.href='/ismac-spring-eventos-web/usuarios/frmAdd'; return false;">Agregar</button>
	
	<table border="1"> 
		<thead>
			<tr>
				<th>id_Usuario</th>
				<th>Cedula</th>
				<th>Primer Nombre</th>
				<th>Segundo Nombre</th>
				<th>Primer Apellido</th>
				<th>Segundo Apellido</th>
				<th>Fecha_Nacimiento</th>
				<th>Edad</th>
				<th>Sexo</th>
				<th>Direccion</th>
				<th>Telefono</th>
				<th>Correo</th>
				<th>Tipo</th>
				<th>Acciones</th>
			</tr>
		</thead>
		<tbody>
		
		<c:forEach var="item" items="${keyUsuarios}" >
		 	<tr>
				<td>${item.id}</td>
				<td>${item.cedula}</td>
				<td>${item.nombre1}</td>
				<td>${item.nombre2}</td>
				<td>${item.apellido1}</td>
				<td>${item.apellido2}</td>
				<td>${item.fechaNacimiento}</td>
				<td>${item.edad}</td>
				<td>${item.sexo}</td>
				<td>${item.direccion}</td>
				<td>${item.telefono}</td>
				<td>${item.correo}</td>
				<td>${item.tipo}</td>
				<td><button>Editar</button><button>Eliminar</button></td>
			</tr>
		 </c:forEach>
			
		</tbody>
	
	</table>
</body>
</html>