package Assignment1;

//ASSIGNMENT 1 QUESTION 5
import java.util.Scanner;

public class nextDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] monthdays= {-1,31,28,31,30,31,30,31,31,30,31,30,31};
		
		//User Input
		System.out.println("Enter Date in below format:"+"\n"+ "Enter Day:");
		int day=sc.nextInt();
		System.out.println("Enter month:");
		int month=sc.nextInt();
		System.out.println("Enter Year:");
		int year=sc.nextInt();
		System.out.println("Current Date is:"+day+"-"+month+"-"+year);
		
		//Leap Year Check
		boolean flag=checkleap(year);
		if(flag==true) {
			monthdays[2]=29;
		}
		// Next Date Logic
		
		day=day+1;
		if(day>monthdays[month]) {
			day=1;
			month++;
		}
		if(month>12) {
			month=1;
			year++;
		}
		System.out.println("Next Date is:"+day+"-"+month+"-"+year);
	}

	private static boolean checkleap(int year) {
		// TODO Auto-generated method stub
		   if(((year%4==0) && ((year%400==0) || (year%100!=0)))){
			   return true;
		   }
		return false;
	}

}
