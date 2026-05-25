import java.util.Scanner;

public class UserInput{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter your name: ");
		String name = input.nextLine();
		
		System.out.printf("
		System gender = input.next();
		
		System.out.print("Enter the number of students in your class: ")		
		shortnumberOfStudent = input.nextShort();
		
		System.out.print("Enter the number of students in your school: ")		
		int totalNumberOfStudent = input.nextInt();
		
		System.out.print("Enter your age")
		char grade = input.next().charAt(0);
		
		System.out.print("Do you love learning java(True/False): ")
		boolean loveJava = input.nextBoolean();
		
		System.out.println("");
		System.out.printf("Information about %s%n",name);
		System.out.println("=================================================");
		
		
		System.out.printf("Hello %s, you are welcome to NIIT%n",name);
		System.out.printf("You are %s and you are %d years old%n",gender,age);
		System.out.printf("There are %d student in your class%n",numberOfStudent);
		System.out.printf("The totalNumberOfStudent in your school is %,d%n",totalNumberOfStudent);
		System.out.printf("There is %c%n",grade);
		System.out.printf("Do you love Java? %b%n",loveJava);
	}
}