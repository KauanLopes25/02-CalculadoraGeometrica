package br.com.enssenai.Calculadora.model;

public class Retangulo {
	private double base = 2;
	private double altura = 4;
	private double area;
	private double perimetro;
	
	public void setBase(double base) {
		if(base <= 0) {
			System.out.println("Por favor inserir um número maior que 0");
		}
		else {
			this.base = base;
		}
	}
	public void setAltura(double altura) {
		if(altura <= 0) {
			System.out.println("Por favor inserir um número maior que 0");
		}
		else {
			this.altura = altura;
			calcularArea();
			calcularPerimetro();
		}
	}
	public void calcularArea() {
		area = base*altura;
	}
	public void calcularPerimetro() {
		perimetro = (altura*2)+(base*2);
	}
	public void mostrarDados() {
		System.out.println("--------------");
		System.out.println("Forma geométrica: Retângulo");
		System.out.println("--------------");
		System.out.println("MEDIDAS");
		System.out.println("base: "+base);
		System.out.println("altura: "+altura);
		System.out.println("--------------");
		System.out.println("RESOLUÇÕES OBTIDAS");
		System.out.println("Área: "+area);
		System.out.println("Perimetro: "+perimetro);
		System.out.println("--------------");
	}
}

