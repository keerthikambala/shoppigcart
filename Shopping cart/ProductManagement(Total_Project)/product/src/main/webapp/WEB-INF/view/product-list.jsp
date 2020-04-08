


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>

  <link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/productlist.css"/>
  <title>List of Shopping items</title>
  <style>
     
                 </style>
</head>

<body>
  <div class="main">
 <p class="pd" align="center">Shopping cart-Shopping products</p>
<br>
<center><table><tr><td><input type="button" value="CLICK HERE:To Add Product" 
onClick="window.location.href='showFormForAdd';return false;" class="add"/></td>

<td><input type="button" value="CLICK HERE:   To Log me Out" 
onClick="window.location.href='logout';return false;" class="add"/><br></td>
<td><a href="${pageContext.request.contextPath}/product/list" class="add" align="center" style="text-decoration:none">click here to go Back</a></td></tr></table></center><br>
<center>
   <form:form action="search" method="POST" class="search">
<div class="wrap">
   <div class="search">
      <input type="text" class="searchTerm" placeholder="productname CLICK HERE>" required="required" name="productName">
      <button type="submit" class="searchButton">
        <i class="fa fa-search"></i>
     </button>
   </div>
</div>
</form:form>
</center>
<br><br>
<hr>


<table align="center" border="2px">
<tr>
<th class="pad">ProductName</th>
<th class="pad">Category</th>
<th class="pad">Price</th>
<th class="pad">Date-of-Manufacture</th>
<th class="pad">Date-of-Launch</th>
<th class="pad">Action</th>
</tr>

<c:forEach var="tempProduct" items="${products}">
				<!-- update link -->
				<c:url var="updateLink" value="/product/showFormForUpdate">
					<c:param name="id" value="${tempProduct.id}" />
				</c:url>
				<c:url var="deleteLink" value="/product/showFormForDelete">
					<c:param name="id" value="${tempProduct.id }" />
				</c:url>
				<tr>
<td class="pad">${tempProduct.productName }</td>
<td class="pad">${tempProduct.category }</td>
<td class="pad">${tempProduct.price }</td>
<td class="pad">${tempProduct.dom}</td>
<td class="pad">${tempProduct.doe}</td>
<td class="pad"><a href="${updateLink }" class="update">update</a>|
<a href="${deleteLink }"
onClick="if (!(confirm('Are you sure to delete!?'))) return false" class="delete">Delete</a></td>
</tr>
</c:forEach>
</table>


    </div>
     
</body>

</html>



