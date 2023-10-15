package org.owner;

public class Pattern2 {
	public static void main(String[] args) {
		int n=3;
		for (int i = 0; i < n; i++) {
			for (int s = 0; s <=n; s++) {
				System.out.print("  ");
			}
			for(int j=i;j<n;j++) {
			
		System.out.print("*");	
		}
			System.out.println(" ");
	}
	}

}
