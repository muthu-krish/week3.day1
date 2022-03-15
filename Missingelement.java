package week3.day1;

import java.util.Arrays;

public class Missingelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,7,8,9};
		Arrays.sort(array);
		for (int i=0;i<=array.length;i++)
		{
			if(array[i] !=array[i+1])
			{
				System.out.print(array[i]);
				break;
				
			}
					
			
		}
		

	}

}
