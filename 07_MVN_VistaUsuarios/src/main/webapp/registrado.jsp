<%-- 
    Document   : registrado
    Created on : 21-feb-2019, 23:21:10
    Author     : IEUser
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="head.jsp" %>
<%@page import="com.vn.appusuarios.modelo.logica.ServicioUsuarios"%>
<%@page import="com.vn.appusuarios.modelo.Usuario"%>
<%
	//ServicioUsuarios servicioU = (ServicioUsuarios) request.getAttribute("servicioUsu");
    //Usuario usuario = (Usuario) session.getAttribute("usuario");
%>
<html>
 <%= head() %>
<body>
<%@include file="header.jsp" %>
	<h1>Registrado correctamente</h1>
<!-- 	<h2 style="color: green"> -->
<!-- 		ID : -->
<%-- 		<%= servicioU.leerUno(usuario.getEmail()).getId()%> --%>
<!-- 		<br> Nombre : -->
<%-- 		<%= servicioU.leerUno(usuario.getEmail()).getNombre()%> --%>
<!-- 	</h2> -->
	<h2 style="color: green">
		ID :
		<c:out value="$ {usuario.id}"/>
		<br> Nombre :
		<c:out value="$ {usuario.nombre}"/>
	
	</h2>


</body>
</html>
