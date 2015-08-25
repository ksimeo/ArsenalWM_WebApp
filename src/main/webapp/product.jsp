<%@ page contentType="text/html; charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false" %>

<html>
    <head>
        <title>${producer} ${model} - NMSpace</title>
    </head>
    <body>
        <input id="groupid" type="hidden" value="${groupid}"/>
        <input id="prodid" type="hidden" value="${prodid}"/>
            <form>
                <h2>${producer} &nbsp; ${model}</h2>
                <hr/>
                <h2>${descr}</h2>
                <br/>
                <h3>Страна-производитель: &nbsp; ${country}</h3>
                <br/>
                <h3>Цена: &nbsp; ${price} ${type}</h3>
            </form>
    </body>
</html>