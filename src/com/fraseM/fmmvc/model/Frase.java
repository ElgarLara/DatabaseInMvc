package com.fraseM.fmmvc.model;



public class Frase
{
	private int idFrase;
	private String Contenido= " ";
	private String Cantidad = " ";
	private String FechaDesde =" ";
	
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
	public String getFechaDe()
	{
		return FechaDesde;
	}
	public void setFechaDesde(String FechaDesde)
	{
		this.FechaDesde=FechaDesde;
	}
	

}
