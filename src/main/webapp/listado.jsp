<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tematica</title>
</head>
<body>
	<c:forEach var="p" items="${requestScope.paginas}">
		<h1><a href="${p.direccion}">${p.direccion}</a></h1>
		<br>
	</c:forEach>
	<br>
	<a href="datos.jsp">Volver</a>
</body>
</html>