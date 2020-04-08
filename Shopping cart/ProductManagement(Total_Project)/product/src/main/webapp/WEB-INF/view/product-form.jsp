
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>

<head>
  <link type="text/css"
rel="stylesheet"
href="${pageContext.request.contextPath }/resources/css/productform.css"/>
  <title>Details</title>
  <style>
  
  .error{
  color:red;
   font-weight: 700;
    font-size: 14px;
    letter-spacing: 1px;
font-family: 'Ubuntu', sans-serif;
}
</style>
</head>

<body>
 <div >
 <p class="pd" align="center">Product Details</p>
<form:form class="form1" action="saveProduct" modelAttribute="product" method="POST">
<form:hidden path="id"/>
<center class="dt">Product Name</center><br>
<center><form:input class="pass" path="productName" type="text" /></center><br>
<center><form:errors path="productName" cssClass="error"/></center><br>
<center class="dt">Category</center><br>
<center><table class="pass"><tr><td style="float:"><form:radiobutton  path="category"  value="electonics"/>Electronics</td>
<td style="float:"><form:radiobutton  path="category"  value="baby&care" />Baby&Care &nbsp&nbsp</td></tr>
<tr><td style="float:"><form:radiobutton  path="category"  value="groceries"/>Groceries &nbsp</td>
<td style="float:"><form:radiobutton  path="category"  value="homeneed" />HomeNeed &nbsp&nbsp&nbsp</td></tr>
<tr><td style="float:"><form:radiobutton  path="category"  value="fashion"/>Fashion &nbsp&nbsp&nbsp&nbsp</td>
<td style="float:"><form:radiobutton  path="category" value="beautycare"/>BeautyCare &nbsp&nbsp</td></tr>
<tr><center><form:errors path="category" cssClass="error"/></center></tr>
</table></center>
<center class="dt">Price</center><br>
<center><form:input class="pass" path="price" type="text" /></center><br>
<center><form:errors path="price" cssClass="error"/></center><br>
<center class="dt">Date Of Manufacture</center><br>
<center><form:input class="pass"  path="dom" type="date" align="center"/></center><br>
<center><form:errors path="dom" cssClass="error"/></center><br>
<center class="dt">Date Of Launch</center><br>
<center><form:input class="pass"  path="doe" type="date" align="center"/></center><br>
<center><form:errors path="doe" cssClass="error" /></center><br>
      <center><table><tr><td><input type="submit" class="submit" align="center" value="ADD"></td>
      <td><a href="${pageContext.request.contextPath}/product/list" class="submit" align="center" style="text-decoration:none">Back</a></td></tr></table>
      
     </form:form><br>
 </div>
     
</body>

</html>



