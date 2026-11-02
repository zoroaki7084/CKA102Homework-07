package hw1;

public class ex3 {
	//第三題 題目:請由程式算出256559秒為多少天、多少小時、多少分與多少秒?
		//一天24小時，一小時60分鐘,一分鐘60秒
		//一天24小時，24小時有1440分鐘，1440分鐘有86400秒
		//一分鐘有60秒,一小時有3600秒,一天有86400秒
			
		public static void main(String[] args) {
				
			int num1 = 256559;
				
			int days = ((num1 / 86400) % 86400);
			int hr = ((num1 % 86400) / 3600);
			int min = ((num1 % 3600) / 60);
			int sec = (num1 % 60);
				
			System.out.println(days + "天" + hr + "時" + min + "分" + sec + "秒");
		} 
}
				
	  //推導公式
				
//				int num1 = 256559;
//				int num2 = 24;  //天
//				int num3 = 60;  //分(秒)
//				int num4 = 1440, num5 = 86400, num6 = 83759;
//				int num7 = 3600, num8 = 959;
//				
//				System.out.println(num2 * num3);  //一天24hr*60分=1440分鐘
//				System.out.println(num4 * num3);  //1440分鐘*60秒=86400秒
//				System.out.println(num1 / num5);  //256559/86400(秒)=2天
//				System.out.println(num1 % num5);  //剩下83759秒
//				System.out.println(num3 * num3);  //60秒*60分=3600秒
//				System.out.println(num6 / num7);  //83759/3600(秒)=23小時
//				System.out.println(num6 % num7);  //剩下959秒
//				System.out.println(num8 / num3);  //959/60(秒)15分鐘
//				System.out.println(num8 % num3);  //剩下59秒
				
				//答:2天23小時15分59秒		
	//簡化公式			
//				System.out.println((num1 / 86400) % 86400);
//				System.out.println((num1 % 86400) / 3600);
//				System.out.println((num1 % 3600) / 60);
//				System.out.println(num1 % 60);
				

