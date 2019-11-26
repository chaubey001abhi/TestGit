package io.abhi.threading;

public class IntReverse {

	public static void main(String[] args) {
		
		int num = 123456;		
		int p = 0;
		
		while(num > 0){
			int i = num %10;
			p = p*10 + i%10; 			
			num = num/10;
			
					
		}
		
	}

}
