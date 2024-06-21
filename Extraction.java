//Extraction of a number 
import java.util.Scanner;
class Ext
{
  public static void main(String args[])
	{
	 Scanner ak=new Scanner(System.in);
	   System.out.println("enter a num");
	 int num = ak.nextInt();
  	
	 for(;num>0;num/=10)
	  {
	   int rem = num%10;
	     System.out.println(rem);
	  }
	}
}