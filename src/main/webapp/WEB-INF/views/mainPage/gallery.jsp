<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>Seaplace Hotel - Gallery</title>
	
	<link rel="icon" href="resources/seapalace-master/img/favicon.png" type="image/png">
  <link rel="stylesheet" href="resources/seapalace-master/vendors/bootstrap/bootstrap.min.css">
  <link rel="stylesheet" href="resources/seapalace-master/vendors/fontawesome/css/all.min.css">
	<link rel="stylesheet" href="resources/seapalace-master/vendors/themify-icons/themify-icons.css">
	<link rel="stylesheet" href="resources/seapalace-master/vendors/linericon/style.css">
	<link rel="stylesheet" href="resources/seapalace-master/vendors/magnefic-popup/magnific-popup.css">
  <link rel="stylesheet" href="resources/seapalace-master/vendors/nice-select/nice-select.css">	

	<link rel="stylesheet" href="resources/seapalace-master/css/style.css">
</head>
<body>
	<!-- ================ header section start ================= -->	
	<header class="header_area">
    <div class="header-top">
      <div class="container">
        <div class="d-flex align-items-center">
          <div id="logo">
            <a href="index.html"><img src="resources/seapalace-master/img/Logo.png" alt="" title="" /></a>
          </div>
          <div class="ml-auto d-none d-md-block d-md-flex">
            <div class="media header-top-info">
              <span class="header-top-info__icon"><i class="fas fa-phone-volume"></i></span>
              <div class="media-body">
                <p>Have any question?</p>
                <p>Free: <a href="tel:+12 365 5233">+12 365 5233</a></p>
              </div>
            </div>
            <div class="media header-top-info">
              <span class="header-top-info__icon"><i class="ti-email"></i></span>
              <div class="media-body">
                <p>Have any question?</p>
                <p>Free: <a href="tel:+12 365 5233">+12 365 5233</a></p>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>


    <div class="main_menu">
      <nav class="navbar navbar-expand-lg navbar-light">
        <div class="container">
          <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
          aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <!-- Collect the nav links, forms, and other content for toggling -->
          <div class="collapse navbar-collapse offset" id="navbarSupportedContent">
            <ul class="nav navbar-nav menu_nav">
              <li class="nav-item"><a class="nav-link" href="index.html">Home</a></li>
              <li class="nav-item"><a class="nav-link" href="about.html">About</a></li>
              <li class="nav-item"><a class="nav-link" href="properties.html">Properties</a></li>
              <li class="nav-item active"><a class="nav-link" href="gallery.html">Gallery</a></li>
              <li class="nav-item submenu dropdown">
                <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                aria-expanded="false">Blog</a>
                <ul class="dropdown-menu">
                  <li class="nav-item"><a class="nav-link" href="blog.html">Blog</a></li>
                  <li class="nav-item"><a class="nav-link" href="blog-single.html">Blog Details</a></li>
                </ul>
              </li>
              <li class="nav-item"><a class="nav-link" href="contact.html">Contact</a></li>
<!-- ================================= 관리자 전용 메뉴 [Start] ================================= -->
			
			<c:if test="${user.me_auth == 2}">
				<li class="nav-item submenu dropdown">
				  <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
				  aria-expanded="false">Manager</a>
			  	<ul class="dropdown-menu">
				    <li class="nav-item"><a class="nav-link" href="<c:url value="/memberManager"></c:url>">Management</a></li>
					<li class="nav-item"><a class="nav-link" href="<c:url value="/productInsert"></c:url>">Product Add</a></li>
					<li class="nav-item"><a class="nav-link" href="<c:url value="/boardInsert"></c:url>">Notice</a></li>
				</ul>
				</li>
			</c:if>
