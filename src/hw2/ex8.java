package hw2;

public class ex8 {
//	請設計一隻Java程式,輸出結果為以下:  (用迴圈)
//	A             
//	BB
//	CCC
//	DDDD
//	EEEEE
//	FFFFFF
	
	public static void main (String [] args) {
		int i = 1 ;
		  while( i <= 6) {
			  int j = 1;
			    while (j <= i ) {
			    	System.out.print((char)('A' + i - 1));
	    		    j++;
			    }
			    System.out.println();
	    	    i++;
		  }
		    
	}
	
	
}
