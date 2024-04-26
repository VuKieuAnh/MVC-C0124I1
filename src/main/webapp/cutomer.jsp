<%@ page import="org.example.demo.model.Customer" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@taglib prefix="k" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kieuanh
  Date: 25/04/2024
  Time: 14:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%!
    List<Customer> customerList = new ArrayList<>();

%>
<%
    customerList.add(new Customer("Khoa", "2001", "Ha Noi"));
    customerList.add(new Customer("Khoa2", "2001", "Ha Noi"));
    customerList.add(new Customer("Khoa3", "2001", "Ha Noi"));
    customerList.add(new Customer("Khoa4", "2001", "Ha Noi"));
    request.setAttribute("dskh", customerList);
    request.setAttribute("a", "Vu Thi Kieu Anh");
%>
<body>
<h1>${a}</h1>
<table>
    <tr>name</tr>
    <tr>dob</tr>
    <tr>address</tr>


    <k:forEach var="cus" items="${dskh}">
        <tr>
            <td>${cus.name}</td>
            <td>${cus.dob}</td>
            <td>${cus.address}</td>
        </tr>
    </k:forEach>
</table>
</body>
</html>
