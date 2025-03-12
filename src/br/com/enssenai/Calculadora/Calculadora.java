/* kauan */

package br.com.enssenai.Calculadora;

import br.com.enssenai.Calculadora.model.Circunferencia;
import br.com.enssenai.Calculadora.model.Quadrado;
import br.com.enssenai.Calculadora.model.Retangulo;
import br.com.enssenai.Calculadora.model.Trapezio;
import br.com.enssenai.Calculadora.model.Triangulo;

public class Calculadora {

	public static void main(String[] args) {
		
		Quadrado quadrado = new Quadrado();
		quadrado.calcularArea();
		quadrado.calcularPerimetro();
		quadrado.mostrarDados();
		
		Retangulo retangulo = new Retangulo();
		retangulo.calcularArea();
		retangulo.calcularPerimetro();
		retangulo.mostrarDados();
		
		Triangulo triangulo = new Triangulo();
		triangulo.calcularArea();
		triangulo.mostrarDados();
		
		Trapezio trapezio = new Trapezio();
		trapezio.calcularArea();
		trapezio.mostrarDados();
		
		Circunferencia circunferencia = new Circunferencia();
		circunferencia.calcularArea();
		circunferencia.mostrarDados();
		
		
	}

}
