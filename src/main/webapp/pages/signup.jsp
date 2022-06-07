<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DailyWork >> SignUp</title>
<%@include file="/css/base.jsp"%>
<style type="text/css">

	body {
		background: #57b2ea;
	}

	body .div {
		width: 60vh;
		background: white;
		border-radius: 10px;
		box-shadow: 1px 1px 2px 2px;
	}
	
</style>
</head>
<body>
	<div class="div p-4">
		<h5>SignUp</h5>
		<div class="my-4 new-user-div d-flex w-100 align-items-center">
			<h6 class="p-0 m-0">Already have an account?</h6>
			<a href="login.jsp" class="mx-3">Login</a>
		</div>
		<form class="mt-4 form" method="POST" onsubmit="return validate()" action="login.jsp">
			<div class="mb-2">
				<label for="name" class="form-label">Name</label>
				<input type="text" class="form-control" id="name" required>
			</div>
			<div class="mb-2">
				<label for="email" class="form-label">Email</label>
				<input type="email" class="form-control" id="email" required>
			</div>
			<div class="mb-2">
				<label for="password" class="form-label">Password</label>
				<input type="password" class="form-control" id="password" required>
			</div>
			<div class="mb-2">
				<label for="rePassword" class="form-label">Re-Enter Password</label>
				<input type="password" class="form-control" id="rePassword" required>
			</div>
			<button type="submit" class="mt-4 btn btn-primary w-100">Sign Up</button>
		</form>
	</div>
	
<script type="text/javascript">

	const validate = () => {
		
		const pass = document.getElementById("password");
		const rePass = document.getElementById("rePassword");
		
		if (pass.value !== rePass.value) {
			alert("Password did not matched!");
			pass.value = "";
			rePass.value = "";
			return false;
		}
	}

</script>
</body>
</html>