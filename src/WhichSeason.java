import java.util.Scanner;

public class WhichSeason 
{

	public static void main(String[] args) 
	{
		Scanner season = new Scanner(System.in);
		System.out.println("Please enter the number of your birth month: ");
		int month = season.nextInt();
		
		if (month < 1)
		{
			System.out.println("That is an invalid month.");
		}
		if (month > 12)
		{
			System.out.println("That is an invalid month.");
		}
		if (3<=month && month<=5)
		{
			System.out.println("You are born in spring.");
		}
		else
		{
			if (6<=month && month<=8)
			{
				System.out.println("You are born in summer.");
			}
			else
			{
				if (9<=month && month<=11)
				{
					System.out.println("You are born in autumn.");
				}
				else 
				{
					System.out.println("You are born in winter.");
				}
			}
		}
		
		
		}
		
	
	}


