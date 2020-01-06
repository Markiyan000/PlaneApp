<%--
  Created by IntelliJ IDEA.
  User: marki
  Date: 05.01.2020
  Time: 2:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Deleting plane</title>
    <style>
        .heading {
            background-color: cornflowerblue;
            font-family: "Times New Roman";
            color: white;
            border-radius: 35px;
            box-shadow: 0 0 10px 2px #1A3457;
        }
        input[type="text"]
        {
            font-family: Georgia, "Times New Roman", Times, serif;
            border: none;
            border-radius: 4px;
            font-size: 15px;
            outline: 0;
            padding: 10px;
            width: 100%;
            box-sizing: border-box;
            -webkit-box-sizing: border-box;
            -moz-box-sizing: border-box;
            background: #e8eeef;
            color:#8a97a0;
            -webkit-box-shadow: 0 1px 0 rgba(0,0,0,0.03) inset;
            box-shadow: 0 1px 0 rgba(0,0,0,0.03) inset;
            margin: 0 0 30px;
        }
        input[type="text"]:focus
        {
            background: #d2d9dd;
        }
        input[type="submit"]
        {
            position: relative;
            display: block;
            padding: 19px 39px 18px 39px;
            color: #FFF;
            background: cornflowerblue;
            font-size: 18px;
            text-align: center;
            font-style: normal;
            width: 100%;
            border: 1px solid black;
            border-width: 1px 1px 3px;
            border-radius: 10px;
            margin: 0 auto 10px;
        }
        input[type="submit"]:hover
        {
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
<div>
    <h2 class = "heading" align="center">Deleting plane</h2>
</div>
<form method="post">
    <input type="text" name="city" placeholder="Enter city...">
    <input type="submit" value="Submit"/>
</form>
<div>
    <button onclick="location.href='/'">Back to main</button>
</div>
</body>
</html>