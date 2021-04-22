package cn.edu.lingnan.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.edu.lingnan.dao.StudentDao;

public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		//1从页面获取参数,从客户端获取提交的参数
		String sname=req.getParameter("sname");
		String password=req.getParameter("password");
		System.out.println("页面的参数用户名和密码分别是："+sname+"  "+password);
		//2处理业务逻辑,大部分时候会访问数据库
		StudentDao sd=new StudentDao();
		boolean flag=sd.findStudentByNameAndPassword(sname,password);
//		boolean flag=true;
		//3响应,返回某些参数到页面
		if(flag)
		resp.sendRedirect(req.getContextPath()+"/LoginSuccessful.html");
		else
			resp.sendRedirect(req.getContextPath()+"/LoginFailed.html");
		
		
		
		
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	doGet(req,resp);
	
	}
	
}
