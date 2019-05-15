<%--
    Document   : login
    Created on : 2019.05.12., 9:39:40
    Author     :
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Bean deklaráció -->
<jsp:useBean id="wareBean" class="com.braininghub.webstore.beans.WareBean" scope="session" />
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Store page</title>
</head>
<body>
  <form method="post">
    <label for="codeKey">Codekey:</label>
    <br>
    <input id="codeKey" type="text" name="codeKey">
    <br>
    <label for="name">Name:</label>
    <br>
    <input id="name" type="text" name="name">
    <br>
    <label for="name">Description:</label>
    <br>
    <input id="description" type="text" name="description">
    <br>
    <label for="price">Price:</label>
    <br>
    <input id="price" type="number" name="price">
    <br><br>
    <input type="submit" value="Create">
  </form>
<c:if test="${wareBean.successfullyCreated}">
  ${wareBean.name} has been successfully created
</c:if>
</body>
</html>
