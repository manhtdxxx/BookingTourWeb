<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Trang đăng ký</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

<style type="text/css">
body {
	background: linear-gradient(135deg, #e3f2fd, #bbdefb);
	min-height: 100vh;
	display: flex;
	align-items: center;
	justify-content: center;
	color: #424242;
}

.container {
	max-width: 500px;
	background: #ffffff;
	box-shadow: 0 8px 20px rgba(0, 0, 0, 0.1);
	border-radius: 12px;
	padding: 2.5rem 3rem;
	border: 1px solid #e0e0e0;
	transition: all 0.3s ease;
}

.container:hover {
	box-shadow: 0 12px 25px rgba(0, 0, 0, 0.2);
	transform: translateY(-3px);
}

h1 {
	color: #1976d2;
	font-weight: 700;
	transition: color 0.3s;
}

h1:hover {
	color: #0d47a1;
}

.red {
	color: #d32f2f;
}

.form-label {
	font-weight: 500;
	color: #616161;
}

.form-check-label a {
	color: #1976d2;
	text-decoration: none;
	transition: color 0.3s ease;
}

.form-check-label a:hover {
	color: #0d47a1;
}

.btn-primary {
	width: 100%;
	background-color: #1976d2;
	border-color: #1976d2;
	font-weight: bold;
	transition: background-color 0.3s, transform 0.3s;
}

.btn-primary:hover {
	background-color: #0d47a1;
	border-color: #0d47a1;
	transform: translateY(-2px);
}

.alert-danger {
	background-color: #ffebee;
	color: #d32f2f;
	border-color: #ffcdd2;
}
</style>
</head>

<body>
	<%
	String error = (String) request.getAttribute("error");
	error = (error != null) ? error : "";
	String username = (String) request.getAttribute("username");
	String email = (String) request.getAttribute("email");
	String password = (String) request.getAttribute("password");
	String password2 = (String) request.getAttribute("password2");
	%>
	<div class="container">
		<div class="text-center mb-4">
			<h1>Đăng ký tài khoản</h1>
		</div>

		<!-- Error Message -->
		<%
		if (!error.isEmpty()) {
		%>
		<div class="alert alert-danger alert-dismissible fade show">
			<button type="button" class="btn-close" data-bs-dismiss="alert"></button>
			<strong><%=error%></strong>
		</div>
		<%
		}
		%>

		<form action="do-register" method="post">
			<div class="mb-3">
				<label for="username" class="form-label">Username<span class="red">*</span></label> <input
					type="text" class="form-control" id="username" placeholder="Enter username" name="username"
					value="<%=username != null ? username : ""%>" required="required" oninput="showSubmitButton()">
			</div>
			<div class="mb-3">
				<label for="email" class="form-label">Email<span class="red">*</span></label> <input
					type="email" class="form-control" id="email" placeholder="Enter email" name="email"
					value="<%=email != null ? email : ""%>" required="required" oninput="showSubmitButton()">
			</div>
			<div class="mb-3">
				<label for="password" class="form-label">Password<span class="red">*</span></label> <input
					type="password" class="form-control" id="password" placeholder="Enter password" name="password"
					value="<%=password != null ? password : ""%>" required="required"
					onkeyup="confirmPassword(); oninput=showSubmitButton()">
			</div>
			<div class="mb-3">
				<label for="password2" class="form-label">Confirm Password<span class="red">*</span></label> <input
					type="password" class="form-control" id="password2" placeholder="Enter password again"
					name="password2" value="<%=password2 != null ? password2 : ""%>" required="required"
					onkeyup="confirmPassword(); oninput=showSubmitButton()">
				<div id="msg" class="text-danger mb-3 mt-1"></div>
			</div>
			<div class="form-check mb-3">
				<input class="form-check-input" type="checkbox" name="agree" id="agree"
					onchange="showSubmitButton()"> <label class="form-check-label">I agree to the <a
					href="#">terms of service</a></label>
			</div>
			<button type="submit" class="btn btn-primary" id="submit" style="visibility: hidden;">Register</button>
		</form>
	</div>

	<script type="text/javascript">
		function confirmPassword() {
			let pass_1 = document.getElementById("password").value;
			let pass_2 = document.getElementById("password2").value;
			let msg = document.getElementById("msg");
			if (pass_1 !== pass_2) {
				msg.innerHTML = "Mật khẩu không khớp!";
				return false;
			} else {
				msg.innerHTML = "";
				return true;
			}
		}

		function showSubmitButton() {
			let username = document.getElementById("username").value.trim();
			let email = document.getElementById("email").value.trim();
			let password = document.getElementById("password").value.trim();
			let password2 = document.getElementById("password2").value.trim();
			let agree = document.getElementById("agree").checked;
			let submitButton = document.getElementById("submit");

			if (username && email && password && password2 && confirmPassword()
					&& agree) {
				submitButton.style.visibility = "visible";
			} else {
				submitButton.style.visibility = "hidden";
			}
		}
	</script>
</body>
</html>