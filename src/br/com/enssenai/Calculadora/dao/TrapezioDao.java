package br.com.enssenai.Calculadora.dao;
import java.util.Scanner;
import br.com.enssenai.Calculadora.model.Trapezio;

public class TrapezioDao {
	public static void criarTrapezio() {
		Trapezio trapezio = new Trapezio();
		Scanner reader = new Scanner(System.in);
		
		System.out.println("\nCriando trapezio... ");
		System.out.println("Insira a base menor: ");
		
		trapezio.setBaseMenor(reader.nextDouble());
		
		System.out.println("Insira a base maior: ");
		
		trapezio.setBaseMaior(reader.nextDouble());
		
		System.out.println("Insira a altura: ");
		
		trapezio.setAltura(reader.nextDouble());
		
		trapezio.mostrarDados();
	}
}
