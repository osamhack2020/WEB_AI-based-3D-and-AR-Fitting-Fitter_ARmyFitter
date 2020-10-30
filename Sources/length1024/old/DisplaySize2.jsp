<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>키작고 보통</title>
</head>
<body>
<%
	request.setCharacterEncoding("euc-kr");
	String getTop = request.getParameter("getTop");
	String getBottom = request.getParameter("getBottom");
	String getHead = request.getParameter("getHead");
	String getFoot = request.getParameter("getFoot");	
%>

    <div id="wrap">
        <br><br>
        <b><font size="5" color="gray">키작고 보통 : </font></b>
        <br><br>
        <br><br>
        
        <%-- 자바빈에서 입력된 값을 추출한다. --%>
        <table>
            <tr>
                <td id="title">전투복 상의 : </td>
                <td><%=getTop %></td>
            </tr>
             <tr>
                <td id="title">전투복 하의 : </td>
                <td><%=getBottom %></td>
            </tr>
            <tr>
                <td id="title">베레모 : </td>
                <td><%=getHead %></td>
            </tr>
            <tr>
                <td id="title">전투화 : </td>
                <td><%=getFoot %></td>
            </tr>    
                      
        </table>
        
        <br>
        <input type="button" value="확인" onclick ="location.href = './inputForm.jsp'">
        <input type="button" value="AR로 확인하기" onclick ="location.href = './downloads/ARmyFitter.apk'">
        
    </div>
</body>
</html>