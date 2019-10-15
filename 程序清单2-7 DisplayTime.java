public class ShowCurrentTime {
	public static void main(String[]args) {
		long totalMilliseconds=System.currentTimeMillis();
		//获得一个long类型的以毫秒为单位的当前时间值。
		long totalSeconds=totalMilliseconds/1000;
		long currentSecond=totalMilliseconds%60;
		//求出现在的秒
		long totalMinutes=totalSeconds/60;
		long currentMinute=totalMinutes%60;
		//求出现在的分
		long totalHours=totalMinutes/60;
		long currentHour=totalHours%24;
		//求出现在的小时
		System.out.println("Current time is "+currentHour+":"+currentMinute+":"+currentSecond+" GMT");
	}
}
