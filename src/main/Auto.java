package main;

public class Auto {
	private int modelo;
	private String marca;
	private boolean encendido;
	
	public Auto(String marca, int modelo) {
		this.marca = marca;
		this.modelo = modelo;
		encendido = false;
	}
	
	public void arrancarMotor() {
		encendido = true;
	}
	
	public void apagarMotor() {
		encendido = false;
	}
	
	public void acelerar() {
		System.out.println(marca+" acelera");
	}
	
	public void frenar() {
		System.out.println(marca+" frena");
	}
	
	public void doblar() {
		System.out.println(marca+" dobla");
	}
	
	public void encenderLuzGiro() {
		System.out.println(marca+" enciende luz de giro");
	}
}
