package br.com.enssenai.Calculadora.dao;

import java.util.Scanner;

import br.com.enssenai.Calculadora.model.Triangulo;

public class TrianguloDao {
	
	public static void criarTriangulo() {
		Triangulo triangulo = new Triangulo();
		Scanner reader = new Scanner(System.in);
		
		System.out.println("\nCriando triangulo... ");
		System.out.println("Insira a base: ");
		
		triangulo.setBase(reader.nextDouble());
		
		System.out.println("Insira a altura: ");
		
		triangulo.setAltura(reader.nextDouble());
	}
}
