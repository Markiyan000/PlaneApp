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
    <style>
        input{
            -webkit-transition: width 0.4s ease-in-out;
            transition: width 0.4s ease-in-out;
        }
        input :focus{
            width: 100%;
        }
    </style>
</head>
<body>
    <div>
        <h2>Adding plane</h2>
    </div>
    <form method="post">
        <label>ID:
            <input type="text" name="id"><br /><br />
        </label>
        <label>Company:
            <input type="text" name="company"><br /><br />
        </label>
        <label>From:
            <input type="text" name="from"><br /><br />
        </label>
        <label>To:
            <input type="text" name="to"><br /><br />
        </label>
        <label>Departure:
            <input type="text" name="departure"><br /><br />
        </label>
        <label>Arrival:
            <input type="text" name="arrival"><br /><br />
        </label>
        <label>Monday:
            <input type="text" name="mon"><br /><br />
        </label>
        <label>Tuesday:
            <input type="text" name="tue"><br /><br />
        </label>
        <label>Wednesday:
            <input type="text" name="wed"><br /><br />
        </label>
        <label>Thursday:
            <input type="text" name="thu"><br /><br />
        </label>
        <label>Friday:
            <input type="text" name="fri"><br /><br />
        </label>
        <label>Saturday:
            <input type="text" name="sat"><br /><br />
        </label>
        <label>Sunday:
            <input type="text" name="sun"><br /><br />
        </label>
        <button type="submit">Submit</button>
    </form>
    <div>
        <button onclick="location.href='/'">Back to main</button>
    </div>
</body>
</html>
