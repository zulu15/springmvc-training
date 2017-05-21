<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/views/include.jsp"%>
<html>
<head>
<title><fmt:message key="title" /></title>
</head>
<body>
	<div class="container">
		<h1 class="page-header text-info">
			<fmt:message key="heading" />
		</h1>
		<p>
			<fmt:message key="greeting" />
			<c:out value="${modelo.time}" />
		</p>
		<h3>Products</h3>
		<c:forEach items="${modelo.productList}" var="prod">
			<c:out value="${prod.description}" />
			<i>$<c:out value="${prod.price}" /></i>
			<br>
			<br>
		</c:forEach>
		<br> 
		<hr>
		<a class="btn btn-primary" href="<c:url value="priceincrease.htm"/>">Increase
			Prices</a> <br>
	</div>

</body>
</html>