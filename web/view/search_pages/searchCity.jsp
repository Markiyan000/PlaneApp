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
    <title>Search city</title>
    <link href="view/css_files/input.css" rel="stylesheet" type="text/css"/>
</head>
<body>
    <div>
        <h2 class = "heading" align="center">Search city</h2>
    </div>
    <form method="post">
        <input type="text" name="city" placeholder="Enter city...">
        <input type="submit" value="Submit"/>
    </form>
    <div>
        <button onclick="location.href='view/search_pages/search.jsp'">Back</button>
    </div>
</body>
</html>