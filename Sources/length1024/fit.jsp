<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<HTML lang="ko">
<head>
<META http-equiv="Content-Type" content="text/html; charset=utf-8">	 
<META http-equiv="X-UA-Compatible" content="IE=Edge">
<META name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<LINK href="css/common.css" rel="stylesheet"> 
<TITLE>ARmy Fitter</TITLE>
</head>
<body>
<%
String firstURL = "https://sketchfab.com/models/";
String lastURL = "/embed?autospin=0.2&amp;autostart=1&amp;camera=0&amp;ui_controls=1&amp;ui_infos=1&amp;ui_inspector=1&amp;ui_stop=1&amp;ui_watermark=1&amp;ui_watermark_link=1";
String pageURL = "6b5f5b1be600420f92ba028049e0c0b4";



%>
<div>
	<div class="result_header">
		<a href="index.html"><img src="images/home.png"></a>
		<span><span></span>&nbsp;AI ��õ��� 3D Ȯ��&nbsp;<span></span></span>
	</div>	
	<div class="resultWrap">
		<div id="r1">			
			<span>
				���������� : <span class="value">���㺹</span>				
			</span>
			<span>
				���������� : <span class="value">���㺹</span>
			</span>
		</div>
		<div id="r2">			
			<span>
				������ : <span class="value">51ȣ</span>				
			</span>
			<span>
				����ȭ : <span class="value">275mm</span>
			</span>
		</div>
	</div>	
	<div class="ar_wrap">
		<span id="ar_text"><a href="./downloads/ARmyFitter.apk">��õ���� ������ AR�� Ȯ���ϱ�</a></span>
	</div>
    <div class="iframe_wrap">
		<iframe title="A 3D model" width="100%" height="100%" mozallowfullscreen="true" webkitallowfullscreen="true" src=<%=firstURL+pageURL+lastURL%> frameborder="0" allow="autoplay; fullscreen; vr"></iframe>

	</div>	
	<div class="footer" id="result_footer">
	<span>Copyright by ���� ����ü������� <span>Team. Fitter</span><span>
</div>
</div>
</body>
</html>