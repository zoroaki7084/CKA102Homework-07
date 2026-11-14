package hw3;

import java.util.Scanner;

public class ex3 {
//	阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討厭哪個數字,
	//請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇的號碼與總數
	public static void main (String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入數字1~9");
		int a = sc.nextInt();
		
		int i = 1, j = 0;
		
		for (i = 1 ; i <= 49 ; i++ ) {
			
			if (i % 10 == 4 || i / 10 == 4||i % 10 == a||i  == a )
			continue;
			
			System.out.println(i + "\t" );
			j++;	
		}
		
		System.out.println("可以選擇的號碼總數：" + j + "個號碼可以選" );
		sc.close();
		}
}
		