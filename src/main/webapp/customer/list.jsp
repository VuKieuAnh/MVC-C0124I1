<%--
  Created by IntelliJ IDEA.
  User: kieuanh
  Date: 26/04/2024
  Time: 13:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Danh sach khach hang</h1>
<table border="1">
    <tr>
       <td>name</td>
       <td>dob</td>
       <td>address</td>
    </tr>
    <c:forEach items="${dskh}" var="kh">
        <tr>
            <td>${kh.getName()}</td>
            <td>${kh.getDob()}</td>
            <td>${kh.getAddress()}</td>
        </tr>

    </c:forEach>
</table>
</body>
</html>
