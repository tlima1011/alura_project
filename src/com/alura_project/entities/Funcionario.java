package com.alura_project.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Funcionario {
	
	private static int ultimoCodigo = 0; 
	private int id; 
	private String nome = ""; 
	private String departamento = ""; 
	private Double salario = 0.0; 
	private Date dataEntrada; 
	private String rg = "";
	
	public Funcionario() {

	}
	
	public void setId(int i) {
		this.id = i;
	}
	
	public int getId() {
		return id;
	}
		
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setDepartamento(String departamento) { 
		this.departamento = departamento; 
	}
	
	public String getDepartamento() {
		return departamento; 
	}
	
	public void setRg(String rg) {
		this.rg = rg; 
	}
	
	public String getRg() {
		return rg;
	}
	
	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada; 
	}
	
	public Date getDataEntrada() {
		return dataEntrada;
	}
	
	public void setSalario(double salario) {
		this.salario = salario; 
	}
	
	public double getSalario() {
		return salario; 
	}
	
	
	public Funcionario(String nome, String departamento, String rg, Date date, Double salario) {
		this.nome = nome; 
		this.rg = rg; 
		this.departamento = departamento; 
		this.dataEntrada = date; 
		this.salario = salario; 
	}

	public Funcionario(String nome, String departamento, String rg, Date date, Double salario,
			double recebeAumento) {
		this.nome = nome; 
		this.rg = rg; 
		this.departamento = departamento; 
		this.dataEntrada = date; 
		this.salario = salario; 
		this.recebeAumento(salario);
		calculaGanhoAnual();
	}

	public double recebeAumento(Double salario) { 
		return salario * 1.1; 
	}
		
	public void calculaGanhoAnual() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
		System.out.println("Nome: " +nome);
		System.out.println("Departamento: " +departamento); 
		System.out.println("Nº RG " +rg);
		System.out.println("Data de entrada: " + sdf.format(dataEntrada));
		System.out.println("Salario Atual R$" +salario);
		salario = recebeAumento(salario); 
		System.out.println("Novo Salario R$" +salario);
		salario *= 12; 
		System.out.println("Ganho Atual R$" +salario);
	}

	
}
