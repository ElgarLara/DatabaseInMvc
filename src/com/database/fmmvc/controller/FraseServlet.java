package com.database.fmmvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FraseServlet extends HttpServlet
{
	

private static final long serialVersionUID=1l;
     
    @Override
    	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    		// TODO Auto-generated method stub
    		super.doPost(req, resp);
    	
	
        String txtContenido=req.getParameter("txtContenido");
		String txtCantidad=req.getParameter("txtCantidad");
		String txtFechaDesde=req.getParameter("txtFechaDesde");
		
    }	
		
	

}
