<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<nav class="sb-topnav navbar navbar-expand navbar-dark bg-dark">
	<!-- Navbar Brand-->
	<a class="navbar-brand ps-3" href="Trang-chu">Google API</a>
	<!-- Sidebar Toggle-->
	<button class="btn btn-link btn-sm order-1 order-lg-0 me-4 me-lg-0"
		id="sidebarToggle" href="#!">
		<i class="fas fa-bars"></i>
	</button>

</nav>
<div id="layoutSidenav">
	<div id="layoutSidenav_nav">
		<nav class="sb-sidenav accordion sb-sidenav-dark"
			id="sidenavAccordion">
			<div class="sb-sidenav-menu">
				<div class="nav">
					<div class="sb-sidenav-menu-heading">ADMIN</div>
					<a class="nav-link" href="Table">
						<div class="sb-nav-link-icon">
							<i class="fas fa-tachometer-alt"></i>
						</div>Danh sách địa điểm
					</a> <a class="nav-link" href="addDiaChi">
						<div class="sb-nav-link-icon">
							<i class="fas fa-tachometer-alt"></i>
						</div>Thêm Địa Điểm
					</a>
					<div class="sb-sidenav-menu-heading">USER</div>
					<a class="nav-link" href="/MapMVC/map">
						<div class="sb-nav-link-icon">
							<i class="fas fa-tachometer-alt"></i>
						</div>Map
					</a>
					<div class="collapse" id="collapsePages"
						aria-labelledby="headingTwo" data-bs-parent="#sidenavAccordion">
						<nav class="sb-sidenav-menu-nested nav accordion"
							id="sidenavAccordionPages">
							<a class="nav-link collapsed" href="#" data-bs-toggle="collapse"
								data-bs-target="#pagesCollapseAuth" aria-expanded="false"
								aria-controls="pagesCollapseAuth"> Authentication
								<div class="sb-sidenav-collapse-arrow">
									<i class="fas fa-angle-down"></i>
								</div>
							</a>
							<div class="collapse" id="pagesCollapseAuth"
								aria-labelledby="headingOne"
								data-bs-parent="#sidenavAccordionPages">
								<nav class="sb-sidenav-menu-nested nav">
									<a class="nav-link" href="login.html">Login</a> <a
										class="nav-link" href="register.html">Register</a> <a
										class="nav-link" href="password.html">Forgot Password</a>
								</nav>
							</div>
							<a class="nav-link collapsed" href="#" data-bs-toggle="collapse"
								data-bs-target="#pagesCollapseError" aria-expanded="false"
								aria-controls="pagesCollapseError"> Error
								<div class="sb-sidenav-collapse-arrow">
									<i class="fas fa-angle-down"></i>
								</div>
							</a>
						</nav>
					</div>

				</div>
			</div>

		</nav>
	</div>