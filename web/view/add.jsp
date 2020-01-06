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
    <style type="text/css">
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
        .first, .second{
            border-color: cornflowerblue;
            max-width: 500px;
            padding: 10px 20px;
            background: cornflowerblue;
            margin: 10px auto;
            padding: 20px;
            background: #f4f7f8;
            border-radius: 15px;
            font-family: Georgia, "Times New Roman", Times, serif;
        }
        .first legend, .second legend {
            font-size: 1.4em;
            margin-bottom: 10px;
        }
        .first input, .second input[type="text"]
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
        .first input,.second input[type="text"]:focus
        {
            background: #d2d9dd;
        }
        .first{
            float: left;
        }
        .second{
            float: right;
        }
        .first .number,.second .number {
            background: cornflowerblue;
            color: #cccccc;
            height: 30px;
            width: 30px;
            display: inline-block;
            font-size: 0.8em;
            margin-right: 4px;
            line-height: 30px;
            text-align: center;
            text-shadow: 0 1px 0 rgba(255,255,255,0.2);
            border-radius: 15px 15px 15px 0px;
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
    <button onclick="location.href='/'">Back to main</button>
</div>
</body>
</html>
