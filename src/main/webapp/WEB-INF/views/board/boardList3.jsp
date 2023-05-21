<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- 게시판 *이벤트 jsp 입니다. -->

	<!-- ================ Style Start ================= -->	
<style>

.success1{
	border: 2px solid #cca772;
	background: #cca772;
	font-weight: 700;
	cursor: pointer;
	text-transform: uppercase;
	color: #fff;
	font-family: "Playfair Display", serif;
	text-decoration: none;
}
.success1:hover{
	background-color: white;
	color: black;
}

.modal {
     position: absolute;
     top: 0;
     left: 0;
     width: 100%;
     height: 100%;
     display: none;
     background-color: rgba(0, 0, 0, 0.4);
}
		
.modal.show {
  display: block;
}

.modal_body {
  position: absolute;
  top: 55%;
  left: 50%;

  width: 400px;
  height: 600px;

  padding: 40px;

  text-align: center;

  background-color: rgb(255, 255, 255);
  border-radius: 10px;
  box-shadow: 0 2px 3px 0 rgba(34, 36, 38, 0.15);

  transform: translateX(-50%) translateY(-50%);
}

</style>
	<!-- ================ Style End ================= -->	

  <title>Seaplace Hotel</title>

	<!-- 메인화면 필수 link -->
	<link rel="icon" href="resources/seapalace-master/img/favicon.png" type="image/png">
  <link rel="stylesheet" href="resources/seapalace-master/vendors/bootstrap/bootstrap.min.css">
  <link rel="stylesheet" href="resources/seapalace-master/vendors/fontawesome/css/all.min.css">
	<link rel="stylesheet" href="resources/seapalace-master/vendors/themify-icons/themify-icons.css">
	<link rel="stylesheet" href="resources/seapalace-master/vendors/linericon/style.css">
  <link rel="stylesheet" href="resources/seapalace-master/vendors/magnefic-popup/magnific-popup.css">
  <link rel="stylesheet" href="resources/seapalace-master/vendors/owl-carousel/owl.theme.default.min.css">
  <link rel="stylesheet" href="resources/seapalace-master/vendors/owl-carousel/owl.carousel.min.css">
  <link rel="stylesheet" href="resources/seapalace-master/vendors/nice-select/nice-select.css">

  <link rel="stylesheet" href="resources/seapalace-master/css/style.css">
  
  <!-- w3schools 부트스트랩 Forms (로그인 창) -->
 <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.3/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>

  <!-- summernote css/js-->
    <link href="http://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.8/summernote.css" rel="stylesheet">
    <script src="http://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.8/summernote.js"></script>






	<!-- ================ header section start ================= -->	
	<header class="header_area">
    <div class="header-top">
      <div class="container">
        <div class="d-flex align-items-center">
          <div id="logo">
            <a href="<c:url value="/"></c:url>"><img src="resources/seapalace-master/img/Logo.png" alt="" title="" /></a>
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
          <!-- Brand and toggle get grouped for better mobile display -->
          <!-- <a class="navbar-brand logo_h" href="index.html"><img src="img/logo.png" alt=""></a> -->
          <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
          aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
         <!-- ===================================== 상단 메뉴 [Start] ===================================== -->

          <div class="collapse navbar-collapse offset" id="navbarSupportedContent">
            <ul class="nav navbar-nav menu_nav">
              <li class="nav-item active"><a class="nav-link" href="<c:url value="/"></c:url>">Home</a></li>
              <li class="nav-item submenu dropdown">
                <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                aria-expanded="false">Product</a>
                <ul class="dropdown-menu">
                  <li class="nav-item"><a class="nav-link" href="<c:url value="/motel#tel123"></c:url>">Motel</a></li>
                  <li class="nav-item"><a class="nav-link" href="<c:url value="/blogSingle"></c:url>">Hotel</a></li>
                  <li class="nav-item"><a class="nav-link" href="<c:url value="/blogSingle"></c:url>">Guest House</a></li>
                </ul>
              </li>
              <li class="nav-item submenu dropdown">
                <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                aria-expanded="false">Notice</a>
                <ul class="dropdown-menu">
                  <li class="nav-item"><a class="nav-link" href="<c:url value="/boardList1#tel123"></c:url>" style="font-family: 'Genos', sans-serif; opacity: 0.8">공지사항</a></li>
                  <li class="nav-item"><a class="nav-link" href="<c:url value="/boardList2#tel123"></c:url>" style="font-family: 'Genos', sans-serif; opacity: 0.8">문의사항</a></li>
                  <li class="nav-item"><a class="nav-link" href="<c:url value="/boardList3#tel123"></c:url>" style="font-family: 'Genos', sans-serif; opacity: 0.8">이벤트</a></li>
                </ul>
              </li>
              <li class="nav-item"><a class="nav-link" href="<c:url value="/properties"></c:url>">Properties</a></li>
              <li class="nav-item"><a class="nav-link" href="<c:url value="/gallery"></c:url>">Gallery</a></li>
              <li class="nav-item"><a class="nav-link" href="<c:url value="/contact"></c:url>">Contact</a></li>
