class Hello
{ 
	public static void main(String args[])
  	{
	  char c ='c';
	  if(c>=65 && c<=90)
          {
	  System.out.println("it is capital");

		if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
		  System.out.println("it is vowel");
		else
		System.out.println("it is consonents");
	  }
         else
	     if(c>=97 && c<=122)
		{
		System.out.println("it is small");	
		if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
		  System.out.println("it is vowel");
		
		else
		System.out.println("it is consonents"); 
		}
	}


}