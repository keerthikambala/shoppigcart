<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
  
 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/loginstyle.css">
</head>
 <body>

  <div class="main">
    <p class="sign" align="center">Welcome to Shopping Cart</p>
    <br>
    <br>
    <br>
   <center><p style="cursor: pointer;
        border-radius: 5em;
        color: #fff;
        background: linear-gradient(to right, #0000FF, #1E90FF);
        border: 0;
        padding-left: 13px;
        padding-right: 13px;
        padding-bottom: 15px;
        padding-top: 15px;
        font-family: 'Ubuntu', sans-serif;
        font-size: 14px;
        box-shadow: 0 0 20px 1px rgba(0, 0, 0, 0.04);"><a href="${pageContext.request.contextPath}/user/login">click here to login</a></p><center>
              
    </div>
     
</body>

</html>