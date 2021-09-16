package com.alura_project.entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class ProcessaData {
	
	public static boolean inicializaData() throws ParseException {
		
		Date now = new Date();
		SimpleDateFormat formatada = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataIndependencia = formatada.parse("07/09/1822");
		String di = formatada.format(dataIndependencia);
		System.out.println("Data Independencia: " +di);
		if(now == dataIndependencia) {
			return true; 
		}
		else {
			return false;
		}
	}
	
	public static boolean comparaComIndependencia(int dia, int mes, int ano) throws ParseException { 
		LocalDate informado = LocalDate.of(1822, mes, dia);
		LocalDate independencia = LocalDate.of(1822, 9, 7);
		if(independencia.equals(informado)) {
			return true; 
		}else {
			return false;
		}
	}
}
