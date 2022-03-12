
package Assignment_1;
//ASSIGNMENT 1 QUESTION 1
public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1,b=1,c;
		double sum=2;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=2;i<20;i++) {
			c=a+b;
		    a=b;
		    b=c;
		    System.out.print(c+" ");
		    sum=sum+c;
		}
		System.out.println("\n"+" Average is ="+(sum/20));
	}

}
