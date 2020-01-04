import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object
        boolean playAgain=false;
        int points=0;

        do {
            boolean validChoice=false; //Set boolean validChoice to false
            do{
                MathematicsCategory.startingInterface();
                int categoryChoice=input.nextInt(); //Category Choice Selection
                if (categoryChoice==1){ //Start Mathematics Category
                    points = MathematicsCategory.activateMathematics();
                    System.out.printf("Congratulations, You have scored %s points!%n", points);
                    validChoice=true; //Since User has entered a valid number, set boolean validChoice to true
                }
                else if (categoryChoice==2){ //Start Science Category
                    points = ScienceCategory.activateScience();
                    System.out.printf("Congratulations, You have scored %s points!%n", points);
                    validChoice=true; //Since User has entered a valid number, set boolean validChoice to true
                }
                else if (categoryChoice==3){ //Start General Knowledge Category
                    points = KnowledgeCategory.activateKnowledge();
                    System.out.printf("Congratulations, You have scored %s points!%n", points);
                    validChoice=true; //Since User has entered a valid number, set boolean validChoice to true
                }
                else if (categoryChoice==4){ //Exit the game
                    System.exit(0);
                }
                else {
                    System.out.println("Please enter a valid number from 1-4!"); //If user has not entered a valid number, loop until valid number has been inputted
                }
            } while (validChoice==false); //Loop until User enters valid number for category choice
            System.out.println("Would you like to play again? Press 1 for Yes, Any other number to exit the game!");
            int playOption=input.nextInt(); //Get play again option from User
            if (playOption==1){ //If user inputs 1, restart scores and replay the game
                playAgain=true; //Set boolean playAgain to true
                points=0; //Restart score
            }
            else{ //Exit game if User does not press 1
                System.exit(0);
            }
        } while (playAgain==true); //Loop as long as User wants to play again
        input.close(); //Close Input
    }
}
