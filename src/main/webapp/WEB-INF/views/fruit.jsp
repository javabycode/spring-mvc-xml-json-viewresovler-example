<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title> XML JSON View Example</title>
</head>
<body>

    <table>
        <tr>
            <td>id</td>
            <td>${fruit.id}</td>
        </tr>
        <tr>
            <td>name</td>
            <td>${fruit.name}</td>
        </tr>
        <tr>
            <td>produceby</td>
            <td>${fruit.produceBy}</td>
        </tr>
    </table>

</body>
</html>