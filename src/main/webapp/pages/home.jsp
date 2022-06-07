
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DailyWork | Track your daily tasks</title>
<%@include file="/css/base.jsp"%>
<style type="text/css">

	body {
		background: #57b2ea;
	}

	body .div {
		width: 50vw;
		background: white;
		border-radius: 10px;
		box-shadow: 1px 1px 2px 2px;
	}
	
	body .div img {
		width: 50px;
		height: 50px;
	}
	
	body .div .list {
		max-height: 60vh;
		overflow: scroll;
	}
	
	.list li .icon {
		text-decoration: none;
		padding: 10px;
		font-size: 1.2em;
	}
	
	.list li #delete:hover {
		color: #E74C3C!important;
	}
	
	.list li #edit:hover {
		color: #3498DB!important;
	}
	
</style>
</head>
<body>
	<div class="div p-4">
		<div class="d-flex w-100 mb-4 justify-content-between">
			<div class="title d-flex align-items-center">
				<img src="../images/todo.png" alt="task" />
				<h4 class="p-0">Tasks</h4>			
			</div>
			<a href="#" style="font-size: 2.3em; margin-right: 12px;"><i class="bi bi-plus-circle-fill"></i></a>
		</div>
		<%
		List<String> list = new ArrayList<>();
		for (int i=1; i < 10; i++) {
			list.add("Task " + i);
			
		}
		%>
		<ol class="list list-group list-group-numbered">
		<%
		for (String s : list) {
		%>
			<li class="list-group-item d-flex justify-content-between align-items-start">
				<div class="ms-2 me-auto">
					<div class="fw-bold"><%=s%></div>
					Content for list item
				</div>
				<div class="d-flex">
					<a href="#" id="edit" class="icon text-dark"><i class="bi bi-pencil-square"></i></a>
					<a href="#" id="delete" class="icon text-dark"><i class="bi bi-trash3-fill"></i></a>
				</div>
			</li>
		<%
		}
		%>
		</ol>
	</div>
</body>
</html>