<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Trang chủ</title>
</head>
<body>

	<!-- Categories Section Begin -->
	<section class="categories">
		<div class="container">
			<div class="row">
				<div class="categories__slider owl-carousel">
					<c:forEach var="item" items="${listSaleOff}">
						<div class="col-lg-3">
							<div class="product__discount__item">
								<div class="product__discount__item__pic set-bg"
									data-setbg="${item.linkImage }">
									<div class="product__discount__percent">-${item.saleOff}%</div>
									<ul class="product__item__pic__hover">
										<li><a href="#"><i class="fa fa-heart"></i></a></li>
										<li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
									</ul>
								</div>
								<div class="product__discount__item__text">
									<span>thể loại</span>
									<h5>
										<a  href='<c:url value = "/san-pham/${item.code }"/>'>${item.name }</a>
									</h5>
									<div class="product__item__price">
										${item.priceSaleOff} <span> ${item.price }</span>
									</div>
								</div>
							</div>
						</div>
					</c:forEach>
				</div>
			</div>
		</div>
	</section>
	<!-- Categories Section End -->

	<!-- Featured Section Begin -->
	<section class="featured spad">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="section-title">
						<h2>Sản phẩm đặc sắc</h2>
					</div>
					<div class="featured__controls">
						<ul>
							<li class="active" data-filter="*">Tất cả</li>
							<li data-filter=".oranges">Oranges</li>
							<li data-filter=".fresh-meat">Fresh Meat</li>
							<li data-filter=".vegetables">Vegetables</li>
							<li data-filter=".fastfood">Fastfood</li>
						</ul>
					</div>
				</div>
			</div>
			<div class="row featured__filter">

				<c:forEach var="item" items="${model.listOranges}">
					<div class="col-lg-3 col-md-4 col-sm-6 mix oranges ">
						<div class="featured__item">
							<div class="featured__item__pic set-bg"
								data-setbg="${item.linkImage }">
								<ul class="featured__item__pic__hover">
									<li><a href="#"><i class="fa fa-heart"></i></a></li>
									<li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
								</ul>
							</div>
							<div class="featured__item__text">
								<h6>
									<a  href='<c:url value = "/san-pham/${item.code }"/>'>${item.name }</a>
								</h6>
								<h5>${item.priceSaleOff}</h5>
							</div>
						</div>
					</div>
				</c:forEach>

				<c:forEach var="item" items="${model.listVegetables}">
					<div class="col-lg-3 col-md-4 col-sm-6 mix vegetables">
						<div class="featured__item">
							<div class="featured__item__pic set-bg"
								data-setbg="${item.linkImage }">
								<ul class="featured__item__pic__hover">
									<li><a href="#"><i class="fa fa-heart"></i></a></li>
									<li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
								</ul>
							</div>
							<div class="featured__item__text">
								<h6>
									<a  href='<c:url value = "/san-pham/${item.code }"/>'>${item.name }</a>
								</h6>
								<h5>${item.priceSaleOff}</h5>
							</div>
						</div>
					</div>
				</c:forEach>

				<c:forEach var="item" items="${model.listFresh-meat}">
					<div class="col-lg-3 col-md-4 col-sm-6 mix  fresh-meat">
						<div class="featured__item">
							<div class="featured__item__pic set-bg"
								data-setbg="${item.linkImage }">
								<ul class="featured__item__pic__hover">
									<li><a href="#"><i class="fa fa-heart"></i></a></li>
									<li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
								</ul>
							</div>
							<div class="featured__item__text">
								<h6>
									<a  href='<c:url value = "/san-pham/${item.code }"/>'>${item.name }</a>
								</h6>
								<h5>${item.priceSaleOff}</h5>
							</div>
						</div>
					</div>
				</c:forEach>
				<c:forEach var="item" items="${model.listFastfood}">
					<div class="col-lg-3 col-md-4 col-sm-6 mix fastfood ">
						<div class="featured__item">
							<div class="featured__item__pic set-bg"
								data-setbg="${item.linkImage }">
								<ul class="featured__item__pic__hover">
									<li><a href="#"><i class="fa fa-heart"></i></a></li>
									<li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
								</ul>
							</div>
							<div class="featured__item__text">
								<h6>
									<a  href='<c:url value = "/san-pham/${item.code }"/>'>${item.name }</a>
								</h6>
								<h5>${item.priceSaleOff}</h5>
							</div>
						</div>
					</div>
				</c:forEach>

			</div>
		</div>
	</section>
	<!-- Featured Section End -->

	<!-- Banner Begin -->
	<div class="banner">
		<div class="container">
			<div class="row">
				<div class="col-lg-6 col-md-6 col-sm-6">
					<div class="banner__pic">
						<img src="img/banner/banner-1.jpg" alt="">
					</div>
				</div>
				<div class="col-lg-6 col-md-6 col-sm-6">
					<div class="banner__pic">
						<img src="img/banner/banner-2.jpg" alt="">
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Banner End -->

	<!-- Latest Product Section Begin -->
	<section class="latest-product spad">
		<div class="container">
			<div class="row">
				<div class="col-lg-4 col-md-6">
					<div class="latest-product__text">
						<h4>Sản phẩm mới</h4>
						<div class="latest-product__slider owl-carousel">
							<div class="latest-prdouct__slider__item">
							<c:forEach var="item" items="${model.listLatest}" >
								<a href='<c:url value = "/san-pham/${item.code }"/>' class="latest-product__item">
									<div class="latest-product__item__pic">
										<img src="${item.linkImage }" alt="">
									</div>
									<div class="latest-product__item__text">
										<h6>${item.name }</h6>
										<span>${item.priceSaleOff}</span>
									</div>
								</a>
								</c:forEach>
								 
							</div>
						</div>
					</div>
				</div>
				<div class="col-lg-4 col-md-6">
					<div class="latest-product__text">
						<h4>Sản phẩm chất lượng</h4>
						<div class="latest-product__slider owl-carousel">
							<div class="latest-prdouct__slider__item">
							<c:forEach var="item" items="${model.listTopRated} " >
								<a href='<c:url value = "/san-pham/${item.code }"/>' class="latest-product__item">
									<div class="latest-product__item__pic">
										<img src="${item.linkImage }" alt="">
									</div>
									<div class="latest-product__item__text">
										<h6>${item.name }</h6>
										<span>${item.priceSaleOff}</span>
									</div>
								</a>
								</c:forEach>
							</div>
							<div class="latest-prdouct__slider__item">
								<c:forEach var="item" items="${model.listTopRated} ">
									<a href='<c:url value = "/san-pham/${item.code }"/>' class="latest-product__item">
										<div class="latest-product__item__pic">
											<img src="${item.linkImage }" alt="">
										</div>
										<div class="latest-product__item__text">
											<h6>${item.name }</h6>
											<span>${item.priceSaleOff}</span>
										</div>
									</a>
								</c:forEach>
							</div>
						</div>
					</div>
				</div>
				<div class="col-lg-4 col-md-6">
					<div class="latest-product__text">
						<h4>Xem nhiều nhất</h4>
						<div class="latest-product__slider owl-carousel">
							<div class="latest-prdouct__slider__item">
								<c:forEach var="item" items="${model.listTopView} ">
									<a href='<c:url value = "/san-pham/${item.code }"/>' class="latest-product__item">
										<div class="latest-product__item__pic">
											<img src="${item.linkImage }" alt="">
										</div>
										<div class="latest-product__item__text">
											<h6>${item.name }</h6>
											<span>${item.priceSaleOff}</span>
										</div>
									</a>
								</c:forEach>
							</div>
							<div class="latest-prdouct__slider__item">
								<c:forEach var="item" items="${model.listTopView} ">
									<a href='<c:url value = "/san-pham/${item.code }"/>' class="latest-product__item">
										<div class="latest-product__item__pic">
											<img src="${item.linkImage }" alt="">
										</div>
										<div class="latest-product__item__text">
											<h6>${item.name }</h6>
											<span>${item.priceSaleOff}</span>
										</div>
									</a>
								</c:forEach>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- Latest Product Section End -->

	<!-- Blog Section Begin -->
	<section class="from-blog spad">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="section-title from-blog__title">
						<h2>Cẩm nang chăm sóc sức khỏe</h2>
					</div>
				</div>
			</div>
			<div class="row">
				<c:forEach var="item" items="${model.listNew} ">
					<div class="col-lg-4 col-md-4 col-sm-6">
						<div class="blog__item">
							<div class="blog__item__pic">
								<img src="${item.linkImage }" alt="">
							</div>
							<div class="blog__item__text">
								<ul>
									<li><i class="fa fa-calendar-o"></i> ${item.modifiedDate} </li>
									<li><i class="fa fa-eye"></i> ${item.view}</li>
								</ul>
								<h5>
									<a href='<c:url value = "/bai-viet/${item.code }"/>'>${item.title }</a>
								</h5>
								<p>${item.shortDescription }</p>
							</div>
						</div>
					</div>
				</c:forEach>

			</div>
		</div>
	</section>
	<!-- Blog Section End -->

</body>
</html>