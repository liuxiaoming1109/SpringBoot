<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>servlet async support</title>

</head>
<body>



<script type="text/javascript" src="assets/js/jquery.js"></script>
<script type="text/javascript">

	deferred();// 页面打开时就向后台发送请求
	
	function deferred(){
	    $.get('defer',function(data){
	        console.log(data); // 在控制台输出服务端推送的数据
	        deferred(); // 一次请求完成后再向后台发送请求
	    });
	}


</script>
</body>
</html>