import java.util.Scanner;  

public class input{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in); // "Scanner" is the type, "input" is the variable. DON'T CHANGE THE TYPE
		
		System.out.println("Welcome to my program");
		System.out.print("What should we call you: ");
		String your_name = input.nextLine();
		System.out.printf("Hello, %s ", your_name); // printf = print formatted | %s = placeholder for the variable name
	}
}
		
		