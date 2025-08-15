<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ask details</title>
</head>
<body>

    <h2>Dear Employee, enter your details</h2>
    <br> <br>
    <form:form action="showDetails" modelAttribute="employee" method="post" >
        Name <form:input path = "name" /><br><br>
        Surname <form:input path = "surname" /><br><br>
        Salary <form:input type = "number" path = "salary" /><br><br>
        Department <form:select path = "department" >
            <form:options items="${employee.departments}"/>
        </form:select>
        <br><br>
        <br><br>
        <input type="submit" value="Submit">
    </form:form>


</body>
</html>
