import java.util.Scanner;
public class BMIcalculator {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double height, weight, BMI; 
		
		System.out.print(" Please enter your height in M ");
		height = keyboard.nextDouble();
		System.out.print(" Please enter your weight in KG ");
		weight = keyboard.nextDouble();
		System.out.print(" Your BMI is " + (weight / (height * height)));
		
		
	}

}
