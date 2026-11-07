package hw2;

public class ex5 {
//	請設計一隻Java程式,輸出結果為以下:
//	1 4 9 16 25 36 49 64 81 100
    public static void main(String[] args ) {
    	  
    	  int i = 1 , j = 1;
    	  
    	  for (i = 1; j <= 10; i++ ) {
    		  i = j ;    		
    		  System.out.println(  i + "*" + j + "=" + i * j + "\t");
    		  j++ ;
    		  
    	       }  
    	  }
 }

