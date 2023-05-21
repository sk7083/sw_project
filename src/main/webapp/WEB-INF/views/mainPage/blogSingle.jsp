<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Seaplace Hotel - Blog Single</title>

	<link rel="icon" href="resources/seapalace-master/img/favicon.png" type="image/png">
  <link rel="stylesheet" href="resources/seapalace-master/vendors/bootstrap/bootstrap.min.css">
  <link rel="stylesheet" href="resources/seapalace-master/vendors/fontawesome/css/all.min.css">
	<link rel="stylesheet" href="resources/seapalace-master/vendors/themify-icons/themify-icons.css">
	<link rel="stylesheet" href="resources/seapalace-master/vendors/linericon/style.css">
  <link rel="stylesheet" href="resources/seapalace-master/vendors/magnefic-popup/magnific-popup.css">

  <link rel="stylesheet" href="resources/seapalace-master/css/style.css">

</head>
<body>
	<!-- ================ header section start ================= -->	
	<header class="header_area">
    <div class="header-top">
      <div class="container">
        <div class="d-flex align-items-center">
          <div id="logo">
            <a href="<c:url value="/index"></c:url>"><img src="resources/seapalace-master/img/Logo.png" alt="" title="" /></a>
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
              <li class="nav-item"><a class="nav-link" href="<c:url value="/index"></c:url>">Home</a></li>
              <li class="nav-item"><a class="nav-link" href="<c:url value="/about"></c:url>">About</a></li>
              <li class="nav-item"><a class="nav-link" href="<c:url value="/properties"></c:url>">Properties</a></li>
              <li class="nav-item"><a class="nav-link" href="<c:url value="/gallery"></c:url>">Gallery</a></li>
              <li class="nav-item submenu dropdown">
                <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                aria-expanded="false">Blog</a>
                <ul class="dropdown-menu">
                  <li class="nav-item"><a class="nav-link" href="<c:url value="/about"></c:url>">Blog</a></li>
                  <li class="nav-item active"><a class="nav-link" href="<c:url value="/blogSingle"></c:url>">Blog Details</a></li>
                </ul>
              </li>
              <li class="nav-item"><a class="nav-link" href="<c:url value="/contact"></c:url>">Contact</a></li>
