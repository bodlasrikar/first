
public class Nesteddollarbox
{
public static void main(String[] args) 
	{
		for(int i=1;i<=8;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if(i==1||i==8||j==1||j==9)
				System.out.print( "$");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
