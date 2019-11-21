package com.database.fmmvc;

import java.sql.Connection;
import java.sql.DriverManager;

public class dataBaseUtil
{
	//
	private static final String URL_FORMAT="jdbc:%s://%s:%s/%s?useUnicode=true" + 
			"&useJDBCCompliantTimezoneShift=true" + 
			"&useLegacyDatetimeCode=false" + 
			"&serverTimezone=UTC";
public static Connection getConnection()
//variables
{
	String dbms ="mysql";
	String host= "localhost";
	String port = "3306";
	String dataBaseName="frases_m";
	String user="root";
	String password="root";
	//7
	String url=String.format(URL_FORMAT, dbms,host, port, dataBaseName);
	
	//0:driver dbms
	//1:encargado de conectar con la base de datos
	Connection connection=null;
	
	try {
       
//crear instancia del driver en menmoria para accederla
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        //obtener la conxion de la base de datos
        connection=DriverManager.getConnection(url,user, password);
    } catch (Exception e) {
    	e.printStackTrace();
    	
    }
	return connection;
	
	
}
//this make the connection to close
public static void closeConection(Connection conn)
{
	try {
		conn.close();
		
	}catch (Exception e) {
		e.printStackTrace();
	}
	
}

	

}
