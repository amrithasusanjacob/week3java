package week3;
import java.util.Scanner;
public class SalaryCalc {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner obj = new Scanner(System.in);
	       System.out.println("Enter the number of days you work.");
	       int num = obj.nextInt();
	       int sum=0;
	       int sal=1;
	       for(int i=1;i<=num;i++)
	       {
	    	   System.out.println("Day "+i+" = $"+(sal));
	    	   sum=sum+(sal);
	    	   sal=sal*2;
	       }
	       System.out.println("Total = $"+sum);
	}

}
