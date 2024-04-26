<%--
  Created by IntelliJ IDEA.
  User: kieuanh
  Date: 25/04/2024
  Time: 14:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%
    String name = request.getParameter("username");
    float age = Float.parseFloat(request.getParameter("age"));
%>
<body>
<h1>Xin chao</h1>
khach hang <%=name%>
 <%=age%> tuoi
</body>
</html>
