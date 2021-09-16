package com.alura_project.main;

import com.alura_project.entities.Funcionario1;

public class Main2 {

	public static void main(String[] args) {
		
//		Funcionario1 func = new Funcionario1(); 
//		Funcionario1 f2 = new Funcionario1();
		
		Funcionario1 [] funcionarios = new Funcionario1[10]; 	
		funcionarios[0] = new Funcionario1(); 
		
		funcionarios[0].setNome("Dona Xepa");
		funcionarios[0].setDia(22);
		funcionarios[0].setMes(05);
		funcionarios[0].setAno(1999);
		funcionarios[0].setSalario(1557.22);
		
		funcionarios[1] = new Funcionario1(); 
		funcionarios[1].setNome("Adamastor");
		funcionarios[1].setDia(26);
		funcionarios[1].setMes(11);
		funcionarios[1].setAno(2020);
		funcionarios[1].setSalario(2578.99);
		
		funcionarios[2] = new Funcionario1("Xoelma", 22,11,2003, 5500.0);
		funcionarios[3] = new Funcionario1("Manoel Gladstone", 11,1,1955, 2000.0);
		funcionarios[4] = new Funcionario1("Stevenson", 04,3,1985, 3000.3    );
		funcionarios[6] = new Funcionario1("Washigton", 24,02,1990, 3500.55);
		
		Funcionario1.mostrarData(funcionarios);

	}

}
