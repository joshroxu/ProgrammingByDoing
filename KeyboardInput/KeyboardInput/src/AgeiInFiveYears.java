import java.util.Scanner;
public class AgeiInFiveYears {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		int age;
		
		System.out.print(" What's your name? ");
			name = keyboard.next();
		System.out.print(" Hi " + name + " " + "How old are you? ");
			age = keyboard.nextInt();
		System.out.print("WOW! " + name + " " + "You are quite old! ");
		System.out.print(" Did you know that in five years you will be " + (age + 5) + " years young");
		System.out.print(" And five years ago you were " + (age - 5) + " " + "!" + "Imagine that! " );
	}
}
