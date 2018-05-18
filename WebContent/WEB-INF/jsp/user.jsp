<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>First Assignment SpringFormController</title>
<style>
	.container-background {
		background-color: #E8E1E1;
		padding: 20px;
	}
	
	.error {
	 color: #ff0000;
	}
</style>
</head>
<body>
	<h1>First Assignment - SpringFormController</h1>
	<form:form cssClass="container-background" method="POST" commandName="user">
		<table>
			<tr>
				<td><form:label path="firstName">First Name</form:label></td>
				<td>
					<form:input path="firstName"/><br />
					<form:errors path="firstName" cssClass="error"></form:errors>
				</td>
			</tr>
			<tr>
				<td><form:label path="lastName">Last Name</form:label></td>
				<td><form:input path="lastName"/><br />
					<form:errors path="lastName" cssClass="error"></form:errors>
				</td>
			</tr>
			<tr>
				<td><form:label path="sex">Sex</form:label></td>
				<td><form:radiobutton path="sex" value="M" label="Male" /><br />
					<form:radiobutton path="sex" value="F" label="Female" /><br />
					<form:errors path="sex" cssClass="error"></form:errors>
				</td>
			</tr>
			<tr>
				<td><form:label path="dateBirth">Date of Birth</form:label></td>
				<td><form:input type="date" path="dateBirth" size="15" /><br />
					<form:errors path="dateBirth" cssClass="error"></form:errors></td>
			</tr>
			<tr>
				<td><form:label path="email">Email</form:label></td>
				<td><form:input type="email" path="email"/><br />
					<form:errors path="email" cssClass="error"></form:errors></td>
			</tr>
			<tr>
				<td><form:label path="section">Section</form:label></td>
				<td><form:radiobutton path="section" value="G" label="Graduate" /><br />
					<form:radiobutton path="section" value="P" label="Post Graduate" /><br />
					<form:radiobutton path="section" value="R" label="Research" /><br />
					<form:errors path="section" cssClass="error"></form:errors></td>
			</tr>
			<tr>
				<td><form:label path="country">Country</form:label></td>
				<td><form:select path="country" items="${countryList}"></form:select><br />
					<form:errors path="country" cssClass="error"></form:errors></td>
			</tr>
			<tr>
				<td><form:label path="firstAttempt">First Attempt?</form:label></td>
				<td><form:checkbox path="firstAttempt" value="true"/></td>
			</tr>
			<tr>
				<td><form:label path="subjects">Subjects</form:label></td>
				<td><form:select path="subjects" items="${subjectList}" multiple="true" /><br />
					<form:errors path="subjects" cssClass="error"></form:errors></td>
			</tr>
			<tr>
            	<td><input type="submit" value="Register"/></td>
            </tr>
		</table>
	</form:form>
</body>
</html>