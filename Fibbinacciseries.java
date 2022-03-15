package week3.day1;

public class Fibbinacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range=5;
		int sum;
		int firstnum=0;
		int secondnum=1;
		System.out.print(firstnum);
		System.out.print(secondnum);
		for(int i=0;i<range; i++)
			{
			sum=firstnum+secondnum;
			firstnum=secondnum;
			secondnum=sum;
			System.out.print(sum);
			
			}
			}

}