<!-- ===================================== 상단 메뉴 [End] ===================================== -->

<!-- ================================= 관리자 전용 메뉴 [Start] ================================= -->
			
			<c:if test="${user.me_auth == 2}">
				<li class="nav-item submenu dropdown">
				  <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
				  aria-expanded="false">Manager</a>
			  	<ul class="dropdown-menu">
				    <li class="nav-item"><a class="nav-link" href="<c:url value="/memberManager#tel123"></c:url>">Management</a></li>
					<li class="nav-item"><a class="nav-link" href="<c:url value="/productManagerInfoList#tel123"></c:url>">Product Management</a></li>
					<li class="nav-item"><a class="nav-link" href="<c:url value="/boardInsert#tel123"></c:url>">Notice</a></li>
				</ul>
				</li>
			</c:if>
<!-- ================================= 관리자 전용 메뉴 [End] ================================= -->
            </ul>
          </div>

	<!-- 우측 상단 로그인 / 회원가입 버튼 -->
          <ul class="social-icons ml-auto" style="padding-top: 14px;">
			<c:if test="${user.me_id == null}">
				<li><a id="loginBtn2" class="button-login-right" href="#" style="font-size: 16px; font-weight: bold;">로그인</a></li>
			</c:if>
			<c:if test="${user.me_id != null}">
				<li><a href="<c:url value="/myPage#tel123"></c:url>"  style="font-size: 16px; font-weight: bold;">내 정보</a></li>
			</c:if>
        	<c:if test="${user.me_id == null}">
				<li><a href="<c:url value="/register#tel123"></c:url>"  style="font-size: 16px; font-weight: bold;">회원가입</a></li>
			</c:if>
			<c:if test="${user.me_id != null}">
				<li><a href="<c:url value="/logout"></c:url>"  style="font-size: 16px; font-weight: bold;">로그아웃</a></li>
			</c:if>
            
          </ul>
        </div>
      </nav>
      
      <!-- <div class="search_input" id="search_input_box">
        <div class="container">
          <form class="d-flex justify-content-between">
            <input type="text" class="form-control" id="search_input" placeholder="Search Here">
            <button type="submit" class="btn"></button>
            <span class="lnr lnr-cross" id="close_search" title="Close Search"></span>
          </form>
        </div>
      </div> -->
    </div>
	</header>
	<!-- ================ header section end ================= -->	

  <main class="site-main">
    <!-- ================ start banner area ================= --> 
    <section class="home-banner-area" id="home">
      <div class="container h-100">
        <div class="home-banner">
          <div class="text-center">
            <h4>Welcome <em>to</em> SEAPALACE </h4>
            <h2 style="color: white; margin-bottom: 30px;">Notice</h2>
	            <a class="button home-banner-btn" href="<c:url value="/"></c:url>" style="width: 180px;">HOME</a>
           	<div>
				<c:if test="${user.me_auth == 1 || user.me_auth == 2}">
		            <a class="button home-banner-btn" href="<c:url value="/myPage"></c:url>" style="width: 180px; margin-top: 10px">내 정보</a>
	           	</c:if>
           	</div>
          </div>
		   <!-- 이동할 위치 지정 -->
		   <span id="tel123"></span>
		   <!-- 이동할 위치 지정 -->
        </div>
      </div>
    </section>



    <div class="section-intro__style" style="margin-bottom: 40px;
    text-align: center;
    margin-top: 40px;">
		<img src="resources/seapalace-master/img/home/bed-icon.png" alt="">
	<h2 style="margin-top: 10px">SEAPALACE</h2>
	</div>
    <!-- ===================================== 시작 지점 [Start] ===================================== -->
<div style=" margin-left: 15%; margin-right: 15%; margin-top: 100px;">
<p style="font-size: 22px; font-weight: bold; margin-bottom: 40px; position: relative;">이벤트 [미구현]</p>
<!-- 
  <table class="table table-hover">
    <thead style="text-align: center;">
      <tr>
        <th>문의사항</th>
        <th>제목</th>
        <th>작성자</th>
        <th>작성일</th>
        <th>조회</th>
      </tr>
    </thead>
 -->
    <!-- 공지사항일 경우에만 표기 -->
    
<!-- 
	<c:forEach items ="${list}" var="b">
		<c:if test="${b.bo_ca_pid eq '문의사항'}">
			<tbody style="text-align: center;">
				<tr>
					<td>${b.bo_pid}</td>
					<td><a href="<c:url value="/boardDetail?bo_pid=${b.bo_pid}"></c:url>" style="color: black;">
						<c:out value="${b.bo_title}"/></a></td>
					<td>${b.bo_writer}</td>
					<td>${b.bo_created}</td>
				  </tr>
	   		</tbody>
   		</c:if>
	</c:forEach>
  </table>
  --> 
</div>
  <p style="margin-bottom: 150px"></p>
    <!-- ======================================= 끝 지점 [End] ======================================= -->
</main>

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
							  type="email">
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
  
  
	<!-- ================ Start Login Modal ================= -->
