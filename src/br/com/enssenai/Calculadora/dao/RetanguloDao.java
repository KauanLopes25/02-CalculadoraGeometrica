package br.com.enssenai.Calculadora.dao;
import br.com.enssenai.Calculadora.model.Retangulo;
import java.util.Scanner;

public class RetanguloDao {
	public static void criarRetangulo() {
		//Instanciando
		Retangulo retangulo = new Retangulo();
		Scanner reader = new Scanner(System.in);
		
		//Comunicação com usuário 
		System.out.println("\nCriando retangulo... ");
		System.out.println("Insira o lado do retangulo: ");
		
		//Recebendo base
		retangulo.setBase(reader.nextDouble());
		
		//Comunicação com usuário
		System.out.println("Insira o altura do retangulo: ");
		
		//Recebendo altura
		retangulo.setAltura(reader.nextDouble());
		
		//Mostrar dados
		retangulo.mostrarDados();
		
		//Encerrar o reader
		reader.close();
	}

}
