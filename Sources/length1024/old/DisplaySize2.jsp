<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Ű�۰� ����</title>
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
        <b><font size="5" color="gray">Ű�۰� ���� : </font></b>
        <br><br>
        <br><br>
        
        <%-- �ڹٺ󿡼� �Էµ� ���� �����Ѵ�. --%>
        <table>
            <tr>
                <td id="title">������ ���� : </td>
                <td><%=getTop %></td>
            </tr>
             <tr>
                <td id="title">������ ���� : </td>
                <td><%=getBottom %></td>
            </tr>
            <tr>
                <td id="title">������ : </td>
                <td><%=getHead %></td>
            </tr>
            <tr>
                <td id="title">����ȭ : </td>
                <td><%=getFoot %></td>
            </tr>    
                      
        </table>
        
        <br>
        <input type="button" value="Ȯ��" onclick ="location.href = './inputForm.jsp'">
        <input type="button" value="AR�� Ȯ���ϱ�" onclick ="location.href = './downloads/ARmyFitter.apk'">
        
    </div>
</body>
</html>