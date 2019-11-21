package com.fraseM.fmmvc.model;

import java.util.Date;

public class Frase
{
	private int idFrase;
	private String Contenido= " ";
	private String Cantidad = " ";
	private String FechaDesde =" ";
	private Date fecha;
	
	public String getContenido()
	{
	return  Contenido;
	
	}
	public void setContenido(String Contenido)
	{
		this.Contenido=Contenido;
	}
	public String getCantidad()
	{
		return Cantidad;
	}
	public void setCantidad(String Cantidad)
	{
		this.Cantidad=Cantidad;
	}
	public String getFechaDesde()
	{
		return FechaDesde;
	}
	public void setFechaDesde(String FechaDesde)
	{
		this.FechaDesde=FechaDesde;
	}
	public Date getFecha()
	{
		return fecha;
	}
	public void setFecha(Date fecha)
	{
		this.fecha=fecha;
	}
	

}
