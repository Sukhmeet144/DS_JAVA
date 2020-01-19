import java.util.*;
class ReverseString
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		s.nextLine();
		for(int i=0;i<a;i++)
		{
			int count=0;
		    int k=0;
			String b=s.nextLine();
			char e[]=b.toCharArray();
			for(int j=0;j<e.length;j++)
			{
				if(e[j]=='.')
				{
					count++;
				}
			}
			//System.out.println(count);
			String f[]=new String[count+1];
			String d=b.replace('.','@');
			String arr[]=d.split("@");
               for(String c : arr)
               {
               	if(k<count+1)
               	{
               	  f[k]=c;
               	  //System.out.println(f[k]);
               	  k++; 
               	}
               }
               int flag=0;
               for(int l=f.length-1;l>=0;l--)
               {
               System.out.print(f[l]);
               if(flag<count)
               {
               	System.out.print(".");
               	flag++;
               }
			}
			System.out.println();
		}
	}
}