<form action="<c:url value="/login"></c:url>" method="post">
	<div id="mod" class="modal">
		<div class="modal_body">
			<button class="close-btn" onclick="modalClose()" style="float: right; display: flex; background-color: white; border: 0px solid; font-weight: bold; font-size: 26px; position: absolute; right: 6%; top: 2%">X</button><br>
			<div class="container">
			  <h2 style="text-align: center; margin-left: 10px; margin-bottom: 30px">SunMall</h2>
			  <!-- 
			  <form action="/action_page.php" class="was-validated">
			   -->
			    <div class="form-group">
			      <label for="uname">UserID:</label>
			      <input type="text" class="form-control" id="uname" placeholder="UserID" name="me_id" required>
			      <div class="valid-feedback"></div>
			      <div class="invalid-feedback">아이디를 입력하세요.</div>
			    </div>
			    <div class="form-group">
			      <label for="pwd">Password:</label>
			      <input type="password" class="form-control" id="pwd" placeholder="Password" name="me_pw" required>
			      <div class="valid-feedback"></div>
			      <div class="invalid-feedback">비밀번호를 입력하세요.</div>
			    </div>

			    <!-- 모달창에서 또다른 모달창을 띄워서 회원가입 진행 -->
			    <a href="<c:url value="/register"></c:url>" style="text-decoration: none; color: black;">회원가입</a>
			    <!-- 체크박스 임시 주석
			    <div class="form-group form-check">
			      <label class="form-check-label">
			        <input class="form-check-input" type="checkbox" name="remember" required> I agree on blabla.
			        <div class="valid-feedback"></div>
			        <div class="invalid-feedback">Check this checkbox to continue.</div>
			      </label>
			    </div>
			    -->
			    <button type="submit" id="Modal-login-btn" class="btn btn-outline-light text-dark">로그인</button>
			    
			  <!-- 
			  </form>
			   -->
			</div>
		</div>
	</div>
</form>
	<!-- ================ End Login Modal ================= -->
    


  <script src="resources/seapalace-master/vendors/bootstrap/bootstrap.bundle.min.js"></script>
  <script src="resources/seapalace-master/vendors/magnefic-popup/jquery.magnific-popup.min.js"></script>
  <script src="resources/seapalace-master/vendors/owl-carousel/owl.carousel.min.js"></script>
	<script src="resources/seapalace-master/vendors/easing.min.js"></script>
  <script src="resources/seapalace-master/vendors/superfish.min.js"></script>
  <script src="resources/seapalace-master/vendors/nice-select/jquery.nice-select.min.js"></script>
  <script src="resources/seapalace-master/vendors/jquery.ajaxchimp.min.js"></script>
  <script src="resources/seapalace-master/vendors/mail-script.js"></script>
  <script src="resources/seapalace-master/js/main.js"></script>


	<!-- ================ Script Start ================= -->
<script src="resources/js/jquery.validate.js"></script>
<script src="resources/js/jquery-ui.js"></script>
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>



<script type="text/javascript">
//========================= 게시판 글쓰기 써머노트 [Start] =========================
$('.summernote').summernote({
	  height: 300,
	  lang: "ko-KR"
	});

function BoardWriting(){
    location.href = "/springTest";
}
//========================= 게시판 글쓰기 써머노트 [End] =========================

//========================= 게시판 카테고리 선택 드롭박스 [Start] =========================
 $(document).ready(function() {

            // 콤보박스가 변경될 때

            $('#lstFavorites').change(function () {

                // 드롭다운리스트에서 선택된 값을 텍스트박스에 출력

                var selectedText = // $("#lstFavorites option:selected").text();

                    // $("option:selected").text();

                    $(":selected").text();

                $('#txtFavorite').val(selectedText);

            });

        });
//========================= 게시판 카테고리 선택 드롭박스 [End] =========================

	
	//========================= Login 모달창 [Start] =========================
/* 현재 Login 모달창으로 인해 아래 제이쿼리가 작동하지 않게 됨. (임시 사용 중지) [2023.05.01]
	const modal = document.querySelector('.modal');
	const loginBtn = document.querySelector('#loginBtn');
	
	loginBtn.addEventListener('click', () => {
	modal.style.display = 'block';
	});
		
	// 모달 on
	body.style.overflow = 'hidden';
	// 모달 off
	body.style.overflow = 'auto';
	//모달 닫는 이벤트
	function modalClose() {
		$('#mod').modal('hide'); 
        $('#mod').hide();
	}
*/
	//========================= Login 모달창 [End] ===========================
//파일 추가/삭제 버튼

$(document).ready(function() {
    $("a[name='file-delete']").on("click", function(e) {
        e.preventDefault();
        deleteFile($(this));
    });
})

function addFile() {
        
    var str = "<div class='file-group'><input type='file' name='file'><a href='#this' name='file-delete' style='background: #ededed; padding: 5px; border-radius: 5px; color: black; padding-left: 10px; padding-right: 10px; text-decoration: none; margin-top : 5px'>삭제</a></div>";
    $("#file-list").append(str);
    $("a[name='file-delete']").on("click", function(e) {
        e.preventDefault();
        deleteFile($(this));
    });
}

function deleteFile(obj) {
    obj.parent().remove();
}

</script>
