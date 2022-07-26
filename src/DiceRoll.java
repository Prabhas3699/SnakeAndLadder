
public class DiceRoll {

	public static void main(String[] args) {
		
		// used random function to generate different values
		int diceNumber =(int) (Math.random()*6) + 1;
		
		//for (int dice = 1; dice<=6 ; dice++) 
		{
			System.out.println("Player Rolls =" +diceNumber);
		}

	}

}
