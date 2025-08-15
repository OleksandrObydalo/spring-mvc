<%--
  Created by IntelliJ IDEA.
  User: Alex
  Date: 15.08.2025
  Time: 18:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ask details</title>
</head>
<body>

<h2>Dear Employee, enter your details</h2>
<br> <br>
    <form action="showDetails" method="get">
        <input type="text" name="employeeName" placeholder="Enter your name" required>
        <input type="number" name="employeeAge" placeholder="Enter your age" required>
        <input type="submit" value="Submit">
    </form>

</body>
</html>
