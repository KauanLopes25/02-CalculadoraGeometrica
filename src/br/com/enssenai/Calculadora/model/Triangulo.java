package br.com.enssenai.Calculadora.model;

public class Triangulo {
	private double base;
	private double altura;
	private double area;
	

	public void setBase(double base) {
		if (base < 0) {
			System.out.println("Por favor inserir um número maior que 0");
		} else {
			this.base = base;
		}
	}
	
	public void setAltura(double altura) {
		if (altura < 0) {
			System.out.println("Por favor inserir um número maior que 0");
		} else {
			this.altura = altura;
			calcularArea();
			mostrarDados();
		}
	}

	public void calcularArea() {
		area = (base*altura)/2;
		
	}
	
	public void mostrarDados() {
		System.out.println("---------------------------");
		System.out.println("Forma geométrica: Triângulo");
		System.out.println("---------------------------");
		System.out.println("MEDIDAS");
		System.out.println("base: "+base);
		System.out.println("altura: "+altura);
		System.out.println("---------------------------");
		System.out.println("RESOLUÇÕES OBTIDAS");
		System.out.println("Área: "+area);
		System.out.println("---------------------------");
	}
}
