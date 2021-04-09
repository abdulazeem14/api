package testNG;
import java.lang.reflect.Array;
import java.util.*;

public class Hackerank {
	public static void main(String args[])
	{
		Scanner scn=new Scanner(System.in);
		int count=0;
		int[] arr= {4,9,5,3,2,10};
		int res[]=new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
		if(i==0)
		{
			res[0]=0;
		}
		else {
		
		for(int j=0;j<arr.length;j++)
		{ 
			if(arr[i]<arr[j])
			{
				res[i]=count++;
				
			}
			
		}
		}
		count=0;
		
		}
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+",");		}
		
		
	}

}
