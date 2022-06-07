<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DailyWork >> New Task</title>
<%@include file="/css/base.jsp"%>
<style type="text/css">
body {
	background: #57b2ea;
}

body .div {
	width: 70vh;
	background: white;
	border-radius: 10px;
	box-shadow: 1px 1px 2px 2px;
}
</style>
</head>
<body>
	<div class="div p-4">
		<h5>New Task</h5>
		<form class="mt-4 form" method="POST" action="#">
			<div class="mb-2">
				<label for="name" class="form-label">Title</label>
				<input type="text" class="form-control" id="name" required>
			</div>
			<div class="mb-2">
				<label for="desc" class="form-label">Description</label>
				<textarea class="form-control" id="desc" style="height: 180px" ></textarea>
			</div>
			<div class="d-flex w-100 justify-content-around">
				<input type="submit" value="Add" class="mt-4 btn btn-primary w-50" />
				<input type="submit" value="Cancel" formaction="#" class="mt-4 btn btn-danger w-25" />
			</div>
		</form>
	</div>
</body>
</html>