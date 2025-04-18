package br.com.enssenai.Calculadora.model;

public class Trapezio {
	private double basemenor;
	private double basemaior;
	private double altura;
	private double area;
	
	public void setBaseMenor(double basemenor) {
		if (basemenor < 0) {
			System.out.println("Por favor inserir um número maior que 0");
		} else {
			this.basemenor = basemenor;
		}
	}
	
	public void setBaseMaior(double basemaior) {
		if (basemaior < 0) {
			System.out.println("Por favor inserir um número maior que 0");
		} else {
			this.basemaior = basemaior;
		}
	}
	
	public void setAltura(double altura) {
		if (altura < 0) {
			System.out.println("Por favor inserir um número maior que 0");
		} else {
			this.altura = altura;
			calcularArea();
		}
	}
	
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
