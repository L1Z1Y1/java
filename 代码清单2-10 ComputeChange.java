  import java.util.Scanner;
   public class ComputeChange {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("Enter an amount in double,for example 11.56: ");
		double amount=input.nextDouble();
		//存储输入的钱数
		int remainingAmount=(int)(amount*100);
		//存储变化的余额，总的一美分的个数
		int numberOfOneDollars=remainingAmount/100;
		remainingAmount=remainingAmount%100;
		int numberOfQuarters=remainingAmount/25;
		remainingAmount=remainingAmount%25;
		int numberOfDimes=remainingAmount/10;
		remainingAmount=remainingAmount%10;
		int numberOfNickels=remainingAmount/5;
		remainingAmount=remainingAmount%5;
		int numberOfPennies=remainingAmount;
		System.out.println("Your amount "+ amount +" consists of");
		System.out.println("    "+  numberOfOneDollars +" dollars");
		System.out.println("    "+ numberOfQuarters +" quarters");
		System.out.println("    "+ numberOfDimes +" dimes");
		System.out.println("    "+ numberOfNickels +" nickels");
		System.out.println("    "+ numberOfPennies +" pennies");
	}
}
