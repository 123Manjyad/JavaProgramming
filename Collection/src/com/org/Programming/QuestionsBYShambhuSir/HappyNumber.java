package com.org.Programming.QuestionsBYShambhuSir;



public class HappyNumber {
	public static boolean HappyNumber1(int x)
	{
		int sum,rem=0;
		while(x>9)
		{
			sum=0;
			while(x>0)
			{
				rem=x%10;
				sum=sum+rem*rem;
				x=x/10;
			}
			x=sum;
	
		}
		if(x==1 || x==7)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		

		for(int i=0;i<100;i++)
		{
			if(HappyNumber1(i))
			{
				System.out.println(i);
			}
		}
		
		
	}

}
