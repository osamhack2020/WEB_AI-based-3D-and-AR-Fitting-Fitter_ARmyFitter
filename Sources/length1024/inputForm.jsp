<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<META http-equiv="Content-Type" content="text/html; charset=utf-8">	 
<META http-equiv="X-UA-Compatible" content="IE=Edge">
<META name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"> 
<LINK href="css/common.css" rel="stylesheet">
</head>
<body style="background-color:#191919">
<script type="text/javascript" charset="utf-8" src="formCheck.js"> </script>
<div>
	<div class="sub_header">
		<a href="index.jsp"><img src="images/home.png"></a>
	</div>
		<form class ="box" method="post" action="./DisplaySize.jsp" name="userInfo" onsubmit="return checkValidate(this)">
			<h1><span></span>&nbsp;내 신체 치수 입력하기&nbsp;<span></span></h1>
			<input type="text" id="headRound1" name="headRound" placeholder="머리둘레 (cm)" oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');" />
			<input type="text" name="topSize" placeholder="일반복 상의 (size)"  oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');" />
			<input type="text" name="keyLength" placeholder="키 (cm)"  oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');" />
			<input type="text" name="armLength" placeholder="팔 길이 (cm)"  oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');" />
			<input type="text" name="bottomSize" placeholder="일반복 하의 (size)"  oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');" />
			<input type="text" name="heapRound" placeholder="엉덩이 둘레 (cm)"  oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');" />
			<input type="text" name="footLength" placeholder="발크기 (mm)"  oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');" />
		
			<input type="submit" name="submit" value="3D로 피복 추천받기">
		
	</form>
<div class="footer" id="main_footer">
	<span>Copyright by 육군 정보체계관리단 <span>Team. Fitter</span></span>
</div>
</div>

</body>
</html>