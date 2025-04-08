package br.com.enssenai.Calculadora.dao;
import br.com.enssenai.Calculadora.model.Quadrado;
import java.util.Scanner;

public class QuadradoDao {
	
	public static void criarQuadrado() {
		//Instanciando
		Quadrado quadrado = new Quadrado();
		Scanner reader = new Scanner(System.in);
		
		//Comunicação com usuário
				System.out.println("\nCriando quadrado... ");
				System.out.println("Insira o lado: ");
			
		//Recebendo lado
		quadrado.setLado(reader.nextDouble());
				
		//Print de informações do quadrado
		quadrado.mostrarDados();
				
		//Encerrando o reader
		reader.close();
		
	}

}
