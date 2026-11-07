package hw2;

public class ex4 {
//	請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
	public static void main (String[] args) {
		
		int i = 1, j = 1;
		
		while(j <= 10) {
			i = j * i;
			j++;
		}
		
		System.out.println("1~10的連乘積為：" + i );
	}

}
