<%@page import="model.KhachHang"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Trang chủ</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

<link rel="stylesheet" href="css/index.css">
</head>

<body>
	<nav class="navbar navbar-expand-md bg-dark navbar-dark">
		<div class="container-fluid px-3">

			<!-- LOGO -->
			<a class="navbar-brand me-auto d-flex align-items-center" href="#"> <img
				src="images/banner1.jpg" alt="Logo" class="rounded-circle me-2"
				style="width: 50px; height: auto;"> <span class="navbar-text text-light fw-bold">Logo</span>
			</a>

			<!-- TOGGLER BUTTON FOR MOBILE VIEW -->
			<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
				data-bs-target="#navbarNav">
				<span class="navbar-toggler-icon"></span>
			</button>

			<!-- NAV LINKS SECTION -->
			<div class="collapse navbar-collapse justify-content-center me-auto" id="navbarNav">
				<!-- NAV LINKS -->
				<ul class="navbar-nav">
					<li class="nav-item me-3"><a class="nav-link text-light" href="index.jsp">Trang chủ</a></li>
					<li class="nav-item dropdown me-3"><a class="nav-link dropdown-toggle text-light" href="#"
						role="button" data-bs-toggle="dropdown"> Danh Mục Sản Phẩm </a>
						<ul class="dropdown-menu shadow">
							<li><a class="dropdown-item" href="#">Link 1</a></li>
							<li><a class="dropdown-item" href="#">Another Link</a></li>
							<li><a class="dropdown-item" href="#">Third Link</a></li>
						</ul></li>
					<li class="nav-item me-3"><a class="nav-link text-light" href="#">About</a></li>
					<li class="nav-item"><a class="nav-link text-light" href="#">Contact</a></li>
				</ul>
			</div>

			<!-- LOGIN/REGISTER OR PROFILE SECTION -->
			<div class="d-flex ms-auto">
				<%
				Object obj = session.getAttribute("khachHang");
				KhachHang khachHang = (obj != null) ? (KhachHang) obj : null;

				if (khachHang == null) {
				%>
				<a href="login.jsp" class="btn btn-outline-light me-2">Đăng nhập</a> <a href="register.jsp"
					class="btn btn-primary">Đăng ký</a>
				<%
				} else {
				%>
				<div class="dropdown">
					<button type="button" class="btn btn-outline-light dropdown-toggle" data-bs-toggle="dropdown">
						<%=khachHang.getUsername()%>
					</button>
					<ul class="dropdown-menu dropdown-menu-end shadow">
						<li><a class="dropdown-item" href="profile.jsp">Thông tin cá nhân</a></li>
						<li><a class="dropdown-item" href="changepassword.jsp">Đổi mật khẩu</a></li>
						<li><hr class="dropdown-divider"></li>
						<li><a class="dropdown-item" href="do-logout">Thoát</a></li>
					</ul>
				</div>
				<%
				}
				%>
			</div>
		</div>
	</nav>


	<section>
		<div class="container banner mt-1">
			<div>
				<h1>DU LỊCH VIỆT NAM</h1>
				<p>Trải nghiệm khắp đất nước Việt Nam với Pystravel</p>
				<a href="https://pystravel.vn">Khám phá</a>
			</div>
			<img alt="" src="images/banner1.jpg">
		</div>
	</section>

	<section>
		<div class="container mt-5">
			<h1>TOUR HOT TRONG THÁNG</h1>
			<div class="row">
				<div class="col-md-3 p-3">
					<div class="card">
						<img alt="" src="images/banner1.jpg">
					</div>
				</div>
				<div class="col-md-3 p-3">
					<div class="card">
						<img alt="" src="images/banner1.jpg">
					</div>
				</div>
				<div class="col-md-3 p-3">
					<div class="card">
						<img alt="" src="images/banner1.jpg">
					</div>
				</div>
				<div class="col-md-3 p-3">
					<div class="card">
						<img alt="" src="images/banner1.jpg">
					</div>
				</div>
			</div>
		</div>
	</section>

	<section>
		<div class="container mt-3">
			<div class="row">
				<!-- LEFT CONTENT -->
				<div class="col-md-6">
					<h1>TOUR TRONG NƯỚC</h1>
					<div class="row box-hot-tour">
						<div class="col-md-6">
							<img alt="" src="images/banner1.jpg">
						</div>
						<div class="col-md-6">
							<a href="#">Tour Nha Trang</a>
							<p>Giá Tour: 2.300.000 VNĐ</p>
						</div>
					</div>
					<div class="row box-hot-tour">
						<div class="col-md-6">
							<img alt="" src="images/banner1.jpg">
						</div>
						<div class="col-md-6">
							<a href="#">Tour Nha Trang</a>
							<p>Giá Tour: 2.300.000 VNĐ</p>
						</div>
					</div>
					<div class="row box-hot-tour">
						<div class="col-md-6">
							<img alt="" src="images/banner1.jpg">
						</div>
						<div class="col-md-6">
							<a href="#">Tour Nha Trang</a>
							<p>Giá Tour: 2.300.000 VNĐ</p>
						</div>
					</div>
				</div>

				<!-- RIGHT CONTENT -->
				<div class="col-md-6">
					<h1>TOUR NƯỚC NGOÀI</h1>
					<div class="row box-hot-tour">
						<div class="col-md-6">
							<img alt="" src="images/banner1.jpg">
						</div>
						<div class="col-md-6">
							<a href="#">Tour Nha Trang</a>
							<p>Giá Tour: 2.300.000 VNĐ</p>
						</div>
					</div>
					<div class="row box-hot-tour">
						<div class="col-md-6">
							<img alt="" src="images/banner1.jpg">
						</div>
						<div class="col-md-6">
							<a href="#">Tour Nha Trang</a>
							<p>Giá Tour: 2.300.000 VNĐ</p>
						</div>
					</div>
					<div class="row box-hot-tour">
						<div class="col-md-6">
							<img alt="" src="images/banner1.jpg">
						</div>
						<div class="col-md-6">
							<a href="#">Tour Nha Trang</a>
							<p>Giá Tour: 2.300.000 VNĐ</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>

	<section>
		<div class="container mt-5">
			<h1>Danh Mục Sản Phẩm</h1>
			<div class="row">
				<div class="col-md-4 box-category">
					<a href="#">Tour Team Building</a> <img alt="" src="images/banner1.jpg">
				</div>
				<div class="col-md-4 box-category">
					<a href="#">Tour Team Building</a> <img alt="" src="images/banner1.jpg">
				</div>
				<div class="col-md-4 box-category">
					<a href="#">Tour Team Building</a> <img alt="" src="images/banner1.jpg">
				</div>
			</div>
			<div class="row mt-3">
				<div class="col-md-4 box-category">
					<a href="#">Tour Team Building</a> <img alt="" src="images/banner1.jpg">
				</div>
				<div class="col-md-4 box-category">
					<a href="#">Tour Team Building</a> <img alt="" src="images/banner1.jpg">
				</div>
				<div class="col-md-4 box-category">
					<a href="#">Tour Team Building</a> <img alt="" src="images/banner1.jpg">
				</div>
			</div>
		</div>
	</section>
</body>
</html>