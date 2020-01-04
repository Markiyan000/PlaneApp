<%@ page import="app.model.entities.Plane" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: marki
  Date: 04.01.2020
  Time: 22:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>PlaneApp</title>
</head>
<body>
    <%
    List<Plane> planes = (List<Plane>) request.getAttribute("planes");
    planes.stream().forEach(p -> System.out.println(p));
    %>
    <div>
        <button onclick="location.href='/'">Back to main</button>
    </div>
</body>
</html>
