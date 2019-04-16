<%--
  Created by IntelliJ IDEA.
  User: ATimofeev
  Date: 12.04.2019
  Time: 10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Your Name!</h2>

<form action="/GetNameFromJsp" method="get">
    <p><input placeholder="name" name="name"></p>
    <p><input placeholder="second name" name="sname"></p>
    <p><input placeholder="father name" name="fname"></p>
    <p><input type="submit" value="add"></p>
</form>
<form action="address.jsp" method="get">
    <p><input type="submit" value="submit"></p>
</form>
</body>
</html>
