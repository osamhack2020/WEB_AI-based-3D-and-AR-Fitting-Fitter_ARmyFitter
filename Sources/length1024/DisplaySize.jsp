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
<TITLE>ARmy Fitter</TITLE>
</head>
<body>
<%
	request.setCharacterEncoding("euc-kr");
%>

<jsp:useBean id="memberBean" class="length.sizeController"/>
<jsp:setProperty property ="*" name="memberBean"/>

<%
String firstURL = "https://sketchfab.com/models/";
String lastURL = "/embed?autospin=0.2&amp;autostart=1&amp;camera=0&amp;ui_controls=1&amp;ui_infos=1&amp;ui_inspector=1&amp;ui_stop=1&amp;ui_watermark=1&amp;ui_watermark_link=1";
String pageURL = null;

if(memberBean.getKeyLength() <= 170 && memberBean.getTopSize() <= 95) {
	pageURL = "6b5f5b1be600420f92ba028049e0c0b4";//"./DisplaySize1.jsp";
} else if(memberBean.getKeyLength() <= 170 && memberBean.getTopSize() <=105 && memberBean.getTopSize() > 95) {
	pageURL = "ec79af45eca74ac1b610366f39b86c4b";//"./DisplaySize2.jsp";
} else if(memberBean.getKeyLength() <= 170 && memberBean.getTopSize() > 105) {
	pageURL = "19fe155726174294bc6420ca2919b523"; //"./DisplaySize3.jsp";
}else if(memberBean.getKeyLength() > 170 && memberBean.getKeyLength() <= 177 && memberBean.getTopSize() <= 95 ) {
	pageURL = "9a7cd4d348a1415da734ac2736429a61"; //"./DisplaySize4.jsp";
}else if(memberBean.getKeyLength() > 170 && memberBean.getKeyLength() <= 177 && memberBean.getTopSize() <=105 && memberBean.getTopSize() > 95) {
	pageURL = "85ad4d67cf1e4dc49b5bf000cd6fb7d9"; //"./DisplaySize5.jsp";
}else if(memberBean.getKeyLength() > 170 && memberBean.getKeyLength() <= 177 && memberBean.getTopSize() > 105) {
	pageURL = "d99075e011724f42be9904e402d5e2de"; //"./DisplaySize6.jsp";
}else if(memberBean.getKeyLength() >177 && memberBean.getTopSize() <= 95) {
	pageURL = "90dbdeda8d5942a6b76d881efc765f7e"; //"./DisplaySize7.jsp";
}else if(memberBean.getKeyLength() >177 &&memberBean.getTopSize() <=105 && memberBean.getTopSize() > 95) {
	pageURL = "71e128edf7264f568860fec4e37bf073"; //"./DisplaySize8.jsp";
}else{
	pageURL = "df7513dd0be245ebbbd62f3d19a939fa"; //"./DisplaySize9.jsp";
}
 
%>



<div>
	<div class = "result_header">
		<a href="index.jsp"><img src="images/home.png"></a>
		<span><span></span>&nbsp;AI 추천결과 3D 확인&nbsp;<span></span></span>
	</div>
	<div class = "resultWrap">
		<div id="r1">
		<span>
			전투복 상의 : <span class="value"><%=memberBean.getTop()%></span>
		</span>
		<span>
			전투복 하의 : <span class="value"><%=memberBean.getBottom()%></span>
		</span>
		</div>
		<div id="r2">
		<span>
			베레모 : <span class="value"><%=memberBean.getHead()%></span>
		</span>
		<span>
			전투화 : <span class="value"><%=memberBean.getFoot()%></span>
		</span>
		</div>
	</div>
	<div class ="ar_wrap">
		<span id="ar_text"><a href="./downloads/ARmyFitter.apk">추천받은 베레모 AR로 확인하기</a></span>
	</div>
    <div class="iframe_wrap">
		<iframe title="A 3D model" width="100%" height="100%" mozallowfullscreen="true" webkitallowfullscreen="true" src=<%=firstURL+pageURL+lastURL%> frameborder="0" allow="autoplay; fullscreen; vr"></iframe>
	</div>
	<div class="footer" id="result_footer">
	<span>Copyright by 육군 정보체계관리단 <span>Team. Fitter</span></span>
	</div>
</div>
</body>
</html>
