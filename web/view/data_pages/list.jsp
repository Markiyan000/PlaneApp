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
    <link href="view/css_files/list.css" rel="stylesheet" type="text/css"/>
</head>
<body>
    <div class = "heading">
        <h2 align="center">List of planes</h2>
    </div>
    <table class="table_blur">
        <tr>
            <th>ID</th>
            <th>Company</th>
            <th>From</th>
            <th>To</th>
            <th>Departure</th>
            <th>Arrival</th>
            <th>Days of execution</th>
        </tr>
    <%
    List<Plane> planes = (List<Plane>) request.getAttribute("planes");
    for(Plane plane : planes) {
        out.println("<tr>");
        out.println("<td>" + plane.getId() + "</td>");
        out.println("<td>" + plane.getCompany() + "</td>");
        out.println("<td>" + plane.getRoute().getFrom() + "</td>");
        out.println("<td>" + plane.getRoute().getTo() + "</td>");
        out.println("<td>" + plane.getRoute().getTimeStart() + "</td>");
        out.println("<td>" + plane.getRoute().getTimeFinish() + "</td>");
        out.println("<td class=days>" + plane.getDaysOfExecution() + "</td>");
        out.println("</tr>");
    }
    %>
    </table>
    <br/><br/><br/><br/>
    <div>
        <button onclick="location.href='../..'">Back to main</button>
    </div>
</body>
</html>
