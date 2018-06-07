<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" 	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Telusko Internship</title>
</head>
<body>
<h1>Telusko Internship</h1>
	<hr>
	<div class="container-fluid" style="margin-top: 50px">
		<div class="row">
			<div class="col-md-6">
				<h4>Students Database</h4>
				<table
					class="table table-striped table-bordered table-hover table-condensed">
					<thead>
						<tr class="info">
							<th>Student_Id</th>
							<th>Student_Name</th>
							<th>Student_Age</th>
							<th>Student_Marks</th>
							<th>Student_City</th>
						</tr>
					</thead>
					<c:forEach var="s" items="${list}">
						<tbody>
							<tr>
								<td><c:out value="${s.getId()}" /></td>
								<td><c:out value="${s.getName()}" /></td>
								<td><c:out value="${s.getAge()}" /></td>
								<td><c:out value="${s.getMarks()}" />%</td>
								<td><c:out value="${s.getCity()}" /></td>
							</tr>
						</tbody>
					</c:forEach>
				</table>
			</div>
			<div class="col-md-6">
			<h4>Links</h4>
			<a href="${pageContext.request.contextPath}/Show-10-20">Show Top 5 Students Between Age 10-20</a><br>
			<a href="${pageContext.request.contextPath}/Show-20-30">Show Top 5 Students Between Age 20-30</a><br>
			<a href="${pageContext.request.contextPath}/Show-30-40">Show Top 5 Students Between Age 30-40</a><hr>
			<h3>Top 5 from age group 10-20</h3>
				 <table class="table table-striped table-bordered table-hover table-condensed">
					<thead >
						<tr class="info">
 							<th>Student_Name</th>
							<th>Student_Age</th>
							<th>Student_Marks</th>
							<th>Student_City</th>
						</tr>
					</thead>
					<c:forEach var="s1" items="${list1}">
						<tbody>
							<tr>
 								<td><c:out value="${s1.getName()}" /></td>
								<td><c:out value="${s1.getAge()}" /></td>
								<td><c:out value="${s1.getMarks()}" />%</td>
								<td><c:out value="${s1.getCity()}" /></td>
							</tr>
						</tbody>
					</c:forEach>
				</table>
			</div>
		</div>
	</div>

</body>
</html>