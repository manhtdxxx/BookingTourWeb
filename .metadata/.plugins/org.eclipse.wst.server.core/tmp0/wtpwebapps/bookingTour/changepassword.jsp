<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="vi">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Đổi mật khẩu</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

<style>
/* Background gradient */
body {
	background: linear-gradient(to right, #89f7fe, #66a6ff);
	font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
}
/* Form container styling */
.form-container {
	max-width: 450px;
	padding: 2.5rem;
	background-color: #ffffff;
	border-radius: 12px;
	box-shadow: 0 8px 24px rgba(0, 0, 0, 0.2);
	margin: 0 1.5rem;
	transition: transform 0.3s ease;
	min-width: 400px;
	position: relative;
}
/* Hover effect on container */
.form-container:hover {
	transform: scale(1.02);
}
/* Header style */
h2 {
	font-weight: bold;
	color: #343a40;
}
/* Labels styling */
.form-label {
	color: #495057;
	font-weight: 600;
}
/* Input fields styling */
.form-control {
	border: 2px solid #ced4da;
	border-radius: 8px;
	padding: 0.5rem;
	transition: border-color 0.3s ease, box-shadow 0.3s ease;
}

.form-control:focus {
	border-color: #66a6ff;
	box-shadow: 0 0 8px rgba(102, 166, 255, 0.3);
}
/* Button styling */
.btn-primary {
	background-color: #66a6ff;
	border-color: #66a6ff;
	padding: 0.6rem;
	font-size: 1.1rem;
	font-weight: 600;
	border-radius: 8px;
	transition: background-color 0.3s, box-shadow 0.3s, transform 0.2s ease;
}

.btn-primary:hover {
	background-color: #0056b3;
	box-shadow: 0 6px 16px rgba(0, 91, 187, 0.4);
	transform: translateY(-2px);
}
</style>
</head>

<body class="d-flex align-items-center justify-content-center vh-100">

	<%
	String error = (String) request.getAttribute("error");
	error = (error != null) ? error : "";
	%>

	<div class="form-container">
		<h1 class="text-center mb-4">Đổi Mật Khẩu</h1>

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

		<form action="change-password" method="post">
			<div class="mb-3">
				<label for="currentPassword" class="form-label">Current Password</label> <input type="password"
					class="form-control" id="currentPassword" name="currentPassword"
					placeholder="Nhập mật khẩu hiện tại" required>
			</div>
			<div class="mb-3">
				<label for="newPassword" class="form-label">New Password</label> <input type="password"
					class="form-control" id="newPassword" name="newPassword" placeholder="Nhập mật khẩu mới">
			</div>
			<div class="mb-3">
				<label for="confirmPassword" class="form-label">Confirm Password</label> <input type="password"
					class="form-control" id="confirmPassword" name="confirmPassword"
					placeholder="Xác nhận mật khẩu mới" required>
				<div id="msg" class="text-danger fw-medium mb-3 mt-1"></div>
			</div>
			<button type="submit" class="btn btn-primary w-100">Đổi Mật Khẩu</button>
		</form>
	</div>


	<script type="text/javascript">
		document.addEventListener("DOMContentLoaded", confirmPassword); // Run on page load

		function confirmPassword() {
			let pass_1 = document.getElementById("newPassword").value;
			let pass_2 = document.getElementById("confirmPassword").value;
			let msg = document.getElementById("msg");
			let submitBtn = document.querySelector("button[type='submit']");

			if (pass_1 !== pass_2) {
				msg.innerHTML = "Mật khẩu không khớp!";
				submitBtn.disabled = true;
			} else {
				msg.innerHTML = "";
				submitBtn.disabled = false;
			}
		}

		// Event listeners for keyup on both fields
		document.getElementById("newPassword").addEventListener("keyup",
				confirmPassword);
		document.getElementById("confirmPassword").addEventListener("keyup",
				confirmPassword);
	</script>

</body>
</html>
