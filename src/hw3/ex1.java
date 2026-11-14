package hw3;

import java.util.Scanner;

public class ex1 {
//	請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
//	三角形、其它三角形或不是三角形,如圖示結果:
	
	//正三角形 =  3a ; a == b && b == c
	//等腰三角形 = 2a + b   a == b || a == c || b == c 
	//其他三角形 + 不是三角形 =任意兩邊相加大於第三邊 
	// a + b > c && a + c > b && b + c > a
	//如果不是三角型  a + b <= c || a + c <= b || b + c <= a
	
	//先取得3個數字
	
	static public void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三個數字");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        
     //利用if...else帶入
        //先判斷是不是三角形
        
        if(a + b <= c || a + c <= b || b + c <= a) {
        
        	System.out.println("不是三角形");
        	
        }else if(a == b && b == c){
        
        System.out.println("正三角形");
        
        }else if(a == b || a == c || b == c) {
        	
        	System.out.println("等腰三角形");
        	
	    }else 
	    	
    	    System.out.println("其他三角形");
        	
        }
}
	
	
	
	
	
