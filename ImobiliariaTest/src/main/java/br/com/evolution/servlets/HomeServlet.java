package br.com.evolution.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/" })
public class HomeServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	 
	   public HomeServlet() {
	       super();
	   }
	 
	   @Override
	   protected void doGet(HttpServletRequest request, HttpServletResponse response)
	           throws ServletException, IOException {
		   //indica para qual jsp que vai
		   RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/pages/index.jsp");
	        
		   //aqui vai codigo doque sera feito
		   
		   
		   //encaminha requisição
		   dispatcher.forward(request, response);
	        
	   }
}
