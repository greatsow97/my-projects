package com.myFirstProj.controller;


import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.myFirstProj.dao.LoginDao;

public class LoginServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException  {
	resp.setContentType("text/html");
	
	String username= req.getParameter("username");
	String pwd = req.getParameter("pwd");
	
	HttpSession session = req.getSession();
	
	RequestDispatcher rd = null;

	if (LoginDao.validate(username, pwd)) {
		session.setAttribute("username", username);
		rd= req.getRequestDispatcher("welcome.jsp");
		rd.forward(req, resp);
	}else {
		req.setAttribute("errorMessage", "Sorry, username or passwrod is incorrect");
		rd= req.getRequestDispatcher("index.jsp");
		rd.include(req, resp);
	}
		
	}
}
