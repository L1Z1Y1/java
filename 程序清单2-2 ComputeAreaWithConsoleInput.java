import java.util.Scanner;
//Scanner类在包java.util里，导入Scanner类
public class ComputerAreaWithConsoleInput {
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		//创建一个Scanner对象
		System.out.print("Enter a number for radius:");
		double radius =input.nextDouble();
		//从键盘读取输入，赋值给radius
		double area=radius*radius*3.14159;
		System.out.println("The area for the circle of radius "+radius+" is "+area);
		//显示完字符串后，println会将光标移到下一行，而print不会
	}
}
