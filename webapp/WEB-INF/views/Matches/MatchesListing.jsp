<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="ocaParchis" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"  href="/webjars/bootstrap/css/bootstrap.min.css" />
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

<ocaParchis:layout pageName="home">
	<title>Matches</title>
</head>
<body style="background-color:#ececec">
	<h2 style="font-family:monospace">Matches:</h2>
	<div class="container">
		<br />
		<c:if test="${message != null}">
		<div class="alert alert-${messageType}">
			<c:out value="${message}"></c:out>
			<a href="#" class="close" data-dismiss="alert" aria-label="close"> </a>
		</div>
		</c:if>
	</div>
	<table class="table table-striped">
		<tr>			
			<th>Id</th>
			<th>Selected game</th>
			<th>Actions</th>
		</tr>
		<c:forEach items="${matches}" var="match">
			<tr>				
				<td><c:out value="${match.id}"/></td>				
				<td><c:out value="${match.game}"/></td>	
			</tr>
		</c:forEach>
	</table>
</body>
</ocaParchis:layout>

</html>