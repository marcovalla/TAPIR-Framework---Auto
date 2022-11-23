package main;

public class ValidExample {

	public static void main(String[] args) {

		Auto auto = new Auto("Ferrari", 1990);
		
		auto.arrancarMotor();
		
		auto.acelerar();
		auto.frenar();
		auto.acelerar();
		auto.encenderLuzGiro();
		auto.doblar();
		auto.acelerar();
		auto.frenar();
		
		auto.apagarMotor();

	}

}
