package com.database.fmmvc.controller;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.database.fmmvc.dataBaseUtil;
import com.database.fmmvc.db.DatabaseManager;
import com.fraseM.fmmvc.model.Frase;
import com.fraseM.fmmvc.model.Persona;

@WebServlet("/frase")
public class FraseServlet extends HttpServlet
{
	

private static final long serialVersionUID=1l;

Connection conn=null;
DatabaseManager dbManager=null;
Frase frase=null;

@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	
	Connection conn =null;
	DatabaseManager dbManager=null;
	List<Frase> frase=null;
	RequestDispatcher dispatcher=null;
	
	conn=dataBaseUtil.getConnection();
	dbManager=new DatabaseManager(conn);
	frase=dbManager.consultarFrases();
	
	req.setAttribute("listFrase", frase);
	
	dispatcher=req.getRequestDispatcher("frase.jsp");
	dispatcher.forward(req, resp);
	}
     
    @Override
    	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    		// TODO Auto-generated method stub
    		super.doPost(req, resp);
    	
	
        String txtContenido=req.getParameter("txtContenido");
		String txtCantidad=req.getParameter("txtCantidad");
		String txtFechaDesde=req.getParameter("txtFechaDesde");
		
		Frase frase=new Frase();
		frase.setContenido(txtContenido);
		frase.setCantidad(txtCantidad);
		frase.setFechaDesde(txtFechaDesde);
		
		conn=dataBaseUtil.getConnection();
		dbManager=new DatabaseManager(conn);
		dbManager.crearFrase(frase);
		doGet(req, resp);
	
		
		
    }	
		
	

}
