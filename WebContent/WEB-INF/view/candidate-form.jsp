<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Application System - Candidate Form</title>
<style type="text/css">

.hr{
	width: 40%;
}

.error{
	color: red;
	margin-left: 10px;
}

label {
	width: 120px;
	clear: left;
	float: left;
	padding-bottom: 10px;
	margin-right: 90px;
}

input{
	width: 200px;
}

input[type="text"]{
	border: 1px solid lightgreen;
	border-radius: 2px;
	padding: 6px 12px;
	margin: 5px;
}

input[type=text]:focus {
    border: 1px solid green;
}

select:focus {
    border: 1px solid green;
}
.check{
	width: 20px;
	border: 1px solid lightgreen;
}

select{
	border: 1px solid lightgreen;
	border-radius: 2px;
	padding: 6px 12px;
	margin: 5px;
}


</style>
</head>

<body>
	<h2>Application Form</h2>
	<hr align="left" class = "hr" />
	<hr align="left" class = "hr" />
	
	<form:form action="saveCandidate" modelAttribute="candidate" method = "POST">

			<!-- Need to associate this data with customer id -->
			
			<form:hidden path="id"/>

		<!-- FIRST NAME  -->
		<table>
			<tbody>
				<tr>
				<td>				
				
		<h3>Personal Information</h3>
</td>
				
				</tr>
				<tr>
					<td><label>First Name</label></td>
					<td class="inputs"><form:input type="text" path="firstName" /></td>
				</tr>


				<!-- LAST NAME  -->
				<tr>
					<td><label>Last Name(*)</label></td>

					<td><form:input type="text" path="lastName" /></td>
					<td><form:errors path="lastName" cssClass="error" /></td>
				</tr>


				<!-- EMAILID  -->
				<tr>
					<td><label>Email Address</label></td>
					<td><form:input type="text" path="emailId" /></td>
					<td><form:errors path="emailId" cssClass="error" /></td>
				</tr>

				<!-- PHONE NUMBER -->
				<tr>
					<td><label>Phone Number</label></td>
					<td><form:input type="text" path="phoneNumber"
							placeholder="xxx-xxx-xxxx" /></td>
					<td><form:errors path="phoneNumber" cssClass="error" /></td>
				</tr>

				<!-- ADDRESS  -->
				<tr>
					<td><label>Address</label></td>
					<td><form:input type="text" path="address" /></td>
				</tr>


				<!-- CITY  -->
				<tr>
					<td><form:label path="city" class="label">City</form:label></td>
					<td><form:input type="text" path="city" /></td>
				</tr>

				<!-- STATE  -->
				<tr>
					<td><label>State</label></td>
					<td><form:select path="state">
							<form:options items="${candidate.allStates}" />
						</form:select></td>
				</tr>


				<!-- POSTAL CODE  -->
				<tr>
					<td><label>Postal Code</label></td>
					<td><form:input path="postalCode" /></td>
					<td><form:errors path="postalCode" cssClass="error" /></td>
				</tr>

				<!-- COUNTRY  -->
				<tr>
					<td><label>Country</label></td>
					<td><form:select path="country">
							<form:options items="${candidate.countryOptions}" />
						</form:select></td>
				</tr>

				<tr>
					<td>
				<div class = "headings">
					<h3>Education and Skills</h3>
				</div>
					</td>
				</tr>

				<!-- INSTITUTE  -->

				<tr>
					<td><label>Institute</label></td>
					<td><form:input type="text" path="institute" /></td>
				</tr>


				<!-- EDUCATION  -->

				<tr>
					<td><label>Education</label></td>
					<td><form:select path="education">
							<form:options items="${candidate.educationLevel}" />
						</form:select></td>
				</tr>

				<!-- KNOWN LANGUAGES  -->

				<tr>
					<td><label>Known programming languages</label></td>
					<td>Java <form:checkbox path="knownLanguages" value="Java"
							class="check" /> C <form:checkbox path="knownLanguages"
							value="C" class="check" /> C++ <form:checkbox
							path="knownLanguages" value="C++" class="check" /> Ruby <form:checkbox
							path="knownLanguages" value="Ruby" class="check" /> Python <form:checkbox
							path="knownLanguages" value="Python" class="check" />
					</td>
				</tr>

				<tr>
					<td></td>
					<td><input type="submit" value="Submit" class="button" /></td>
				</tr>
			</tbody>
		</table>
	</form:form>
</body>
</html>