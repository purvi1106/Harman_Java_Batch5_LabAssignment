package Assignment_3;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of lines:");
		int num=sc.nextInt();
		for(int i=0;i<num;i++) {
			for(int j=num;j>i;j--) {
					System.out.print(" ");
			}
			for(int k=1;k<=(i*2)-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
