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
        body {
            background-image: url("https://images.pexels.com/photos/912110/pexels-photo-912110.jpeg?auto=compress&cs=tinysrgb&dpr=3&h=750&w=1260");
            background-size: 1350px;
        }
        .heading {
            background-color: cornflowerblue;
            font-family: "Times New Roman";
            color: white;
            border-radius: 35px;
            box-shadow: 0 0 10px 2px #1A3457;
        }
        .table_blur {
            width: 70%;
            background: #f5ffff;
            border-collapse: collapse;
            text-align: center;
            margin-left: auto;
            margin-right: auto;
            border-radius: 15px;
        }
        .table_blur th {
            border-top: 1px solid #777777;
            border-bottom: 1px solid #777777;
            box-shadow: inset 0 1px 0 #999999, inset 0 -1px 0 #999999;
            background: linear-gradient(#9595b6, cornflowerblue);
            color: white;
            padding: 10px 15px;
            position: relative;
        }
        .table_blur th:after {
            content: "";
            display: block;
            position: absolute;
            left: 0;
            top: 25%;
            height: 25%;
            width: 100%;
            background: linear-gradient(rgba(255, 255, 255, 0), rgba(255,255,255,.08));
        }
        .table_blur tr:nth-child(odd) {
            background: #ebf3f9;
        }
        .table_blur th:first-child {
            border-left: 1px solid #777777;
            border-bottom:  1px solid #777777;
            box-shadow: inset 1px 1px 0 #999999, inset 0 -1px 0 #999999;
        }
        .table_blur th:last-child {
            border-right: 1px solid #777777;
            border-bottom:  1px solid #777777;
            box-shadow: inset -1px 1px 0 #999999, inset 0 -1px 0 #999999;
        }
        .table_blur td {
            border: 1px solid #e3eef7;
            padding: 10px 15px;
            position: relative;
            transition: all 0.5s ease;
        }
        .table_blur tbody:hover td {
            color: transparent;
            text-shadow: 0 0 3px #a09f9d;
        }
        .table_blur tbody:hover tr:hover td {
            color: #444444;
            text-shadow: none;
        }
        .td days{
            width: 30%;
        }
        button {
            width: 500px;
            font-family: "Times New Roman";
            font-size: 18px;
            text-align: center;
            font-style: normal;
            text-align: center;
            display: block;
            padding: 19px 39px 18px 39px;
            color: #FFF;
            background: red;
            font-size: 25px;
            text-align: center;
            font-style: normal;
            border: 1px solid black;
            border-width: 1px 1px 3px;
            border-radius: 10px;
            margin: 0 auto 10px;
        }
        button:hover{
            background-color: #cccccc;
        }
    </style>
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
        <button onclick="location.href='/'">Back to main</button>
    </div>
</body>
</html>
