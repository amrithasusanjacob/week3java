package week3;

import java.util.Scanner;

public class SoftwareSales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner obj = new Scanner(System.in);
       System.out.println("Enter the number of softwares you require.");
       int num = obj.nextInt();
       int subtot;
       double finalamount,dis;
       if(num<10)
       {
    	  dis=0.0;
       }
       else if((num>=10)&&(num<20))
       {
    	  dis=0.2;
       }
       else if((num>20)&&(num<50))
       {
    	  dis=0.3;
       }
       else if((num>=50)&&(num<100))
       {
    	  dis=0.4;
       }
       else
       {
    	   dis=0.5;
       }
       subtot=num*99;
       finalamount=subtot-(subtot*dis);
       System.out.println("Subtotal : $"+subtot);
       System.out.println("Discount : "+(dis*100));
       System.out.println("Final Amount : $"+finalamount);
	}

}
