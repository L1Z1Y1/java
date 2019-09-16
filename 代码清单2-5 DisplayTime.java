package bcqd;
import java.util.Scanner;
public class DisplayTime {
	public static void m6ain(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.print("Enter an integer for seconds: ");
	int seconds=input.nextInt();
	//nextInt用以读取seconds的整数值
	int minutes=seconds/60;
	//获取分钟值
	int remainingSeconds=seconds%60;
	//获取秒值
	System.out.println(seconds+" seconds is "+minutes+" minutes and "+remainingSeconds+" seconds");
	}
}
