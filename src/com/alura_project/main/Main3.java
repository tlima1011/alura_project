package com.alura_project.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

import com.alura_project.entities.ProcessaData;

public class Main3 {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		int dia = 0, mes =0, ano = 0; 
		
		SimpleDateFormat formata = new SimpleDateFormat("dd/MM/yyyy"); 
		SimpleDateFormat formataDataHora = new SimpleDateFormat("dd/MM/yyyy HH:mm"); 
		SimpleDateFormat dataHora = new SimpleDateFormat("HH:mm");
		Date now = new Date(); 
		System.out.println(now);
		System.out.println(formata.format(now));
		System.out.println(formataDataHora.format(now));
		System.out.println(dataHora.format(now));
		
		boolean independencia = ProcessaData.inicializaData();
		System.out.println("***********************************************************");
		if(independencia == true) {
			System.out.println("Hoje é dia da Independencia");
		}else {
			System.out.println("Hoje não é dia da Independencia");
		}
		
		System.out.println("***********************************************************");
		try {
			do {
				System.out.print("Informe um dia: ");
				dia = sc.nextInt(); 
				if(dia < 1 || dia > 31) {
					System.out.println("Dia inválido, não pode ser menor que 1 ou maior que 31");
				}
			}while(dia < 1 || dia > 31);
			do {
				System.out.print("Informe um mes: ");
				mes = sc.nextInt();
				if(mes < 1 || mes > 12) {
					System.out.println("Mes inválido, não pode ser menor que 1 ou maior que 12");
				}
			}while(mes < 1 || mes > 12);
			do {
				System.out.print("Informe um ano: ");
				ano = sc.nextInt(); 
				if(ano < 1822) {
					System.out.println("Ano nao pode ser menor que 1822 e menor que 0");
				}
			}while(ano < 1822);
			boolean compararInd = ProcessaData.comparaComIndependencia(dia, mes, ano); 
			if(compararInd == true) {
				System.out.println("A Data informada é dia da independencia");
			}else {
				System.out.println("A Data informada não é dia da independencia");
			}
		}catch(java.util.InputMismatchException e) {
			System.out.println("Valor inválido para dia / mes / ano ");
		}
		sc.close();
	}
}
