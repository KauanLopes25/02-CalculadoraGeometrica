package br.com.enssenai.Calculadora.model;

public class Circunferencia {
	private double pi = 3.141592653589793;
	private double raio = 5;
	private double area;
	
	public void calcularArea() {
		area = pi*(raio*raio);
	}
	public void mostrarDados() {
		System.out.println("---------------------------");
		System.out.println("Forma geométrica: Circunferência");
		System.out.println("---------------------------");
		System.out.println("MEDIDAS");
		System.out.println("Raio: "+raio);
		System.out.println("---------------------------");
		System.out.println("RESOLUÇÕES OBTIDAS");
		System.out.println("Área: "+area);
		System.out.println("---------------------------");
	}
}
