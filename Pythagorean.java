import java.util.*;
class Pythagorean
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		for (int i=0;i<a;i++) 
		{
		  int count=0;	
		  int len=s.nextInt();
		  int arr[]=new int[len];
		  for (int j=0;j<len;j++ ) 
		  {
		    arr[j]=s.nextInt();		
		  }	
		  for(int j=0;j<len;j++)
		  {
		  	for(int k=j+1;k<len;k++)
		  	{
		  		int b=arr[j]^2+arr[k]^2;
		  		for(int l=k+1;l<len;l++)
		  		{
		  			int c=arr[l]^2;
		  			if(b==c)
		  			{
		  				System.out.println("Yes");
		  				count++;
		  				break;
		  			}
		  		}
		  		if(count==1)
		  		{
		  			break;
		  		}
		  	}
		  	if(count==1)
		  	{
		  		break;
		  	}
		  }
		  if(count!=1)
		  {
		  	System.out.println("No");
		  }
		}
	}
}