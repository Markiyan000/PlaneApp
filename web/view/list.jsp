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
    <style>
        table {
            font-family: "Lucida Sans Unicode", "Lucida Grande", Sans-Serif;
            font-size: 16px;
            width: 65%;
            border-radius: 25px;
            text-align: center;
            border-collapse: collapse;
            background: #252F48;
            margin:10px;
        }
        table th {
            color: #EDB749;
            border-bottom: 1px solid #37B5A5;
            padding: 12px 17px;
        }
        table td {
            color: #CAD4D6;
            border-bottom: 1px solid #37B5A5;
            border-right:1px solid #37B5A5;
            padding: 7px 17px;
        }
        table tr:last-child td {
            border-bottom: none;
        }
        table td:last-child {
            border-right: none;
        }
        table tr:hover td {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <table class = "table">
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
        out.println("<td>" + plane.getDaysOfExecution() + "</td>");
        out.println("</tr>");
    }
    %>
    </table>
    <div>
        <button onclick="location.href='/'">Back to main</button>
    </div>
</body>
</html>
