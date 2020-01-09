<%--
  Created by IntelliJ IDEA.
  User: marki
  Date: 04.01.2020
  Time: 20:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Adding plane</title>
    <link href="view/css_files/add.css" rel="stylesheet" type="text/css"/>
</head>
<body>
    <div class = "heading">
        <h2 align="center">Adding plane</h2>
    </div>
    <form method="post">
        <div class="first">
            <fieldset>
                <legend><span class="number">1</span> Plane Info</legend>
                <input type="text" name="id" placeholder="Enter ID...">
                <input type="text" name="company" placeholder="Enter company...">
                <legend><span class="number">2</span> Route Info</legend>
                <input type="text" name="from" placeholder="From...">
                <input type="text" name="to" placeholder="To...">
                <input type="text" name="departure" placeholder="Time of departure...">
                <input type="text" name="arrival" placeholder="Time of arrival...">
            </fieldset>
        </div>
        <div class = "second">
            <fieldset>
                <legend><span class="number">3</span> Days of execution</legend>
                <input type="text" name="mon" placeholder="Monday...">
                <input type="text" name="tue" placeholder="Tuesday...">
                <input type="text" name="wed" placeholder="Wednesday...">
                <input type="text" name="thu" placeholder="Thursday...">
                <input type="text" name="fri" placeholder="Friday...">
                <input type="text" name="sat" placeholder="Saturday...">
                <input type="text" name="sun" placeholder="Sunday...">
            </fieldset>
        </div>
        <input type="submit" value="Submit"/>
    </form>
    <div>
    <button onclick="location.href='../..'">Back to main</button>
    </div>
</body>
</html>
