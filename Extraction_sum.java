//write a code for extraction if the digits are even do sum and odd do product ;

import java.util.Scanner;
class Ext
{
  public static void main(String args[])
   {
	 Scanner ak=new Scanner(System.in);
	   System.out.println("enter a num");
	 int num = ak.nextInt(),sum=0,pro=1;
	for(;num>0;num/=10)
	{
	 int rem =num%10;	 
	    if(rem%2==0)
		 sum +=rem;
	   else
		pro *=rem;
	  
	}
     	 System.out.println(sum );
	 System.out.println(pro);
    }	
}