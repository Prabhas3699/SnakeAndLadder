
public class WinningPosition {

	public static void main(String[] args) {
		
		 //Initialising a variable to hold the value of position of player on the board
		int position =0;
		String optionValue="";
		
		//using while to print the values upto 100
		while(position<100) {
		// Using random method to generate a random number between 1 and 6	
		int option=(int)(Math.random()*3)+1;
		 switch (option) {
         case 1:
             optionValue = "No Play";
             break;
         case 2:
             optionValue = "Ladder";
             break;
         case 3:
             optionValue = "Snake";
             break;
         default:
             break;
     }
		// Using random method to generate a random number between 1 and 6
		 int roll=(int)(Math.random()*6)+1;
		 System.out.println("The value of the die roll is " + roll);

         if (optionValue == "No Play") {
             System.out.println("No Play Option rolled. Skip this turn");
         } else if (optionValue == "Ladder") {
             System.out.println("Ladder Option rolled. Move Forward");
             position = position + roll;
             if (position >100){
                 System.out.println("Sorry Can't go forward");
                 position = position - roll;
             }
         } else {
             System.out.println("Snake Option rolled. Move Backwards");
             position = position - roll;
             if (position < 0){
                 position = 0;
             }
         }
         System.out.println("The Position of the Player is " + position);

		}

	}

}
