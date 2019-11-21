package com.database.fmmvc.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.fraseM.fmmvc.model.Frase;
import com.fraseM.fmmvc.model.Persona;

public class DatabaseManager
{
	private Connection conn;
	
	public DatabaseManager(Connection conn)
	{
		this.conn=conn;
		
	}
	public void crearPersona(Persona persona)
	{
		String query="insert into persona(nombre, edad, carrera)"
				+"Values("+ persona.toString()+")";
		//indicar instruccion

		Statement stmnt=null;
		try {
			//ejecutar intruccion
			stmnt=conn.createStatement();
			stmnt.executeUpdate(query);
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	public void crearFrase(Frase frase)
	{
		String query="insert into frase(contenido, cantidad, fechaDesde)"
				+"Values("+ frase.toString()+")";
		Statement stmnt=null;
		try {
			stmnt=conn.createStatement();
			stmnt.executeQuery(query);
		} catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
	}
	
	public void crearfrasePersona(int idPersona, int idFrase)
	{
		String query ="insert into frasePersona(idPersona, idFrase)"
		+"Values("+idPersona+","+ idFrase+")";
	}
	public List<Persona> consultarPersonas()
	{
		String query="select * from persona";
		Statement stmnt =null;
		ResultSet rs =null;
		List<Persona>listPersonas=null;
		
		try {
			stmnt=conn.createStatement();
			rs=stmnt.executeQuery(query);
			listPersonas=new ArrayList<>();
			while (rs.next()) 
			{
				//creando modelo
				Persona persona=new Persona();
				//agregar valores al modelo
				persona.setIdPersona(rs.getInt("idPersona"));
				persona.setNombre(rs.getString("nombre"));
				persona.setEdad(rs.getShort("edad"));
				persona.setCarrera(rs.getString("carrera"));
				persona.setFecha(rs.getDate("fecha"));
				
				//agregar modelo a la lista
				listPersonas.add(persona);
			}
		
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		return listPersonas;
		
		
	}
	public List<Frase> consultarFrases()
	{
		return null;
		
	}
	public List<Frase> consultarFrasesPersonas(int idPersonas)
	{
		return null;
		
	}
	
	

}
