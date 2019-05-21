package week3;
import java.util.Scanner;
public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner obj = new Scanner(System.in);
	       System.out.println("Enter a number greater than 0");
	       int num = obj.nextInt();
	       int sum=0;
	       for(int i=1;i<=num;i++)
	       {
	    	   sum=sum+i;
	       }
	       System.out.println("sum ="+sum);
	       obj.close();
	}

}
