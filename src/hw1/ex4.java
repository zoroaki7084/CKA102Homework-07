package hw1;

public class ex4 {
    //請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
	//面積公式:(r*r)*3.1415,圓周長(r*2)*3.1415
	
	public static void main(String[] args) {
		
		final double Pi = 3.1415 , r = 5.0 ; 
		
		System.out.println("圓面積" + (r * r) * Pi);
		System.out.println("圓周長" + (r * 2) * Pi);		
				
	}
	
}
