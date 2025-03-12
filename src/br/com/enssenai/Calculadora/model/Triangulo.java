package br.com.enssenai.Calculadora.model;

public class Triangulo {
	private double base = 10;
	private double altura = 20;
	private double area;
	
	
	public void calcularArea() {
		area = (base*altura)/2;
		
	}
	
	public void mostrarDados() {
		System.out.println("--------------");
		System.out.println("Forma geométrica: Triângulo");
		System.out.println("--------------");
		System.out.println("MEDIDAS");
		System.out.println("base: "+base);
		System.out.println("altura: "+altura);
		System.out.println("--------------");
		System.out.println("RESOLUÇÕES OBTIDAS");
		System.out.println("Área: "+area);
		System.out.println("--------------");
	}
}
