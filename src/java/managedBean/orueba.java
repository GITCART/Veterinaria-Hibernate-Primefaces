/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBean;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Computer
 */
public class orueba {
    public static void main(String[] args) {
        //Diferentes fechas a parsear
		String stringFechaHora = "2014-10-20 20:10:59";
		String stringFecha = "20/10/2014";
		String stringHora = "10:20:59";
		
		
		try {
			//Se necesita definir un formato para poder cambiar el String a Date
			//En este caso buscará en el String año-mes-dia hora:minutos:segundos
			DateFormat fechaHora = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date convertido = fechaHora.parse(stringFechaHora);
			System.out.println(convertido);
			
			//En este caso buscará en el String dia/mes/año
			DateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");
			convertido = fecha.parse(stringFecha);
			System.out.println(convertido);
			
			//En este caso buscará en el String hora:minutos:segundos
			DateFormat hora = new SimpleDateFormat("HH:mm:ss");
			convertido = hora.parse(stringHora);
			System.out.println(convertido);
			
			//En este caso buscara hora:minutos:segundos en el String "20/10/2014"
			//No lo encntrará y será error por lo que nos mandará al catch.
			convertido = hora.parse(stringFecha);
			System.out.println(convertido);
		
		} catch (ParseException e) {
			System.out.println("Error: " + e.getMessage());
		}
    }
}
