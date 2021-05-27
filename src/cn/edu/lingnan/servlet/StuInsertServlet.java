package cn.edu.lingnan.servlet;

import cn.edu.lingnan.dao.StudentDao;
import cn.edu.lingnan.dto.StudentDto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Vector;
@WebServlet("/register")
public class StuInsertServlet extends HttpServlet {
    @Override

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        //1获取页面提交的参数
        String sid=req.getParameter("sid");
        String sname=req.getParameter("sname");
        String password=req.getParameter("password");
        String superuser=req.getParameter("superuser");
//        System.out.println("--------"+sid);
        //2处理业务逻辑
        StudentDao sd =new StudentDao();
        StudentDto sdto= new StudentDto();
        sdto.setSid(sid);
        sdto.setSname(sname);
        sdto.setPassword(password);
        sdto.setSuperuser(Integer.parseInt(superuser));
        sd.insertInfoToStudent(sdto);
        //3
        resp.sendRedirect(req.getContextPath()+"/index.html");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
