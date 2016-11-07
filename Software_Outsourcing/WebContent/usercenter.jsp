<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>个人中心</title>
<style type="text/css">
	body {
			background-repeat:no-repeat;
			background-size: cover;
	}
	.userimage{
				float:right;
	}
	.menu{
			float:left;
	}
	.info{
			float:right;
	}
	</style>
</head>
<body>
<div class ="head">
	<table>
	<tr>
	<th><a href=index.jsp><img src="image/hp.jpg"></a></th>
	<th><a href=project.jsp>项目</a></th>
	<th><a href=casehomepage.jsp>案例</a></th>
	<th><a href=commhomepage.jsp>社区</a></th>
	<th><a href=valueadd.jsp>增值服务 </a></th> 
	</tr>
	</table>
	<div class="userimage">
		<a href="login.jsp"><img src="image/head.jpg" onmouseover="this.src='image/head2.jpg'" onmouseout="this.src='image/head3.jpg'" style="width: 55px; height: 55px;"/></a>
	</div>
</div>
<div class ="menu">
	<table>
	<tr>
	<th>基本信息</th></tr>
	<tr>
	<td><a href=usercenter.jsp>个人信息</a></td>
	</tr>
	<tr>
	<th>开发者信息</th></tr>
	<tr><td><a href=skills.jsp>技能展示</a></td></tr>
	<tr><td><a href=identity.jsp>个人认证</a></td></tr>
	<tr>
	<th>我的开发宝</th></tr>
	<tr><td><a href=account.jsp>余额</a></td></tr>
	<tr><td><a href=records.jsp>明细</a></td></tr>
	</table>
</div>
<div class="info">
	<img src="image/head1.jpg">
	<h3>Coding账户</h3>
</div>
</body>
</html>