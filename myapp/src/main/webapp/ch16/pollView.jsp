<!-- pollView.jsp -->
<%@page import="java.util.Random"%>
<%@page import="ch16.PollItemBean"%>
<%@page import="java.util.Vector"%>
<%@page import="ch16.PollListBean"%>
<%@page import="ch16.MUtil"%>
<%@page contentType="text/html; charset=UTF-8"%>
<jsp:useBean id="mgr" class="ch16.PollMgr"/>
<%
		int listNum = 0;
		if(request.getParameter("num")!=null){
			listNum = MUtil.parseInt(request, "num");
		}
		//어떤 설문
		PollListBean plBean = mgr.getPoll(listNum);
		//item, count
		Vector<PollItemBean> vlist = mgr.getView(listNum);
		//현재 설문에 sum Count
		int sumCnt = mgr.sumCount(listNum);
		//현재 설문에 가장 높은 투표수
		int maxCnt = mgr.getMaxCount(listNum);
%>
<!DOCTYPE html>
<html>
<head>
<title>JSP Poll</title>
<link href="style.css" rel="stylesheet" type="text/css">
</head>
<body bgcolor="#FFFFCC">
<div align="center"><br/>
<h2>투표 결과</h2>
<table border="1" width="400">
	<tr>
		<td colspan="4"><b>Q : <%=plBean.getQuestion() %></b></td>
	</tr>
	<tr>
		<td colspan="3"><b>총 투표자 : <%=MUtil.intFormat(sumCnt) %>명</b></td>
		<td width="40"><b>count(%)</b></td>
	</tr>
	<%
			Random r = new Random();
			for(int i=0;i<vlist.size();i++){
				PollItemBean piBean = vlist.get(i);
				String item = piBean.getItem()[0];
				int count = piBean.getCount();
				//비율
				int ratio = (int)(Math.round((double)count/sumCnt*100));
				//랜덤색
				String rgb = "#"+Integer.toHexString(r.nextInt(255*255*255));
	%>
	<tr>
		<td width="20" align="center"><%=i+1%></td>
		<td width="120">
			<%if(maxCnt==count){ %><font color="red"><b><%}%>
			&nbsp;<%=item%>
			<%if(maxCnt==count){ %></b></font><%}%>	
		</td>
		<td>
			<table width="<%=ratio%>" height="15">
				<tr><td bgcolor="<%=rgb%>"></td></tr>
			</table>
		</td>
		<td width="40">
			<%=MUtil.intFormat(count)%>(<%=ratio%>)
		</td>
	</tr>
	<%}//--for%>
</table><br>
<a href="javascript:window.close()">닫기</a>
</div>
</body>
</html>










