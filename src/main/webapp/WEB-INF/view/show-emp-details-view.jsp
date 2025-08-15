<%--
  Created by IntelliJ IDEA.
  User: Alex
  Date: 15.08.2025
  Time: 18:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>Dear Employee, you are WELCOME!</h2>
    <br><br>
<%--    <h3>Your name: ${param.employeeName}</h3>--%>
    <h3>Your name: ${employee.name}!</h3>
    <h3>Your surname: ${employee.surname}</h3>
    <h3>Your salary: ${employee.salary}</h3>
    <h3>Your department: ${employee.department}</h3>

</body>
</html>
