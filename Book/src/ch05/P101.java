package ch05;

import java.lang.annotation.Target;

public class p101 {
	
	public static void main(String[] args) {
		
		Target:for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				if ( j==3) {
					break;
				}
				System.out.println("i="+i+", j="+j);
			}
		}
	}
}
