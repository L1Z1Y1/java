package bcqd;
import java.util.Scanner;
public class FahrenheitToCelsius {
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a degree in Fahrenheit: ");
		double fahrenheit=input.nextDouble();
		double celsius=(5.0/9)*(fahrenheit-32);
		// 5/9的结果为0
		System.out.println("Fahrenheit "+fahrenheit+" is "+celsius+" om Celsius");
	}
}
