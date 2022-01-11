package ch06;

public class P114 {

	public static void main(String[] args) {
	
		int[] P114 = new int[6];
		
		int idx = 0;
		while (true) {
			int number = (int)(Math.random()*45)+1 ;
			
			boolean insert = true ;
			for (int i=0; i<=idx; i++) {
				if (P114[i] == number) {
					insert = false ;
					break;
				}
			}
				if(insert == true) {
					P114[idx] = number;
					idx++;
				}
				
				if (idx == 6 ) break ;
			}
			for (int i=0; i<P114.length; i++) {
					System.out.println(P114[i]);
			}
			
		}
}