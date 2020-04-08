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
    <p class="sign" align="center">Shopping Cart<br>Sign in</p>
    <form:form action="checkuser" modelAttribute="user" method="POST">
      <input class="un " type="text" align="center" placeholder="Username" name="username">
      <input class="pass" type="password" align="center" placeholder="Password"  name="password">
      <input type="submit" class="submit" align="center" value="Sign in">
</form:form>
      <p class="forgot" align="center"><a href="#">Forgot Password?</p>
            
                
    </div>
     
</body>

</html>
 
 

 
