package com.alura_project.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.alura_project.entities.Empresa;
import com.alura_project.entities.Funcionario;
import com.alura_project.exception.ValorInvalido;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in); 
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
		
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		Funcionario f3 = new Funcionario(); 
		Funcionario f4 = new Funcionario();
		Empresa empresa = new Empresa(); 
		int cod = 0; 
		String nome = ""; 
		try {
			f1.setNome("Joca Mineiro"); 
			f1.setDepartamento("Xupetisses"); 
			f1.setRg("24242424");
			f1.setDataEntrada(sdf.parse("25/05/2021")); 
			f1.setSalario(1000.00);
			cod = 8;			
			empresa.adicionar(f1, cod);
			
			f2.setNome("Luis Astrogildo"); 
			f2.setDepartamento("Almoxarifado"); 
			f2.setRg("5554564"); 
			f2.setDataEntrada(sdf.parse("22/05/2021")); 
			f2.setSalario(2500.00); 
			cod = 1; 
			empresa.adicionar(f2, cod);
			
			f3.setNome("Xurimila Stephany"); 
			f3.setDepartamento("Gerente UX Design");
			f3.setRg("77777");
			f3.setDataEntrada(sdf.parse("15/08/2018")); 
			f3.setSalario(5500.0);
			cod = 0; 
			empresa.adicionar(f3,cod);
			
			f4.setNome("Stevie"); 
			f4.setDepartamento("Programador Pl");
			f4.setRg("88877445");
			f4.setDataEntrada(sdf.parse("22/07/2019")); 
			f4.setSalario(6500.0);
			cod = 4; 
			empresa.adicionar(f4,cod);
			
		}catch(java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println("O numero de posicao de 0 a 9" +e.getMessage());
		}catch(ValorInvalido e) {
			System.out.println("Input error: " +e.getMessage());
		}finally {
			Empresa.mostrarDadosFuncionarios(); 
			System.out.println("-------------------------");
			System.out.println("  Cadastro Finalizado!!!");
			System.out.println("-------------------------");
		}
		try {
			System.out.print("Informe um codigo para buscar: ");
			cod = sc.nextInt(); 
			nome = empresa.getFuncionario(cod);
			System.out.printf("Nome procurado com código encontrado: %d: %s", cod ,nome);
		}catch(java.util.InputMismatchException e) {
			System.out.println("Input error, digitado valor invalido " +e.getMessage());
		}catch(ValorInvalido e) {
			System.out.println("Error: " +e.getMessage());
		}
		sc.close();
	}
}
