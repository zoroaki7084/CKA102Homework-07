package hw3;

import java.util.Scanner;

public class ex2 {
//	請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
//	對則顯示正確訊息,如圖示結果:
	
	//先設計亂數
	public static void main (String[] args) {
		int r = (int)(Math.random()*10 );
		int u = -1 ;
		
		while(u != r){
		
			Scanner sc = new Scanner(System.in);
			System.out.println("數字猜猜看, 輸入0~9 ");
			u = sc.nextInt();
			
			if (u == r) {
				System.out.println("猜對喔!");
			}else {
				System.out.println("猜錯囉,繼續猜");
			}
		}
			
	}

}
