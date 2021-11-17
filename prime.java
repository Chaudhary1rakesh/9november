package first_java_programe;
import java.util.Scanner;
public class prime{
public static void main(String[] args) {
	int temp=0;
	Scanner num=new Scanner(System.in);
		System.out.println("Enter any number:");
		
		int n=num.nextInt();
	
	for(int i=2;i<=n-1;i++)
	{
	    if(n%i==0)
	    {
	        temp=temp+1;
	    }
	   
	    
	}
	if(temp==0)
	{
	    System.out.println(n + "  is prime number");
	}
	else{
	     System.out.println(n + "  is not prime number");
	}
	}
}

