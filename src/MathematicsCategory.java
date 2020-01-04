public class MathematicsCategory { //Holds all 5 questions for the Mathematics Category to avoid clutter in the main program
    public static void startingInterface(){
        System.out.println("Welcome to the Magnificent Trivia Game!");
        System.out.println("Enter 1 to play the Mathematics Category!");
        System.out.println("Enter 2 to play the Science Category!");
        System.out.println("Enter 3 to play the General Knowledge Category!");
        System.out.println("Enter 4 to exit the game");
    }

    public static void mathematicsMethodQ1() {
        System.out.println("Welcome to the Mathematics Category!");
        System.out.println("Your First Question worth 1 point: If 6(a+2)=24, what is the value of a? (ANSWER IN CAPITALS ONLY!)");
        System.out.println("------------------------- -------------------------");
        System.out.println("| A. 0.5                | | B. 2                  |");
        System.out.println("------------------------- -------------------------");
        System.out.println("------------------------- -------------------------");
        System.out.println("| C. 4                  | | D. 3                  |");
        System.out.println("------------------------- -------------------------");
    }

    public static void mathematicsMethodQ2() {
        System.out.println("Your Second Question worth 2 points: What is the number 1 followed by 100 zeros called? (ANSWER IN CAPITALS ONLY!)");
        System.out.println("------------------------- -------------------------");
        System.out.println("| A. Googol             | | B. Duodecillion       |");
        System.out.println("------------------------- -------------------------");
        System.out.println("------------------------- -------------------------");
        System.out.println("| C. GoogolPlex         | | D. Infinity           |");
        System.out.println("------------------------- -------------------------");
    }

    public static void mathematicsMethodQ3() {
        System.out.println("Your Third Question worth 3 points: What is a polygon with 20 sides called?(ANSWER IN CAPITALS ONLY!)");
        System.out.println("------------------------- -------------------------");
        System.out.println("| A. Dodecagon          | | B. Megagon            |");
        System.out.println("------------------------- -------------------------");
        System.out.println("------------------------- -------------------------");
        System.out.println("| C. Nonagon            | | D. Icosagon           |");
        System.out.println("------------------------- -------------------------");
    }

    public static void mathematicsMethodQ4() {
        System.out.println("Your Fourth Question worth 4 points: One day, a person went to a horse racing area.");
        System.out.println("Instead of counting the number of humans and horses, he counted 74 heads and 196 legs.");
        System.out.println("How many humans and horses were there?(ANSWER IN CAPITALS ONLY!");
        System.out.println("------------------------- -------------------------");
        System.out.println("| A.37 humans,98 horses | | B.24 horses,50 humans |");
        System.out.println("------------------------- -------------------------");
        System.out.println("------------------------- -------------------------");
        System.out.println("| C.31 horses,74 humans | | D.24 humans,50 horses |");
        System.out.println("------------------------- -------------------------");
    }

    public static void mathematicsMethodQ5() {
        System.out.println("Your Fifth and Final Question worth 5 points: A man buys a horse for $60. He sells the horse for $70.");
        System.out.println("He then buys the horse back for $80. And he sells the horse again for $90.");
        System.out.println("In the end, how much money did the man make or lose?(ANSWER IN CAPITALS ONLY!)");
        System.out.println("------------------------- -------------------------");
        System.out.println("| A. $30                | | B. $10                |");
        System.out.println("------------------------- -------------------------");
        System.out.println("------------------------- -------------------------");
        System.out.println("| C. $20                | | D. -$20               |");
        System.out.println("------------------------- -------------------------");
    }

    public static int activateMathematics() {
        //Store answers
        QuestionClass q1 = new QuestionClass();
        q1.answer=66;
        QuestionClass q2 = new QuestionClass();
        q2.answer=65;
        QuestionClass q3 = new QuestionClass();
        q3.answer=68;
        QuestionClass q4 = new QuestionClass();
        q4.answer=66;
        QuestionClass q5 = new QuestionClass();
        q5.answer=67;

        //Activate questions and corresponding display
        int points = 0;
        MathematicsCategory.mathematicsMethodQ1();
        points = q1.activateQuestion(points);
        MathematicsCategory.mathematicsMethodQ2();
        points = q2.activateQuestion(points);
        MathematicsCategory.mathematicsMethodQ3();
        points = q3.activateQuestion(points);
        MathematicsCategory.mathematicsMethodQ4();
        points = q4.activateQuestion(points);
        MathematicsCategory.mathematicsMethodQ5();
        points = q5.activateQuestion(points);
        return points;
    }

}
