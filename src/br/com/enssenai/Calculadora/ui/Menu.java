package br.com.enssenai.Calculadora.ui;

import java.util.Scanner;

import br.com.enssenai.Calculadora.dao.QuadradoDao;

public class Menu {
	
	public static void mostrarMenu() {
		
		System.out.println("---------------------------");
		System.out.println("Calculadora de Polígonos");
		System.out.println("---------------------------");
		System.out.println("1- Quadrado (NOVO)");
//		System.out.println("2- Retângulo (NOVO)");
//		System.out.println("3- Trapézio (NOVO)");
//		System.out.println("4. Circunferência (NOVO)");
//		System.out.println("5- Triângulo (NOVO)");
//		System.out.println("6- Sair");
		System.out.println("---------------------------");
//		System.out.print("Escolha uma opção (1-6): ");
		
		Scanner reader = new Scanner(System.in);
		int opcao = reader.nextInt();
		
		if (opcao == 1) {
			System.out.println("Você selecionou o Quadrado");
			QuadradoDao.criarQuadrado();
		}
		else {
			System.out.println("Você digitou outro numero");
//			return;
		}
	}
	

}
