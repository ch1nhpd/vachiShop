<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Login VaChiShop</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>

	<div class="limiter">
		<div class="container-login100"
			style="background-image: url(<c:url value='/template/img/bg-01.jpg'/>) ; ">
			<div class="wrap-login100 p-l-110 p-r-110 p-t-62 p-b-33">
				<c:if test="${param.incorrectAccount != null}">
					<div class="alert alert-danger">Username or password
						incorrect</div>
				</c:if>
				<c:if test="${param.accessDenied != null}">
					<div class="alert alert-danger">you Not authorize</div>
				</c:if>
				<form action="j_spring_security_check" id="formLogin" method="post"
					class="login100-form validate-form flex-sb flex-w">
					<span class="login100-form-title p-b-53"> Login With </span> <a
						href="https://www.facebook.com/dialog/oauth?client_id=204053958235293&redirect_uri=http://localhost:8080/dang-nhap/facebook" class="btn-face m-b-20"> <i
						class="fa fa-facebook-official"></i> Facebook
					</a> <a href="https://accounts.google.com/o/oauth2/auth?scope=email&redirect_uri=http://localhost:8080/vachiShop/dang-nhap/google&response_type=code
    &client_id=1056363032348-6pi50tu7f4rbrrfhqhlf3oais25o5fc6.apps.googleusercontent.com&approval_prompt=force" class="btn-google m-b-20"> <img
						src="<c:url value='/template/img/icons/icon-google.png'/>">
						Google
					</a>

					<div class="p-t-31 p-b-9">
						<span class="txt1"> Username </span>
					</div>
					<div class="wrap-input100 validate-input"
						data-validate="Username is required">
						<input class="input100" type="text" name="j_username"> <span
							class="focus-input100"></span>
					</div>

					<div class="p-t-13 p-b-9">
						<span class="txt1"> Password </span> <a href="#"
							class="txt2 bo1 m-l-5"> Forgot? </a>
					</div>
					<div class="wrap-input100 validate-input"
						data-validate="Password is required">
						<input class="input100" type="password" name="j_password">
						<span class="focus-input100"></span>
					</div>

					<div class="container-login100-form-btn m-t-17">
						<button type="submit" class="login100-form-btn">Login</button>
					</div>

					<div class="w-full text-center p-t-55">
						<span class="txt2"> Not a member? </span> <a href="/dang-ky"
							class="txt2 bo1"> Sign up now </a>
					</div>
				</form>
			</div>
		</div>
	</div>
	<div id="dropDownSelect1"></div>


</body>
</html>