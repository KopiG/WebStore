<%--
    Document   : login
    Created on : 2019.05.12., 9:39:40
    Author     :
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Bean deklaráció -->
<jsp:useBean id="wareBean" class="com.braininghub.webstore.beans.WareBean" scope="page" />
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Store page</title>
</head>
<body>
  <form method="post">
    Codekey:<br>
    <input type="text" name="codeKey">
    <br>
    Name:<br>
    <input type="text" name="name">
    <br>
    Description:<br>
    <input type="text" name="description">
    <br>
    Price:<br>
    <input type="number" name="price">
    <br><br>
    <input type="submit" value="Create">
  </form>
</body>
</html>
