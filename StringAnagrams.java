import java.util.*;
class StringAnagrams
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		String b=s.nextLine();
		int count=0;
		a=a.toLowerCase();
		b=b.toLowerCase();
		char ar[]=a.toCharArray();
		char arr[]=b.toCharArray();
		Arrays.sort(ar);
		Arrays.sort(arr);
		for(int i=0;i<ar.length;i++)
		{
		 if(ar[i]!=arr[i])
		{
          System.out.println("Not A Anagram");
          count++;
          break;
        }
	}
	if(count==0)
	{
	System.out.println("Anagram");
    }
}
}