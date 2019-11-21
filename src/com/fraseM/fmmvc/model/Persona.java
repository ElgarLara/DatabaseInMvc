package com.fraseM.fmmvc.model;

import java.util.Date;

public class Persona 
{
	private int idPersona;
	private int Edad = 0;
	private String Nombre= " ";
	private String carrera = " ";
	private Date fecha ;
	
	public int getIdPersona()
	{
	return idPersona;
	
	}
	public void setIdPersona(int IdPersona)
	{
		this.idPersona=IdPersona;
	}
	public int getEdad()
	{
	return  Edad;
	
	}
	public void setEdad(int Edad)
	{
		this.Edad=Edad;
	}
	public String getNombre()
	{
		return Nombre;
	}
	public void setNombre(String Nombre)
	{
		this.Nombre=Nombre;
	}
	public String getCarrera()
	{
		return carrera;
	}
	public void setCarrera(String carrera)
	{
		this.carrera=carrera;
	}
	public Date getFecha()
	{
		return fecha;
	}
	public void setFecha(Date fecha)
	{
		this.fecha=fecha;
	}
	
	@Override
	public String toString() {
		return String.format("'%s', %d, '%s'",Nombre, Edad, carrera);
	}
	

}
