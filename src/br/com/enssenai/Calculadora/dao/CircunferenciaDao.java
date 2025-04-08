package br.com.enssenai.Calculadora.dao;

import java.util.Scanner;

import br.com.enssenai.Calculadora.model.Circunferencia;

public class CircunferenciaDao {
	public static void criarCircunferencia() {
		Circunferencia circunferencia = new Circunferencia();
		Scanner reader = new Scanner(System.in);
		
		System.out.println("\nCriando circunferencia... ");
		System.out.println("Insira o raio: ");
		
		circunferencia.setRaio(reader.nextDouble());
		
		circunferencia.mostrarDados();
	}
}
