<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border='2'>

<tr>
<th> Employee id</th>
<th> Employee name</th>
<th> Employee salary</th>
<th> actions </th>

<tr>

<c:forEach var="emp" items="${list}">
<tr>
<!-- it gives call to appropriate getter methods -->
<td>${emp.empid}</td> 
<td>${emp.ename}</td>
<td>${emp.sal}</td>
<td>

</td>


</c:forEach>

</tr>

</tr>


</table>
</body>
</html>