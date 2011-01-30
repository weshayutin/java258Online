package com.example.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.model.BeerExpert;

/**
 * Servlet implementation class BeerSelect
 */
public class BeerSelect extends HttpServlet
{
   private static final long serialVersionUID = 1L;

   /**
    * @see HttpServlet#HttpServlet()
    */
   public BeerSelect()
   {
      super();
      // TODO Auto-generated constructor stub
   }

   /**
    * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
    *      response)
    */
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException
   {
      // TODO Auto-generated method stub
   }

   /**
    * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
    *      response)
    */
   public void doPost(HttpServletRequest request, HttpServletResponse response)
         throws IOException, ServletException
   {

      String c = request.getParameter("color");
      BeerExpert be = new BeerExpert();
      List result = be.getBrands(c);
      String bookName = getServletConfig().getInitParameter("bookName");
      String authorName = getServletConfig().getInitParameter("authorName");
      String emailAddress = getServletConfig().getInitParameter("emailAddress");
      
      request.setAttribute("styles", result);
      request.setAttribute("bookName",bookName);
      request.setAttribute("authorName",authorName);
      request.setAttribute("emailAddress",emailAddress);
      RequestDispatcher view = request.getRequestDispatcher("result.jsp");
      view.forward(request, response);
   }
}
