<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<title>Candidate Confirmation Page</title>
<style type="text/css">

.upper{
	text-transform: uppercase;
}

</style>
</head>

<Body>
<h2>Thank You </h2>
<h3>Application Submitted Successfully</h3>
<hr/>

<b> Name: </b> ${candidate.firstName } ${candidate.lastName } <br/><br/>
<b>	Email address: </b> ${candidate.emailId} <br/><br/>
<b>	Phone Number: </b> ${candidate.phoneNumber} <br/><br/>
<b>	Address </b> ${candidate.address} <br/><br/>
<b>	City: </b> ${candidate.city} <br/><br/>
<b>	State: </b> ${candidate.state} <br/><br/>

<b>	Postal Code: </b> ${candidate.postalCode}<br/><br/>
<b>	Country: </b>${candidate.country} <br/><br/>
<b>	Known Languages: </b>
	<ul>
		<c:forEach var = "temp" items="${candidate.knownLanguages }">
		<li>${temp }</li>
		</c:forEach>
	</ul> <br/>
<b> Education: </b> ${candidate.education } <br/>
<b>	Institute: </b> ${candidate.institute } <br/>

</Body>

</html>
