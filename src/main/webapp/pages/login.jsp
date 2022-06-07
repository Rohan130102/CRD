<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Daily Work >> Login</title>
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
		<h5>Login</h5>
		<div class="my-4 new-user-div d-flex w-100 align-items-center">
			<h6 class="p-0 m-0">New user?</h6>
			<a href="signup.jsp" class="mx-3">Sign Up</a>
		</div>
		<form class="mt-4 form" method="POST" action="#">
			<div class="mb-2">
				<label for="exampleInputEmail1" class="form-label">Email</label>
				<input type="email" class="form-control" id="exampleInputEmail1"
					aria-describedby="emailHelp">
			</div>
			<div class="mb-2">
				<label for="exampleInputPassword1" class="form-label">Password</label>
				<input type="password" class="form-control"
					id="exampleInputPassword1">
			</div>
			<button type="submit" class="mt-4 btn btn-primary w-100">Login</button>
		</form>
	</div>
	
</body>
</html>