package br.com.enssenai.Calculadora.ui;
import br.com.enssenai.Calculadora.dao.CircunferenciaDao;
import br.com.enssenai.Calculadora.dao.QuadradoDao;
import br.com.enssenai.Calculadora.dao.RetanguloDao;
import br.com.enssenai.Calculadora.dao.TrapezioDao;
import br.com.enssenai.Calculadora.dao.TrianguloDao;
import br.com.enssenai.Calculadora.model.Circunferencia;
import br.com.enssenai.Calculadora.model.Retangulo;

import java.util.Scanner;

public class Menu {
	
	public static void mostrarMenu() {
		
		System.out.println("---------------------------");
		System.out.println("Calculadora de Polígonos");
		System.out.println("---------------------------");
		System.out.println("1- Quadrado (NOVO)");
		System.out.println("2- Retângulo (NOVO)");
		System.out.println("3- Trapézio (NOVO)");
		System.out.println("4. Circunferência (NOVO)");
		System.out.println("5- Triângulo (NOVO)");
		System.out.println("6- Sair");
		System.out.println("---------------------------");
		System.out.print("Escolha uma opção (1-6): ");
		
		Scanner reader = new Scanner(System.in);
		int opcao = reader.nextInt();
		
		if (opcao == 1) {
			System.out.println("Você selecionou o Quadrado");
			QuadradoDao.criarQuadrado();
		}
		else if (opcao == 2){
			System.out.println("Você selecionou o Retangulo");
			RetanguloDao.criarRetangulo();
		}
		else if (opcao == 3) {
			System.out.println("Você selecionou o Trapézio");
			TrapezioDao.criarTrapezio();
		}
		else if (opcao == 4) {
			System.out.println("Você selecionou o Circunferência");
			CircunferenciaDao.criarCircunferencia();
		}
		else if (opcao == 5) {
			System.out.println("Você selecionou o Triângulo");
			TrianguloDao.criarTriangulo();
		}
		else if (opcao == 6) {
			System.out.println("Saindo do programa...");
			System.out.println("Programa encerrado");
		}
		else {
			System.out.println("Você digitou um numero inválido");
			mostrarMenu();
		}
	}
	

}
