<%@ page language="java" contentType="text/html; charset=GBK"
    pageEncoding="GBK"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="GBK">
<title>Insert title here</title>
</head>
<body style="text-align: center">
<h1>用户注册页面</h1>

<%--有个js文件没写-----------------------------------------%>

<form name="form" action="register">
    <table clss="hoverable" align="center">
    <tr>
        <td>用户编号</td>
        <td><input type="text" name="sid" id="sid">
            <font color="red">*</font>
        </td>
    </tr>

        <tr>
        
            <td>用户名称</td>
            <td><input type="text" name="sname" id="sname">
                <font color="red">*</font>
            </td>
        </tr>

        <tr>
            <td>用户密码</td>
            <td><input type="password" name="password" id="password">
                <font color="red">*</font>
            </td>
        </tr>

        <tr>
            <td>确认密码</td>
            <td><input type="password" name="password2" id="password2">
                <font color="red">*</font>
            </td>
        </tr>
        <tr>
            <td>用户权限</td>
            <td>
                <select name="superuser">
                    <option Selected value="2">普通用户
                    <option value="1">管理员
                </select>
            </td>
        </tr>
    <tr>
        <td colspan="2" align="center">
            <input type="submit" value="注册" onclick="return check();"/>
            <input type="Reset" value="取消"/>
        </td>
    </tr>
    </table>
</form>
</body>
</html>