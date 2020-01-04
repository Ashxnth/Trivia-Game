public class ScienceCategory {
    public static void scienceMethodQ1() {
        System.out.println("Welcome to the Science Category!");
        System.out.println("Your First Question worth 1 point: Who invented the first battery? (ANSWER IN CAPITALS ONLY!)");
        System.out.println("------------------------- -------------------------");
        System.out.println("| A. Luigi Galvani      | | B. Nikola Tesla       |");
        System.out.println("------------------------- -------------------------");
        System.out.println("------------------------- -------------------------");
        System.out.println("| C. Alessandro Volta   | | D. Benjamin Franklin  |");
        System.out.println("------------------------- -------------------------");
    }

    public static void scienceMethodQ2() {
        System.out.println("Your Second Question worth 2 points: Where are your taste buds located? (ANSWER IN CAPITALS ONLY!)");
        System.out.println("------------------------- -------------------------");
        System.out.println("| A. Cheek              | | B. Tongue             |");
        System.out.println("------------------------- -------------------------");
        System.out.println("------------------------- -------------------------");
        System.out.println("| C. Esophagus          | | D. All of the Above   |");
        System.out.println("------------------------- -------------------------");
    }

    public static void scienceMethodQ3() {
        System.out.println("Your Third Question worth 3 points: What is the name of the lowest layer of Earth's atmosphere?(ANSWER IN CAPITALS ONLY!)");
        System.out.println("------------------------- -------------------------");
        System.out.println("| A. Stratosphere       | | B. Mesosphere         |");
        System.out.println("------------------------- -------------------------");
        System.out.println("------------------------- -------------------------");
        System.out.println("| C. Exosphere          | | D. Troposphere        |");
        System.out.println("------------------------- -------------------------");
    }

    public static void scienceMethodQ4() {
        System.out.println("Your Fourth Question worth 4 points: Which of the following is the hottest? (ANSWER IN CAPITALS ONLY!) ");
        System.out.println("------------------------- -------------------------");
        System.out.println("| A.Surface of the Sun  | | B. Lightning          |");
        System.out.println("------------------------- -------------------------");
        System.out.println("------------------------- -------------------------");
        System.out.println("| C.Earth's Core        | | D. Magma              |");
        System.out.println("------------------------- -------------------------");
    }

    public static void scienceMethodQ5() {
        System.out.println("Your Fifth and Final Question worth 5 points: What is the name of the closest large spiral galaxy to our own Milky Way? (ANSWER IN CAPITALS ONLY!)");
        System.out.println("------------------------- -------------------------");
        System.out.println("| A. Andromeda          | | B. Messier 83         |");
        System.out.println("------------------------- -------------------------");
        System.out.println("------------------------- -------------------------");
        System.out.println("| C. Centaurus          | | D. Cosmos Redshift 7  |");
        System.out.println("------------------------- -------------------------");
    }

    public static int activateScience() {
        //Store answers
        QuestionClass q1 = new QuestionClass();
        q1.answer=67;
        QuestionClass q2 = new QuestionClass();
        q2.answer=68;
        QuestionClass q3 = new QuestionClass();
        q3.answer=68;
        QuestionClass q4 = new QuestionClass();
        q4.answer=66;
        QuestionClass q5 = new QuestionClass();
        q5.answer=65;

        //Activate questions and corresponding display
        int points = 0;
        ScienceCategory.scienceMethodQ1();
        points = q1.activateQuestion(points);
        ScienceCategory.scienceMethodQ2();
        points = q2.activateQuestion(points);
        ScienceCategory.scienceMethodQ3();
        points = q3.activateQuestion(points);
        ScienceCategory.scienceMethodQ4();
        points = q4.activateQuestion(points);
        ScienceCategory.scienceMethodQ5();
        points = q5.activateQuestion(points);
        return points;
    }

}
