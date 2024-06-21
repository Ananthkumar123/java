class Month
{ 
  public static void main(String args[])
  { 
   int year = 2021;
   String mon = "Feb";
   

   if(mon=="Janvry" || mon=="march" ||mon=="May" ||mon=="July" ||mon=="Aug" ||mon=="October" ||mon=="December" )
    {
  	System.out.println("no .of days in this month is 31");
     }
    
	
   else if(mon=="April"|| mon=="June"||mon=="September"||mon=="November"){
	System.out.println("no .of days in this month is 30");
         }

   else if(mon=="Feb")
 {

      if(year%4==0 && year%100!=0 ||year%400==0)
         {
  	  System.out.println("it is leap year");
          }
  else{
   
    System.out.println("no .of days in this month is 28");
   }
   
   }
else{
System.out.println("NOT");
}



 

}
}