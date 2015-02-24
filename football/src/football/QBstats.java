package football;

public class QBstats 
{	
	public static void main(String[] args)
	{
		double completions, attempts, yards, touchdowns, interceptions, a, b, c, d, passer_rating;
	
	
		System.out.print("Enter the amount of completions: ");
		completions = input.nextDouble();
		System.out.print("Enter the amount of attempts: ");
		attempts = input.nextDouble();
		System.out.print("Enter the amount of yards: ");
		yards = input.nextDouble();
		System.out.print("Enter the amount of touchdowns: ");
		touchdowns = input.nextDouble();
		System.out.print("Enter the amount of interceptions: ");
		interceptions = input.nextDouble();
		
		a = ((completions/attempts)-0.3)*5;
		b = ((yards/attempts)-3)*0.25;
		c = (touchdowns/attempts)*20;
		d = 2.375-((interceptions/attempts)*25);
		
		passer_rating = ((a+b+c+d)/6)*100;
	}
	return passer_rating				
}

