<%@ page import="database.entities.AddressEntity" %><%--
  Created by IntelliJ IDEA.
  User: ATimofeev
  Date: 12.04.2019
  Time: 10:58
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>java</title>
</head>
<body>
<h3>Таблица</h3>
<br>
<form action="/SetAddressForUser" method="get">
    <table border="3">
        <c:forEach var="col" items="${col}">
            <tr>
                <td><c:out value="${col.id}"/></td>
                <td><c:out value="${col.name}"/></td>
                <td><c:out value="${col.sname}"/></td>
                <td><c:out value="${col.fathername}"/></td>
                <td><input type="radio" value="<c:out value="${col.id}"/>" name="user"/></td>
            </tr>
        </c:forEach>
    </table>
    <br>
    <table border="3">
        <c:forEach var="adr" items="${adr}">
            <tr>
                <td><c:out value="${adr.aid}"/></td>
                <td><c:out value="${adr.usersEntityId}"/></td>
                <td><c:out value="${adr.street}"/></td>
                <td><c:out value="${adr.house}"/></td>
                <td><c:out value="${adr.room}"/></td>
                <td><input type="radio" value="<c:out value="${adr.aid}"/>" name="addressOf"/></td>
            </tr>
        </c:forEach>
    </table>
    <br>
    <input type="submit" value="submit" name="submit"/>
</form>
</body>
</html>
