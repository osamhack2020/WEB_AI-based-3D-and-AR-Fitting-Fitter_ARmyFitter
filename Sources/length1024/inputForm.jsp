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
			<h1><span></span>&nbsp;�� ��ü ġ�� �Է��ϱ�&nbsp;<span></span></h1>
			<input type="text" id="headRound1" name="headRound" placeholder="�Ӹ��ѷ� (cm)" oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');" />
			<input type="text" name="topSize" placeholder="�Ϲݺ� ���� (size)"  oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');" />
			<input type="text" name="keyLength" placeholder="Ű (cm)"  oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');" />
			<input type="text" name="armLength" placeholder="�� ���� (cm)"  oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');" />
			<input type="text" name="bottomSize" placeholder="�Ϲݺ� ���� (size)"  oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');" />
			<input type="text" name="heapRound" placeholder="������ �ѷ� (cm)"  oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');" />
			<input type="text" name="footLength" placeholder="��ũ�� (mm)"  oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');" />
		
			<input type="submit" name="submit" value="3D�� �Ǻ� ��õ�ޱ�">
		
	</form>
<div class="footer" id="main_footer">
	<span>Copyright by ���� ����ü������� <span>Team. Fitter</span></span>
</div>
</div>

</body>
</html>