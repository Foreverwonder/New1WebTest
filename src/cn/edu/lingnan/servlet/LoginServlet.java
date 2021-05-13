package cn.edu.lingnan.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.edu.lingnan.dao.StudentDao;
import cn.edu.lingnan.dto.StudentDto;

//@WebServlet("/login")相当于web.xml文件里的最后一大段
public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
//		System.out.println("sadsad");
		//1从页面获取参数,从客户端获取提交的参数
		String sname=req.getParameter("sname");
		String password=req.getParameter("password");
		System.out.println("页面的参数用户名和密码分别是："+sname+"  "+password);
		//2处理业务逻辑,大部分时候会访问数据库
		StudentDao sd=new StudentDao();
		StudentDto sdto =sd.findStudentByNameAndPassword(sname, password);
//		boolean flag=sd.findStudentByNameAndPassword(sname,password);
		int superuser =sdto.getSuperuser();
		String username=sdto.getSname();
		HttpSession session=req.getSession();
		session.setAttribute("superuser",superuser);
		session.setAttribute("username",username);
		//3响应,返回某些参数到页面
//		if(flag)
//		resp.sendRedirect(req.getContextPath()+"/LoginSuccessful.html");
//		resp.sendRedirect(req.getContextPath()+"/ok.html");
//		else
//			resp.sendRedirect(req.getContextPath()+"/LoginFailed.html");

//		System.out.println("here="+superuser);
		if(superuser!=0)
//		if(true)
		{
//			resp.sendRedirect(req.getContextPath()+"/ok.html");
			resp.sendRedirect(req.getContextPath()+"/ok.jsp");
		}
		else
			resp.sendRedirect(req.getContextPath()+"/index.html");
//			resp.sendRedirect(req.getContextPath()+"/LoginFailed.html");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	doGet(req,resp);
	
	}
	
}
