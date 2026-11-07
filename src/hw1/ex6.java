package hw1;

public class ex6 {
//請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//	5 + 5
//	5 + ‘5’
//	5 + “5”
//	並請用註解各別說明答案的產生原因 
	
	public static void main(String[] args) {
		
		System.out.println( 5 + 5 );
		//5為int整數 所以5+5=10
		
		
		System.out.println((int)'5');
		//使用(int),強制將char轉換成int,可得知'5'=53
		System.out.println( 5 + '5'); 
		//'5'為char 字元數字,從上面公式可知Unicode字元裡對應字為53
		//前面的5為int整數,所以5+'5'=58
		
		
		System.out.println( 5 + "5");
		//"5"為String 字串，前面的5為int整數
		//字串遇+直接串聯再一起,所以5+"5"=55
		
		
	}
	
}
