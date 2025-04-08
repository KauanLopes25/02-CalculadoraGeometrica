package br.com.enssenai.Calculadora.model;

public class Circunferencia {
	private double pi = 3.141592653589793;
	private double raio;
	private double area;
	
	public void setRaio(double raio) {
		if (raio < 0) {
			System.out.println("Por favor inserir um número maior que 0");
		} else {
			this.raio = raio;
			calcularArea();
		}
	}

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
