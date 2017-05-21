<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/views/include.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title><fmt:message key="title" /></title>
<style>
.error {
	color: red;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
	<div class="container">
		<h1 class="page-header text-info">
			<fmt:message key="priceincrease.heading" />
		</h1>
		<form:form method="post" modelAttribute="priceIncrease">
			<table>
				<tr>
					<td align="right" width="20%">Increase (%):</td>
					<td width="20%"><form:input path="percentage" /></td>
					<td width="60%"><form:errors path="percentage"
							cssClass="error" /></td>
				</tr>
			</table>
			<br>
			<hr>
			<input class="btn btn-success" type="submit" value="Execute">
		</form:form>
		<a class="btn btn-info" href="<c:url value="hello.htm"/>">Home</a>
	</div>

</body>
</html>