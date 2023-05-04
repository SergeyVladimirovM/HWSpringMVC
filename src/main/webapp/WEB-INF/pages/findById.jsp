<%--
  Created by IntelliJ IDEA.
  User: serge
  Date: 04.05.2023
  Time: 23:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Product by id</title>
</head>
<body>
    <table>
        <tr>
            <th>id</th>
            <th>title</th>
            <th>cost</th>
        </tr>
            <tr>
                <td>${product.id}</td>
                <td>${product.title}</td>
                <td>${product.cost}</td>
            </tr>
    </table>
</body>
</html>
