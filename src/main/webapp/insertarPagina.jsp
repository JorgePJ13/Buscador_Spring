<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Añadir página</title>
</head>
<body>
	<center>
		<form action="Insertar" method="post">
			Dirección: <input type="text" name="direccion"> <br>
			Temática: <input type="text" name="tematica"> <br>
			Descripción: <input type="text" name="descripcion"> <br>
			<button>Añadir</button>
		</form>
		<br>
		<a href="datos.jsp">Volver</a>
	</center>

</body>
</html>