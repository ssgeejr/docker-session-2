<%@ page
		language="java"
		contentType="text/html; charset=UTF-8"
		pageEncoding="UTF-8"
		import="ioexcept.online.*"
%>
<%
	ResultItem ri = new ResultItem();
	try{ri = ioexcept.online.Counter.getCount(request);}catch(Exception ex){
		out.println("<font color=\"red\">");
		StackTraceElement[] ste = ex.getStackTrace();
		int counter = 0;
		out.println(ex.getMessage() + "<br>");
		while(counter < ste.length && counter < 15){
			out.println(ste[counter] + "<br>");
			counter++;
		}
		out.println("</font>");

	}
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta content="en-us" http-equiv="Content-Language" />
<meta content="text/html; charset=utf-8" http-equiv="Content-Type" />
<title>Docker Training: Session-2</title>
<style type="text/css">
.auto-style1 {
	border: 1px solid #FF0000;
}
.auto-style2 {
	text-align: center;
}
.auto-style3 {
	text-align: center;
	color: #C0C0C0;
}
</style>
</head>

<body>
<div align="center">

<table class="auto-style1" style="width: 600px">
	<tr>
		<td class="auto-style2" style="height: 76px">
		<img alt="Docker Training Session 2" height="72" src="dt2.png" width="291" /></td>
	</tr>
	<tr>
		<td class="auto-style2"><strong>Counter: [ <%= ri.getCount() %> ]</strong></td>
	</tr>
	<tr>
		<td class="auto-style3">
		Docker Mongo Counter Stats<br />
		Connection Time: <%= ri.getConnect() %>ms<br />
		Insert Time: <%= ri.getInsert() %>ms<br />
		Query Time: <%= ri.getQuery() %>ms
		</td>
	</tr>
</table>
</div>


</body>

</html>
