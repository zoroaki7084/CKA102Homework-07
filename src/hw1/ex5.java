package hw1;

public class ex5 {
//某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
//	金加利息共有多少錢 (用複利計算,公式請自行google)
	
	//PV = 150 萬,i = 2 %,n = 10 year 求 FV?
	//FV=PV*(1+i)^-n
	
	public static void main(String[] args) {
		
	     double PV = 1_500_000 , i = 0.02 ; 
	     int n = 10;
	     
	     System.out.println(PV * Math.pow(1+i,n) + "元");
	
	     
	     
	}
}