<!-- ================================= 관리자 전용 메뉴 [Start] ================================= -->
			
			<c:if test="${user.me_auth == 2}">
				<li class="nav-item submenu dropdown">
				  <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
				  aria-expanded="false">Manager</a>
			  	<ul class="dropdown-menu">
				    <li class="nav-item"><a class="nav-link" href="<c:url value="/memberManager"></c:url>">Management</a></li>
					<li class="nav-item"><a class="nav-link" href="<c:url value="/productManagerInfoList#tel123"></c:url>">Product</a></li>
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
	<section class="blog-banner-area" id="blog">
		<div class="container h-100">
			<div class="blog-banner">
				<div class="text-center">
					<h1>Blog Details</h1>
					<nav aria-label="breadcrumb" class="banner-breadcrumb">
            <ol class="breadcrumb">
              <li class="breadcrumb-item"><a href="#">Home</a></li>
              <li class="breadcrumb-item"><a href="#">Blog</a></li>
              <li class="breadcrumb-item active" aria-current="page">Blog Details</li>
            </ol>
          </nav>
				</div>
			</div>
    </div>
	</section>
	<!-- ================ end banner area ================= -->


	<!--================Blog Area =================-->
	<section class="blog_area single-post-area py-80px">
			<div class="container">
					<div class="row">
							<div class="col-lg-8 posts-list">
									<div class="single-post row">
											<div class="col-lg-12">
													<div class="feature-img">
															<img class="img-fluid" src="resources/seapalace-master/img/blog/feature-img1.jpg" alt="">
													</div>
											</div>
											<div class="col-lg-3  col-md-3">
													<div class="blog_info text-right">
															<div class="post_tag">
																	<a href="#">Food,</a>
																	<a class="active" href="#">Technology,</a>
																	<a href="#">Politics,</a>
																	<a href="#">Lifestyle</a>
															</div>
															<ul class="blog_meta list">
																	<li>
																			<a href="#">Mark wiens
																					<i class="lnr lnr-user"></i>
																			</a>
																	</li>
																	<li>
																			<a href="#">12 Dec, 2017
																					<i class="lnr lnr-calendar-full"></i>
																			</a>
																	</li>
																	<li>
																			<a href="#">1.2M Views
																					<i class="lnr lnr-eye"></i>
																			</a>
																	</li>
																	<li>
																			<a href="#">06 Comments
																					<i class="lnr lnr-bubble"></i>
																			</a>
																	</li>
															</ul>
															<ul class="social-links">
																	<li>
																			<a href="#">
																					<i class="fab fa-facebook-f"></i>
																			</a>
																	</li>
																	<li>
																			<a href="#">
																				<i class="fab fa-twitter"></i>																				
																			</a>
																	</li>
																	<li>
																			<a href="#">
																				<i class="fab fa-github"></i>																				
																			</a>
																	</li>
																	<li>
																			<a href="#">
																				<i class="fab fa-behance"></i>																				
																			</a>
																	</li>
															</ul>
													</div>
											</div>
											<div class="col-lg-9 col-md-9 blog_details">
													<h2>Astronomy Binoculars A Great Alternative</h2>
													<p class="excert">
															MCSE boot camps have its supporters and its detractors. Some people do not understand why you should have to spend money
															on boot camp when you can get the MCSE study materials yourself at a fraction.
													</p>
													<p>
															Boot camps have its supporters and its detractors. Some people do not understand why you should have to spend money on boot
															camp when you can get the MCSE study materials yourself at a fraction of the camp price.
															However, who has the willpower to actually sit through a self-imposed MCSE training. who
															has the willpower to actually sit through a self-imposed
													</p>
													<p>
															Boot camps have its supporters and its detractors. Some people do not understand why you should have to spend money on boot
															camp when you can get the MCSE study materials yourself at a fraction of the camp price.
															However, who has the willpower to actually sit through a self-imposed MCSE training. who
															has the willpower to actually sit through a self-imposed
													</p>
											</div>
											<div class="col-lg-12">
													<div class="quotes">
															MCSE boot camps have its supporters and its detractors. Some people do not understand why you should have to spend money
															on boot camp when you can get the MCSE study materials yourself at a fraction of the camp
															price. However, who has the willpower to actually sit through a self-imposed MCSE training.
													</div>
													<div class="row">
															<div class="col-6">
																	<img class="img-fluid" src="resources/seapalace-master/img/blog/post-img1.jpg" alt="">
															</div>
															<div class="col-6">
																	<img class="img-fluid" src="resources/seapalace-master/img/blog/post-img2.jpg" alt="">
															</div>
															<div class="col-lg-12 mt-4">
																	<p>
																			MCSE boot camps have its supporters and its detractors. Some people do not understand why you should have to spend money
																			on boot camp when you can get the MCSE study materials yourself at a fraction of
																			the camp price. However, who has the willpower.
																	</p>
																	<p>
																			MCSE boot camps have its supporters and its detractors. Some people do not understand why you should have to spend money
																			on boot camp when you can get the MCSE study materials yourself at a fraction of
																			the camp price. However, who has the willpower.
																	</p>
															</div>
													</div>
											</div>
									</div>
									<div class="navigation-area">
											<div class="row">
													<div class="col-lg-6 col-md-6 col-12 nav-left flex-row d-flex justify-content-start align-items-center">
															<div class="thumb">
																	<a href="#">
																			<img class="img-fluid" src="resources/seapalace-master/img/blog/prev.jpg" alt="">
																	</a>
															</div>
															<div class="arrow">
																	<a href="#">
																			<span class="lnr text-white lnr-arrow-left"></span>
																	</a>
															</div>
															<div class="detials">
																	<p>Prev Post</p>
																	<a href="#">
																			<h4>Space The Final Frontier</h4>
																	</a>
															</div>
													</div>
													<div class="col-lg-6 col-md-6 col-12 nav-right flex-row d-flex justify-content-end align-items-center">
															<div class="detials">
																	<p>Next Post</p>
																	<a href="#">
																			<h4>Telescopes 101</h4>
																	</a>
															</div>
															<div class="arrow">
																	<a href="#">
																			<span class="lnr text-white lnr-arrow-right"></span>
																	</a>
															</div>
															<div class="thumb">
																	<a href="#">
																			<img class="img-fluid" src="resources/seapalace-master/img/blog/next.jpg" alt="">
																	</a>
															</div>
													</div>
											</div>
									</div>
									<div class="comments-area">
											<h4>05 Comments</h4>
											<div class="comment-list">
													<div class="single-comment justify-content-between d-flex">
															<div class="user justify-content-between d-flex">
																	<div class="thumb">
																			<img src="resources/seapalace-master/img/blog/c1.jpg" alt="">
																	</div>
																	<div class="desc">
																			<h5>
																					<a href="#">Emilly Blunt</a>
																			</h5>
																			<p class="date">December 4, 2017 at 3:12 pm </p>
																			<p class="comment">
																					Never say goodbye till the end comes!
																			</p>
																	</div>
															</div>
															<div class="reply-btn">
																	<a href="" class="btn-reply text-uppercase">reply</a>
															</div>
													</div>
											</div>
											<div class="comment-list left-padding">
													<div class="single-comment justify-content-between d-flex">
															<div class="user justify-content-between d-flex">
																	<div class="thumb">
																			<img src="resources/seapalace-master/img/blog/c2.jpg" alt="">
																	</div>
																	<div class="desc">
																			<h5>
																					<a href="#">Elsie Cunningham</a>
																			</h5>
																			<p class="date">December 4, 2017 at 3:12 pm </p>
																			<p class="comment">
																					Never say goodbye till the end comes!
																			</p>
																	</div>
															</div>
															<div class="reply-btn">
																	<a href="" class="btn-reply text-uppercase">reply</a>
															</div>
													</div>
											</div>
											<div class="comment-list left-padding">
													<div class="single-comment justify-content-between d-flex">
															<div class="user justify-content-between d-flex">
																	<div class="thumb">
																			<img src="resources/seapalace-master/img/blog/c3.jpg" alt="">
																	</div>
																	<div class="desc">
																			<h5>
																					<a href="#">Annie Stephens</a>
																			</h5>
																			<p class="date">December 4, 2017 at 3:12 pm </p>
																			<p class="comment">
																					Never say goodbye till the end comes!
																			</p>
																	</div>
															</div>
															<div class="reply-btn">
																	<a href="" class="btn-reply text-uppercase">reply</a>
															</div>
													</div>
											</div>
											<div class="comment-list">
													<div class="single-comment justify-content-between d-flex">
															<div class="user justify-content-between d-flex">
																	<div class="thumb">
																			<img src="resources/seapalace-master/img/blog/c4.jpg" alt="">
																	</div>
																	<div class="desc">
																			<h5>
																					<a href="#">Maria Luna</a>
																			</h5>
																			<p class="date">December 4, 2017 at 3:12 pm </p>
																			<p class="comment">
																					Never say goodbye till the end comes!
																			</p>
																	</div>
															</div>
															<div class="reply-btn">
																	<a href="" class="btn-reply text-uppercase">reply</a>
															</div>
													</div>
											</div>
											<div class="comment-list">
													<div class="single-comment justify-content-between d-flex">
															<div class="user justify-content-between d-flex">
																	<div class="thumb">
																			<img src="resources/seapalace-master/img/blog/c5.jpg" alt="">
																	</div>
																	<div class="desc">
																			<h5>
																					<a href="#">Ina Hayes</a>
																			</h5>
																			<p class="date">December 4, 2017 at 3:12 pm </p>
																			<p class="comment">
																					Never say goodbye till the end comes!
																			</p>
																	</div>
															</div>
															<div class="reply-btn">
																	<a href="" class="btn-reply text-uppercase">reply</a>
															</div>
													</div>
											</div>
									</div>
									<div class="comment-form">
											<h4>Leave a Reply</h4>
											<form>
													<div class="form-group form-inline">
															<div class="form-group col-lg-6 col-md-6 name">
																	<input type="text" class="form-control" id="name" placeholder="Enter Name" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Enter Name'">
															</div>
															<div class="form-group col-lg-6 col-md-6 email">
																	<input type="email" class="form-control" id="email" placeholder="Enter email address" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Enter email address'">
															</div>
													</div>
													<div class="form-group">
															<input type="text" class="form-control" id="subject" placeholder="Subject" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Subject'">
													</div>
													<div class="form-group">
															<textarea class="form-control mb-10" rows="5" name="message" placeholder="Messege" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Messege'"
																	required=""></textarea>
													</div>
													<a href="#" class="button button-postComment button--active">Post Comment</a>
											</form>
									</div>
							</div>
							<div class="col-lg-4">
									<div class="blog_right_sidebar">
											<aside class="single_sidebar_widget search_widget">
													<div class="input-group">
															<input type="text" class="form-control" placeholder="Search Posts">
															<span class="input-group-btn">
																	<button class="btn btn-default" type="button">
																			<i class="lnr lnr-magnifier"></i>
																	</button>
															</span>
													</div>
													<!-- /input-group -->
													<div class="br"></div>
											</aside>
											<aside class="single_sidebar_widget author_widget">
													<img class="author_img rounded-circle" src="resources/seapalace-master/img/blog/author.png" alt="">
													<h4>Charlie Barber</h4>
													<p>Senior blog writer</p>
													<div class="social_icon">
                              <a href="#">
                                  <i class="fab fa-facebook-f"></i>
                              </a>
                              <a href="#">
                                  <i class="fab fa-twitter"></i>
                              </a>
                              <a href="#">
                                  <i class="fab fa-github"></i>
                              </a>
                              <a href="#">
                                <i class="fab fa-behance"></i>
                              </a>
                          </div>
													<p>Boot camps have its supporters andit sdetractors. Some people do not understand why you should
															have to spend money on boot camp when you can get. Boot camps have itssuppor ters andits
															detractors.
													</p>
													<div class="br"></div>
											</aside>
											<aside class="single_sidebar_widget popular_post_widget">
													<h3 class="widget_title">Popular Posts</h3>
													<div class="media post_item">
															<img src="resources/seapalace-master/img/blog/popular-post/post1.jpg" alt="post">
															<div class="media-body">
																	<a href="blog-details.html">
																			<h3>Space The Final Frontier</h3>
																	</a>
																	<p>02 Hours ago</p>
															</div>
													</div>
													<div class="media post_item">
															<img src="resources/seapalace-master/img/blog/popular-post/post2.jpg" alt="post">
															<div class="media-body">
																	<a href="blog-details.html">
																			<h3>The Amazing Hubble</h3>
																	</a>
																	<p>02 Hours ago</p>
															</div>
													</div>
													<div class="media post_item">
															<img src="resources/seapalace-master/img/blog/popular-post/post3.jpg" alt="post">
															<div class="media-body">
																	<a href="blog-details.html">
																			<h3>Astronomy Or Astrology</h3>
																	</a>
																	<p>03 Hours ago</p>
															</div>
													</div>
													<div class="media post_item">
															<img src="resources/seapalace-master/img/blog/popular-post/post4.jpg" alt="post">
															<div class="media-body">
																	<a href="blog-details.html">
																			<h3>Asteroids telescope</h3>
																	</a>
																	<p>01 Hours ago</p>
															</div>
													</div>
													<div class="br"></div>
											</aside>
											<aside class="single_sidebar_widget ads_widget">
													<a href="#">
															<img class="img-fluid" src="resources/seapalace-master/img/blog/add.jpg" alt="">
													</a>
													<div class="br"></div>
											</aside>
											<aside class="single_sidebar_widget post_category_widget">
													<h4 class="widget_title">Post Catgories</h4>
													<ul class="list cat-list">
															<li>
																	<a href="#" class="d-flex justify-content-between">
																			<p>Technology</p>
																			<p>37</p>
																	</a>
															</li>
															<li>
																	<a href="#" class="d-flex justify-content-between">
																			<p>Lifestyle</p>
																			<p>24</p>
																	</a>
															</li>
															<li>
																	<a href="#" class="d-flex justify-content-between">
																			<p>Fashion</p>
																			<p>59</p>
																	</a>
															</li>
															<li>
																	<a href="#" class="d-flex justify-content-between">
																			<p>Art</p>
																			<p>29</p>
																	</a>
															</li>
															<li>
																	<a href="#" class="d-flex justify-content-between">
																			<p>Food</p>
																			<p>15</p>
																	</a>
															</li>
															<li>
																	<a href="#" class="d-flex justify-content-between">
																			<p>Architecture</p>
																			<p>09</p>
																	</a>
															</li>
															<li>
																	<a href="#" class="d-flex justify-content-between">
																			<p>Adventure</p>
																			<p>44</p>
																	</a>
															</li>
													</ul>
													<div class="br"></div>
											</aside>
											<aside class="single-sidebar-widget newsletter_widget">
													<h4 class="widget_title">Newsletter</h4>
													<p>
															Here, I focus on a range of items and features that we use in life without giving them a second thought.
													</p>
													<div class="form-group d-flex flex-row">
															<div class="input-group">
																	<div class="input-group-prepend">
																			<div class="input-group-text">
																					<i class="fa fa-envelope" aria-hidden="true"></i>
																			</div>
																	</div>
																	<input type="text" class="form-control" id="inlineFormInputGroup" placeholder="Enter email address" onfocus="this.placeholder = ''"
																			onblur="this.placeholder = 'Enter email'">
															</div>
															<a href="#" class="bbtns">Subcribe</a>
													</div>
													<p class="text-bottom">You can unsubscribe at any time</p>
													<div class="br"></div>
											</aside>
											<aside class="single-sidebar-widget tag_cloud_widget">
													<h4 class="widget_title">Tag Clouds</h4>
													<ul class="list">
															<li>
																	<a href="#">Technology</a>
															</li>
															<li>
																	<a href="#">Fashion</a>
															</li>
															<li>
																	<a href="#">Architecture</a>
															</li>
															<li>
																	<a href="#">Fashion</a>
															</li>
															<li>
																	<a href="#">Food</a>
															</li>
															<li>
																	<a href="#">Technology</a>
															</li>
															<li>
																	<a href="#">Lifestyle</a>
															</li>
															<li>
																	<a href="#">Art</a>
															</li>
															<li>
																	<a href="#">Adventure</a>
															</li>
															<li>
																	<a href="#">Food</a>
															</li>
															<li>
																	<a href="#">Lifestyle</a>
															</li>
															<li>
																	<a href="#">Adventure</a>
															</li>
													</ul>
											</aside>
									</div>
							</div>
					</div>
			</div>
	</section>
	<!--================Blog Area =================-->



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