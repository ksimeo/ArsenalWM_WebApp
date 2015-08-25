<%@ page contentType="text/html; charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false" %>

<html>
<head>
  <title></title>
</head>
<body>
<h2></h2>
<input id="typeid" type="hidden" value="${typeid}"/>
<input id="groupid" name="groupid" type="hidden" value="${groupid}"/>
<ul>
  <c:forEach var="item" items="${products}">
    <li>
      <form>
        <a href="product?id=${item.id}&typeid=${typeid}&groupid=${groupid}">${item.producer} ${item.model}</a>
        <br/> ${item.price} ${item.currType}  <hr/>
      </form>
    </li>
  </c:forEach>
</ul>
</body>
</html>