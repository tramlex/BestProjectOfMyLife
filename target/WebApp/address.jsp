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
<h2>Your Address!</h2>

<form action="/GetAddressFromJsp" method="get">
    <p><input placeholder="street" name="street"></p>
    <p><input placeholder="house" name="house"></p>
    <p><input placeholder="room" name="room"></p>
    <p><input type="submit" value="add"></p>
</form>
<form action="/TransferDataToJsp" method="get">
    <p><input type="submit" value="submit"></p>
</form>

</body>
</html>
