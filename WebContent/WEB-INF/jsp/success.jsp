<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Form submitted with success</title>
<style>
	.container-background {
		background-color: #E8E1E1;
		border: 1px solid #dddddd;
    	border-radius: 10px;
    	padding: 20px;
	}

</style>
</head>
<body>
	<div class="container-background" >
		<p>Confirmation message: Dear ${user.firstName}, your Registration completed successfully</p>
		<p>We also sent you a confirmation mail to your address: ${user.email}</p>
	</div>
</body>
</html>