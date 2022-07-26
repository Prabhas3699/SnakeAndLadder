
public class PositionMoves {

	public static void main(String[] args) {
		
		 //Initialising a variable to hold the value of position of player on the board
		int position =0;
		String optionValue="";
		
		//using while to print the values upto 100
		while(position<100) {
		// Using random method to generate a random number between 1 and 6	
		int option=(int)(Math.random()*3)+1;
		
		switch(option) {
		case 1:
			optionValue="No Play";
			break;
		case 2:
			optionValue="Ladder";
			break;
		case 3:
			optionValue="Snake";
			break;
		}
		
		int roll=(int)(Math.random()*6)+1;
		System.out.println("The Starting Position of the Player is "+position);
		System.out.println("The Value of the die roll "+roll);
		
		if(optionValue=="No Play") {
			System.out.println("No Play.Skip this turn");
		}else if(optionValue=="Ladder") {
			System.out.println("Ladder option play.Move forward");
			position=position+roll;
			System.out.println("The player's position is "+position);
		}else {
			System.out.println("Snake option play.Move backward");
			position=position-roll;
			if(position<0) {
				position=0;
				}System.out.println("The position of the player is "+position);
			}
		
		}

	}

}
