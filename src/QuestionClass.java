import java.util.Scanner;

public class QuestionClass {
    int answer;
    boolean validLetter = false;

    int points=0;
    Scanner input = new Scanner(System.in);

    public int checkAnswer(int userAnswer, int points) { //Checks whether the correct answer matches the user's answer
        if (this.answer==userAnswer){
            System.out.println("Correct");
            points+=1;
        }
        else {
            System.out.println("Incorrect");
        }
        return points;
    }

    public void checkValidChar(int userAnswer) { //Checks whether the user has entered a valid character, and until the user has entered a valid character
        //Scanner input = new Scanner(System.in);
        do {
            if (userAnswer == 65 || userAnswer == 66 || userAnswer == 67 || userAnswer == 68) {
                validLetter = true;

            } else {
                System.out.println("Please enter a valid letter! Make sure to input a capital letter!");
                validLetter = false;
                userAnswer = input.next().charAt(0);
            }
        } while (validLetter==false);
    }

    public int activateQuestion(int points) { //Combines all the above methods into one
        char answer = input.next().charAt(0);
        this.checkValidChar(answer);
        points = this.checkAnswer(answer, points);
        return points;
    }
}
