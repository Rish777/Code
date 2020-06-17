package Array;

import java.util.List;
import java.util.*;

public class LargestAndSecondLargest {

	 
	public static void main(String[] args)
	{
		int largestElement=0;
		int secondLargestElement=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter size of arrays");
		int n=scanner.nextInt();
		int [] array= new int[n];
		int [] array2= new int[n];
		System.out.println("Eneter array elements");
		for(int j=0;j<n;j++)
		{
			array[j]=scanner.nextInt();
		}
		
		//for largest element
		for(int i=0;i<=array.length-1;i++)
		{
				if(array[i]>largestElement)
				{
				
					largestElement=array[i];
				}
		}
		
		//storing remaining elements less than the largest elements in an empty array
		for(int k=0;k<=array.length-1;k++)
		{
			if(array[k]<largestElement)
			{
				array2[k]=array[k];
			}
		}
		
		//comparing new array elements to find out second larget element
		for(int l=0;l<=array.length-1;l++)
		{
			if(array2[l]>secondLargestElement)
			{
				secondLargestElement=array2[l];
			}
		}
		System.out.println("largest element = "+largestElement);
		System.out.println("second largest element = "+secondLargestElement);
	}

}
