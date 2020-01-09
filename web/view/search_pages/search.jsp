<%--
  Created by IntelliJ IDEA.
  User: marki
  Date: 09.01.2020
  Time: 13:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search flight</title>
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
    #menu, #menu ul, #menu li {
        margin: 0;
        padding: 0;
    }
    #menu, #menu ul {
        width: 30%;
        position: center;
        border-radius: 10px;
        background: white;
        border: 1px solid black;
    }
    #menu {
        position: relative;
        display: table;
        width: 100%;
        border-radius: 10px;
        background-color: cornflowerblue;
    }
    #menu ul {
        position: absolute;
        z-index: 5;
        display: none;
    }
    #menu li:hover ul {
        display: block;
    }
    #menu li {
        display: table-cell;
        text-align: center;
        color: white;
        height: 10%;
        font-family: "Times New Roman";
    }
    #menu ul li {
        display: block;
        text-align: center;
    }
    #menu a {
        display: block;
        padding: 3px 0;
        font-family: "Times New Roman";
        color: black;
        text-decoration: none;
    }
    #menu ul a {
        padding: 3px 15px;
    }
    #menu li:hover {
        background: #cccccc;
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
        <h2 align="center">Search flight</h2>
    </div>
    <ul id="menu">
        <li><a>SEARCH BY DAY</a>
            <ul>
                <li><a href="/searchToday">Today</a>
                <li><a href="/searchTomorrow">Tomorrow</a>
                <li><a href="/searchDay">Select day</a>
            </ul>
        <li><a>SEARCH BY CITY</a>
            <ul>
                <li><a href="/searchDeparture">Departure</a>
                <li><a href="/searchArrival">Arrival</a>
            </ul>
    </ul>
    <div>
        <script>
            for(var i = 0; i < 10; i++) {
                document.write("<br>");
            }
        </script>
        <button onclick="location.href='../..'">Back to main</button>
    </div>
</body>
</html>
