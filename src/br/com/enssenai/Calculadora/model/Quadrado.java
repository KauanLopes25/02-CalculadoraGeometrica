package br.com.enssenai.Calculadora.model;

public class Quadrado {
	private double lado = 5;
	private double area;
	private double perimetro;
	
	public void setLado(double lado) {
		if (lado <= 0) {
			System.out.println("Por favor inserir um número maior que 0");
		} else {
			this.lado = lado;
			calcularArea();
			calcularPerimetro();
		}
	}
	public void calcularArea() {
		area = lado*lado;
		
	}
	
	public void calcularPerimetro() {
		perimetro = lado+lado+lado+lado;
		
	}
	
	public void mostrarDados() {
		System.out.println("---------------------------");
		System.out.println("Forma geométrica: Quadrado");
		System.out.println("---------------------------");
		System.out.println("MEDIDAS");
		System.out.println("lado: "+lado);
		System.out.println("---------------------------");
		System.out.println("RESOLUÇÕES OBTIDAS");
		System.out.println("Área: "+area);
		System.out.println("Perimetro: "+perimetro);
		System.out.println("---------------------------");
	}
}
