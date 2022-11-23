package main;


public class InvalidExample {

	public static void main(String[] args) {
		
		Auto auto2 = new Auto("Audi", 2002);
		
		auto2.arrancarMotor();
		
		auto2.acelerar();
		auto2.doblar();
		auto2.frenar();
		
		auto2.apagarMotor();
	}

}
