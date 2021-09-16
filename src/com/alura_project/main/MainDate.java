package com.alura_project.main;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MainDate {

	public static void main(String[] args) {
		
		Date dataDeAgora = new Date(); 
		
		//São máscaras 
		SimpleDateFormat dataFormatadaVaiVendoBrasil = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat dataFormatadaEua = new SimpleDateFormat("MM/dd/yyyy");
		SimpleDateFormat dataFormatadaJapones = new SimpleDateFormat("yyyy/MM/dd");
		DateTimeFormatter formatadorBrasileiro = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatadorEUA = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		//Data por extenso 
		System.out.println(dataDeAgora);
		System.out.println("=================== Datas ===============================");
		System.out.println("Data Brasil: "+dataFormatadaVaiVendoBrasil.format(dataDeAgora));
		System.out.println("Data Born in the USA: " + dataFormatadaEua.format(dataDeAgora));
		System.out.println("Data japonesa: " + dataFormatadaJapones.format(dataDeAgora));
		System.out.println("==========================================================");
		int dia = 15;
		int mes = 9;
		int ano =  2021;
		System.out.println("Dia: "+dia);
		System.out.println("Mes: " +mes);
		System.out.println("Ano: " +ano);
		LocalDate informado = LocalDate.of(ano, mes, dia);
		String formatadoData = formatadorBrasileiro.format(informado);  
		System.out.println(formatadoData);
		LocalDate dtUSA = LocalDate.of(ano, mes, dia);
		String d = formatadorEUA.format(dtUSA);
		System.out.println("Data USA: " +d);
	}
}
