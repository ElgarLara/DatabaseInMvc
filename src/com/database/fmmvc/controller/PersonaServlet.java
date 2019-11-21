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
import com.fraseM.fmmvc.model.Persona;

@WebServlet("/personas")
public class PersonaServlet extends HttpServlet
{
	
	private static final long serialVersionUID=1l;
	
	
	 Connection conn=null;
	 DatabaseManager dbManager=null;
	 Persona persona=null;
	 
	 @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		DatabaseManager dbManageer=null;
		List<Persona> personas=null;
		RequestDispatcher dispatcher=null;
		
		
		conn =dataBaseUtil.getConnection();
		dbManager=new DatabaseManager(conn);
		personas = dbManager.consultarPersonas();
		//preparar para mandar a vista(MVC)
		req.setAttribute("listPersona", personas);
		//indica ruta a usar
		dispatcher=req.getRequestDispatcher("personas.jsp");
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//obtener datos
		String txtNombre =req.getParameter("txtNombre");
		String txtEdad =req.getParameter("txtEdad");
		String txtCarrera =req.getParameter("txtCarrera");
		
		//validar datos
		
		//modelar
		Persona persona=new Persona();
		persona.setNombre(txtNombre);
		persona.setEdad(Integer.parseInt(txtEdad));
		persona.setCarrera(txtCarrera);
		
		//guardar datos
		//obtener conexion
		conn = dataBaseUtil.getConnection();
		//encargado de manipular datos
		dbManager=new DatabaseManager(conn);
		//procesar datos
		dbManager.crearPersona(persona);
		doGet(req, resp);
		
	}
	
	
	


	

}
