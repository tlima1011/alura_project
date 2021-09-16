package com.alura_project.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Funcionario1 {
	
	private String nome; 	
	private int dia; 
	private int mes; 
	private int ano; 
	private double salario; 
	
	//Método construtor 1
	public Funcionario1() {
		
	}
	
	//Método construtor 2
	public Funcionario1(String nome, int dia, int mes, int ano, double salario) {
		this.nome = nome; 
		this.dia = dia; 
		this.mes = mes;
		this.ano = ano; 
		this.salario = salario;
	}
	
	public void setNome(String nome) { //Set é para mudar  
		this.nome = nome; 
	}
	
	public String getNome() { //Get Acessar invocando o atributo
		return nome; 
	}
	
	public void setDia(int dia) { //Set é para mudar 
		this.dia = dia; 
	}
	
	public int getDia() { //Get Acessar invocando o atributo
		return dia; 
	}
	
	public void setMes(int mes) {
		this.mes = mes; 
	}
	
	public int getMes() { //Get Acessar invocando o atributo
		return mes; 
	}
	
	public void setAno(int ano) {
		this.ano = ano; 
	}
	
	public int getAno() {
		return ano; 
	}
	
	public void setSalario(double salario) {
		this.salario = salario; 
	}
	
	public double getSalario() {
		return salario; 
	}
	
	public static void mostrarData(Funcionario1 [] funcionarios) { 
		DateTimeFormatter formatadorBrasileiro = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		for(int i = 0; i < funcionarios.length;i++) {
			Funcionario1 f = funcionarios[i]; 
			//Cliente cliente = this.titular[i]; 
            if(f == null) continue; 
			System.out.println("Nome: " +f.getNome());
			LocalDate dataInformada = LocalDate.of(f.getAno(), f.getMes(), f.getDia());
			String dt = formatadorBrasileiro.format(dataInformada);
			System.out.println("Data de Inscrição: " +dt + " - Salario R$"  +String.format("%.2f", f.getSalario()));
		}
	}
}
