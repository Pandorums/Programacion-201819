<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.ArrayList, java.util.HashMap" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listado con JSTL/EL</title>
</head>
<body>
<h2>Listado con JSTL/EL</h2>
<% 
Object[] miArray = (Object[]) application.getAttribute("listadoPorArray");
ArrayList <Object> miListaArray = (ArrayList<Object>) application.getAttribute("listadoPorArrayList");	
HashMap <String,Object> miHashMap =(HashMap <String,Object>) application.getAttribute("listadoPorMapa");
%>



<ul>
<c:forEach items="${listadoPorMapa}"  var="elemento"> 
<li>${elemento.key}  -> ${elemento.value }</li>
</c:forEach>


</ul>
</body>
</html>