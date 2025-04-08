package br.com.enssenai.Calculadora.model;

public class Trapezio {
	private double basemenor = 10;
	private double basemaior = 20;
	private double altura = 20;
	private double area;
	
	public void calcularArea() {
		area = ((basemenor+basemaior)*altura)/2;
	}
	public void mostrarDados() {
		System.out.println("---------------------------");
		System.out.println("Forma geométrica: Trapézio");
		System.out.println("---------------------------");
		System.out.println("MEDIDAS");
		System.out.println("base maior: "+basemaior);
		System.out.println("base menor: "+basemenor);
		System.out.println("altura: "+altura);
		System.out.println("---------------------------");
		System.out.println("RESOLUÇÕES OBTIDAS");
		System.out.println("Área: "+area);
		System.out.println("---------------------------");
	}
}
