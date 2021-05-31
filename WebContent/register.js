/**
 * 
 */
function check(){
    if(form.sid.value ==""){
        alert("用户编号不能为空!");
        form.sid.focus();
        return false;
    }

    if(form.sname.value ==""){
        alert("用户名不能为空!");
        form.sname.focus();
        return false;
    }
    if(form.password.value==""){
        alert("请输入密码!");
        form.password.focus();
        return false;
    }
    if(form.password2.value==""){
        alert("请再次输入密码!");
        form.password2.focus();
        return false;
    }
    if(form.password.value!=form.password2.value){
        alert("两次输入的密码不一致!");
        form.password2.focus();
        return false;
    }
    if(form.email.value==""){
        alert("请输入邮箱!");
        form.email.focus();
        return false;
    }
    var regm=/^[a-zA-Z0-9_-]+@[a-zA-A0-9_-]+(\.[a-zA-Z0-9_-]+)+$/;//验证mail地址
    if(form.email.value !=""&&!form.email.value.match(regm)){
        alert("邮件格式不对,检查后重新输入!");
        form.email.focus();
        return false;
    }
    alert("恭喜你，注册成功，快去登陆吧！")

}