public class ShowLogicErrors {
public static void main(String[] args){
	System.out.println("Celsius 35 is Fahrenheit degree");
	System.out.println((9/5)*35+32);
}
}
/*结果错误，正确答案应是95.0。
Java中，整数相除使返回除法的整数部分，小数部分会被截掉，因此9/5=1。
要想得到目标结果，应该改为9.0/5，才会得到1.8。*/