<!-- ================================= 관리자 전용 메뉴 [End] ================================= -->
            </ul>
          </div>

          <ul class="social-icons ml-auto">
            <li><a href="#"><i class="fab fa-facebook-f"></i></a></li>
            <li><a href="#"><i class="fab fa-linkedin-in"></i></a></li>
            <li><a href="#"><i class="fab fa-twitter"></i></a></li>
            <li><a href="#"><i class="fab fa-google-plus-g"></i></a></li>
            <li><a href="#"><i class="fas fa-rss"></i></a></li>
          </ul>
        </div>
      </nav>
    </div>
	</header>
	<!-- ================ header section end ================= -->	
  
  <!-- ================ start banner area ================= -->	
	<section class="contact-banner-area" id="gallery">
		<div class="container h-100">
			<div class="contact-banner">
				<div class="text-center">
					<h1>Gallery</h1>
					<nav aria-label="breadcrumb" class="banner-breadcrumb">
            <ol class="breadcrumb">
              <li class="breadcrumb-item"><a href="#">Home</a></li>
              <li class="breadcrumb-item active" aria-current="page">Gallery</li>
            </ol>
          </nav>
				</div>
			</div>
    </div>
	</section>
  <!-- ================ end banner area ================= -->
	
  <!-- ================ start gallery section ================= -->	
	<section class="section-margin">
    <div class="container">
      <div class="section-intro text-center pb-80px">
        <div class="section-intro__style">
          <img src="resources/seapalace-master/img/home/bed-icon.png" alt="">
        </div>
        <h2>Our Gallery</h2>
			</div>

			<div class="row">
				<div class="col-md-5">
					<div class="row">
						<div class="col-12 mb-4">
							<a href="resources/seapalace-master/img/gallery/g1.png" class="img-gal card-img">
								<div class="single-imgs relative">		
									<div class="overlay overlay-bg"></div>
									<div class="relative">				
										<img class="card-img rounded-0" src="resources/seapalace-master/img/gallery/g1.png" alt="">		
									</div>
								</div>
							</a>
						</div>
						<div class="col-12 mb-4">
							<a href="resources/seapalace-master/img/gallery/g2.png" class="img-gal card-img">
								<div class="single-imgs relative">		
									<div class="overlay overlay-bg"></div>
									<div class="relative">				
										<img class="card-img rounded-0" src="resources/seapalace-master/img/gallery/g2.png" alt="">		
									</div>
								</div>
							</a>
						</div>
					</div>
				</div>

				<div class="col-md-7">
					<div class="row">
						<div class="col-sm-7 mb-4">
							<a href="resources/seapalace-master/img/gallery/g3.png" class="img-gal card-img">
								<div class="single-imgs relative">		
									<div class="overlay overlay-bg"></div>
									<div class="relative">				
										<img class="card-img rounded-0" src="resources/seapalace-master/img/gallery/g3.png" alt="">		
									</div>
								</div>
							</a>
						</div>
						<div class="col-sm-5 mb-4">
							<a href="resources/seapalace-master/img/gallery/g4.png" class="img-gal card-img">
								<div class="single-imgs relative">		
									<div class="overlay overlay-bg"></div>
									<div class="relative">				
										<img class="card-img rounded-0" src="resources/seapalace-master/img/gallery/g4.png" alt="">		
									</div>
								</div>
							</a>
						</div>
					</div>
					<div class="row">
						<div class="col-12 mb-4">
							<a href="resources/seapalace-master/img/gallery/g5.png" class="img-gal card-img">
								<div class="single-imgs relative">		
									<div class="overlay overlay-bg"></div>
									<div class="relative">				
										<img class="card-img rounded-0" src="resources/seapalace-master/img/gallery/g5.png" alt="">		
									</div>
								</div>
							</a>
						</div>
					</div>
					<div class="row">
						<div class="col-sm-7 mb-4">
							<a href="resources/seapalace-master/img/gallery/g6.png" class="img-gal card-img">
								<div class="single-imgs relative">		
									<div class="overlay overlay-bg"></div>
									<div class="relative">				
										<img class="card-img rounded-0" src="resources/seapalace-master/img/gallery/g6.png" alt="">		
									</div>
								</div>
							</a>
						</div>
						<div class="col-sm-5 mb-4">
							<a href="resources/seapalace-master/img/gallery/g7.png" class="img-gal card-img">
								<div class="single-imgs relative">		
									<div class="overlay overlay-bg"></div>
									<div class="relative">				
										<img class="card-img rounded-0" src="resources/seapalace-master/img/gallery/g7.png" alt="">		
									</div>
								</div>
							</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
  <!-- ================ end gallery section ================= -->	
  





  <!-- ================ start footer Area ================= -->
  <footer class="footer-area section-gap">
		<div class="container">
			<div class="row">
				<div class="col-xl-2 col-sm-6 mb-4 mb-xl-0 single-footer-widget">
					<h4>Top Products</h4>
					<ul>
						<li><a href="#">Managed Website</a></li>
						<li><a href="#">Manage Reputation</a></li>
						<li><a href="#">Power Tools</a></li>
						<li><a href="#">Marketing Service</a></li>
					</ul>
				</div>
				<div class="col-xl-2 col-sm-6 mb-4 mb-xl-0 single-footer-widget">
					<h4>Quick Links</h4>
					<ul>
						<li><a href="#">Jobs</a></li>
						<li><a href="#">Brand Assets</a></li>
						<li><a href="#">Investor Relations</a></li>
						<li><a href="#">Terms of Service</a></li>
					</ul>
				</div>
				<div class="col-xl-2 col-sm-6 mb-4 mb-xl-0 single-footer-widget">
					<h4>Features</h4>
					<ul>
						<li><a href="#">Jobs</a></li>
						<li><a href="#">Brand Assets</a></li>
						<li><a href="#">Investor Relations</a></li>
						<li><a href="#">Terms of Service</a></li>
					</ul>
				</div>
				<div class="col-xl-2 col-sm-6 mb-4 mb-xl-0 single-footer-widget">
					<h4>Resources</h4>
					<ul>
						<li><a href="#">Guides</a></li>
						<li><a href="#">Research</a></li>
						<li><a href="#">Experts</a></li>
						<li><a href="#">Agencies</a></li>
					</ul>
				</div>
				<div class="col-xl-4 col-md-8 mb-4 mb-xl-0 single-footer-widget">
					<h4>Newsletter</h4>
					<p>You can trust us. we only send promo offers,</p>
					<div class="form-wrap" id="mc_embed_signup">
						<form target="_blank" action="https://spondonit.us12.list-manage.com/subscribe/post?u=1462626880ade1ac87bd9c93a&amp;id=92a4423d01"
						 method="get" class="form-inline">
							<input class="form-control" name="EMAIL" placeholder="Your Email Address" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Your Email Address '"
							 required="" type="email">
							<button class="click-btn btn btn-default text-uppercase">subscribe</button>
							<div style="position: absolute; left: -5000px;">
								<input name="b_36c4fd991d266f23781ded980_aefe40901a" tabindex="-1" value="" type="text">
							</div>

							<div class="info"></div>
						</form>
					</div>
				</div>
			</div>
			<div class="footer-bottom row align-items-center text-center text-lg-left">
				<p class="footer-text m-0 col-lg-8 col-md-12"><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="fa fa-heart" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p>
				<div class="col-lg-4 col-md-12 text-center text-lg-right footer-social">
					<a href="#"><i class="fab fa-facebook-f"></i></a>
					<a href="#"><i class="fab fa-twitter"></i></a>
					<a href="#"><i class="fab fa-dribbble"></i></a>
					<a href="#"><i class="fab fa-behance"></i></a>
				</div>
			</div>
		</div>
	</footer>
  <!-- ================ End footer Area ================= -->



  <script src="resources/seapalace-master/vendors/jquery/jquery-3.2.1.min.js"></script>
  <script src="resources/seapalace-master/vendors/bootstrap/bootstrap.bundle.min.js"></script>
  <script src="resources/seapalace-master/vendors/magnefic-popup/jquery.magnific-popup.min.js"></script>
	<script src="resources/seapalace-master/vendors/easing.min.js"></script>
	<script src="resources/seapalace-master/vendors/superfish.min.js"></script>
	<script src="resources/seapalace-master/vendors/nice-select/jquery.nice-select.min.js"></script>
  <script src="resources/seapalace-master/vendors/jquery.ajaxchimp.min.js"></script>
  <script src="resources/seapalace-master/vendors/mail-script.js"></script>
  <script src="resources/seapalace-master/js/main.js"></script>
</body>
</html>