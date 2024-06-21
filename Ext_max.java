  //extract maximu value and minimum values

import java.util.Scanner;
class Ext
{
  public static void main(String args[])
   {
	 Scanner ak=new Scanner(System.in);
	   System.out.println("enter a num");
	 int num = ak.nextInt(),max=0,min=9;
	for(;num>0;num/=10) //345/10=34,34/10=
        {
	 int rem =num%10; 
	   if(rem>max) 
	{
	    max=rem; 
	}
		if (rem<min)
	    	min=rem;
	}
	 System.out.println("maxiumum value in num"+max);
	 System.out.println("minimu value in num"+min);
	
  }
}