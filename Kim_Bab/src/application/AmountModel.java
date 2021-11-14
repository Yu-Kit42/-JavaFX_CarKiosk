package application;

public class AmountModel
{
	public int asum(int[] ctm)
	{
		int sumt=0;
		int m=0;
		
		for(int i = 0; i<7; i++)
		{
			if(i==0 || i==4)
			{
				m = 7000;
			}
			if(i==1 || i==5)
			{
				m = 6500;
			}
			if(i==2 || i==6)
			{
				m = 6000;
			}
			if(i==3 || i==7)
			{
				m = 5500;
			}
			sumt = sumt + ctm[i] * m;
		}
		return sumt;
	}
}
