<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Casa Abierta ISMAC Años 80´s</title>
<link rel="stylesheet" href="./css/frmUsuarios.css">
</head>
<body>

	<h1>Agregar Usuario</h1>
	
	<form action="frmAdd" method="post">
	
		<label for="id">ID</label>
      	<input type="hidden" id="id" name="id">	
		<br></br>
		<label for="cedula">Cédula</label>
		<input type="text" id="cedula" name="cedula" maxlength="10">
		<br></br>
		<label for="nombre1">Primer Nombre</label>
		<input type="text" id="nombre1" name="nombre1" maxlength="30">
		<br></br>
		<label for="nombre2">Segundo Nombre</label>
		<input type="text" id="nombre2" name="nombre2" maxlength="30">
		<br></br>
		<label for="apellido1">Primer Apellido</label>
		<input type="text" id="apellido1" name="apellido1" maxlength="30">
		<br></br>
		<label for="apellido2">Segundo Apellido</label>
		<input type="text" id="apellido2" name="apellido2" maxlength="30">
		<br></br>
		<label for="fechaNacimiento">Fecha de Nacimiento</label>
		<input type="date" id="fechaNacimiento" name="fechaNacimeinto" maxlength="20">
		<br></br>
		<label for="edad">Edad</label>
		<input type="number" id="edad" name="edad" maxlength="10">
		<br></br>
		<label for="sexo">Genero</label>
		<select name="sexo" id="sexo" >
	       <option selected>Seleccionar...</option>
	       <option value="Masculino">Masculino</option>
	       <option value="Femenino">Femenino</option>
	    </select>
		<br></br>
		<label for="direccion">Dirección</label>
		<input type="text" id="direccion" name="direccion" maxlength="50">
		<br></br>
		<label for="telefono">Teléfono</label>
		<input type="text" id="telefono" name="telefono" maxlength="20">
		<br></br>
		<label for="correo">Correo</label>
		<input type="mail" id="correo" name="correo" maxlength="50">
		<br></br>
		<label for="sexo">Tipo</label>
		<select name="tipo" id="tipo" >
	       <option selected>Seleccionar...</option>
	       <option value="Masculino">Usuario</option>
	       <option value="Femenino">Admin</option>
	    </select>
		<br></br>
		<input type="submit" value="Guardar">
	
	
	</form>

</body>
</html>