<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>

<html>
<head>
	<title>List Candidates</title>
	
	<link type = "text/css"
			rel = "stylesheet"
			href= "${pageContext.request.contextPath}/resources/css/style.css "/>
	
</head>
<body>

	<div class = "header">	
			<h2> Application System</h2>
	</div>
<hr>
<hr>	
		<table id = "candidates">
			<tr>
				<th class="update">Action</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Email ID</th>
				<th>Phone Number</th>
				<th>Address</th>
				<th>City</th>
				<th>State</th>
				<th>Postal Code</th>
				<th>Country</th>
				<th>Institute</th>
				<th>Education</th>
			</tr>
		
		<c:forEach var = "tempCandidate" items="${candidates}" >
			
			<c:url var="updateLink" value="/applications/updateForm">
				<c:param name ="candidateId" value="${tempCandidate.id}"/>
			</c:url>
			
			<c:url var = "deleteLink" value = "/applications/delete">
				<c:param name = "candidateId" value = "${tempCandidate.id}" />
			</c:url>
			
			<tr>
				<td> <a href = "${updateLink}" class="noButton">Update </a>
					 <a href = "${deleteLink}" class= "noButton" onClick= "if(!(confirm('Are you sure you want to delete this candidate?')))return false">Delete</a>
 				</td>
				<td> ${tempCandidate.firstName} </td>
				<td> ${tempCandidate.lastName} </td>
				<td> ${tempCandidate.emailId} </td>
				<td> ${tempCandidate.phoneNumber} </td>
				<td> ${tempCandidate.address} </td>
				<td> ${tempCandidate.city} </td>
				<td> ${tempCandidate.state} </td>
				<td> ${tempCandidate.postalCode} </td>
				<td> ${tempCandidate.country} </td>
				<td> ${tempCandidate.institute} </td>
				<td> ${tempCandidate.education} </td>
			</tr>
		
		</c:forEach>
		</table>
		
</body>

</html>