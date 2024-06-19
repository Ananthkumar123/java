//leap years using loop 1900 to 2000


class Ch20
{
	public static void main(String args[])
	{
	    int year =1900,end=2000;
	     while(year<=end) //1900,
	     { 
	       if(year%4==0 && year%100 !=0 || year%400==0)
		{
	       System.out.println("leap years are"+ year);
		}
		year++;
	     }
         }

}