<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>로그인</title>
</head>
<body>
<h2> 로그인 </h2>
<HR>
<form method="post" action="login" name="form1">
<table width="450" border="1" align="center" cellspacing="0" cellpadding="5">
 
    <tr> 
    <td colspan="2" align="center">로그인</td>
    </tr>
  <tr> 
      <td width="150">아이디</td>
      <td><input type="text" name="ID" size=10></td>
  </tr>
  <tr> 
      <td width="150">비밀번호</td>
      <td><input type="password" name="Password" size=10></td>
  </tr>
 
    <td colspan="2" align="center"> 
        <input type="submit" name="Submit" value="로그인"></td>
  </tr>
</table>
</form>
</body>
</html>