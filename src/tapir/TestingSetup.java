package tapir;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import main.Auto;

public class TestingSetup {
	public static void setup() {
		HashMap<Integer, String> mapObjectsToCallSequence = null; 
		HashMap<String, String> mapMethodsToSymbols = null; 
		Pattern regularExpression = null; 
		Matcher matcher = null;
		
		//Specification of the test class\
		TestingCore.mapClassToTestingInformation = new HashMap<>();
			
		
		// Testing setup for Auto class
		//Definition of the methods and their corresponding symbols
		mapObjectsToCallSequence = new HashMap<>(); 
		mapMethodsToSymbols = new HashMap<String, String>();
		mapMethodsToSymbols.put("main.Auto.<init>", "c");
		mapMethodsToSymbols.put("main.Auto.arrancarMotor", "s");
		mapMethodsToSymbols.put("main.Auto.apagarMotor", "e");
		mapMethodsToSymbols.put("main.Auto.acelerar", "a");
		mapMethodsToSymbols.put("main.Auto.frenar", "f");
		mapMethodsToSymbols.put("main.Auto.doblar", "d");
		mapMethodsToSymbols.put("main.Auto.encenderLuzGiro", "g");
		//Definition of the regular expression
		regularExpression = Pattern.compile("cs(a|f|(gd))*e");
		//Initializing the regular expressions controller
		matcher = regularExpression.matcher("");	
		// All information related to how the Auto class is testing is store in a TestingInformation instance
		TestingInformation ti = new TestingInformation(Auto.class.toString(), mapObjectsToCallSequence, mapMethodsToSymbols, regularExpression, matcher, true);
		TestingCore.mapClassToTestingInformation.put(Auto.class.toString(), ti);
		
		mapObjectsToCallSequence = null; 
		mapMethodsToSymbols = null; 
		regularExpression = null; 
		matcher = null;
}
	
}
