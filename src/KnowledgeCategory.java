public class KnowledgeCategory {
    public static void knowledgeMethodQ1() {
        System.out.println("Welcome to the General Knowledge Category!");
        System.out.println("Your First Question worth 1 point: What was the first city to reach a population of one million?? (ANSWER IN CAPITALS ONLY!)");
        System.out.println("------------------------- -------------------------");
        System.out.println("| A. London             | | B. Rome               |");
        System.out.println("------------------------- -------------------------");
        System.out.println("------------------------- -------------------------");
        System.out.println("| C. New York           | | D. Beijing            |");
        System.out.println("------------------------- -------------------------");
    }

    public static void knowledgeMethodQ2() {
        System.out.println("Your Second Question worth 2 points: What is the little dot above a lowercase \"i\" or \"j\" called? (ANSWER IN CAPITALS ONLY!)");
        System.out.println("------------------------- -------------------------");
        System.out.println("| A. Tittle             | | B. Jot                |");
        System.out.println("------------------------- -------------------------");
        System.out.println("------------------------- -------------------------");
        System.out.println("| C. Dripple            | | D. Whit               |");
        System.out.println("------------------------- -------------------------");
    }

    public static void knowledgeMethodQ3() {
        System.out.println("Your Third Question worth 3 points: What country won the first World Cup?(ANSWER IN CAPITALS ONLY!)");
        System.out.println("------------------------- -------------------------");
        System.out.println("| A. Switzerland        | | B. Brazil             |");
        System.out.println("------------------------- -------------------------");
        System.out.println("------------------------- -------------------------");
        System.out.println("| C. Uruguay            | | D. Argentina          |");
        System.out.println("------------------------- -------------------------");
    }

    public static void knowledgeMethodQ4() {
        System.out.println("Your Fourth Question worth 4 points: What is the tallest mountain in North America? (ANSWER IN CAPITALS ONLY!) ");
        System.out.println("------------------------- -------------------------");
        System.out.println("| A. Mount Steele       | | B. Mount Rushmore     |");
        System.out.println("------------------------- -------------------------");
        System.out.println("------------------------- -------------------------");
        System.out.println("| C. King Peak          | | D. Denali             |");
        System.out.println("------------------------- -------------------------");
    }

    public static void knowledgeMethodQ5() {
        System.out.println("Your Fifth and Final Question worth 5 points: What is the oldest city in the world? (ANSWER IN CAPITALS ONLY!)");
        System.out.println("------------------------- -------------------------");
        System.out.println("| A. Damascus           | | B. Athens             |");
        System.out.println("------------------------- -------------------------");
        System.out.println("------------------------- -------------------------");
        System.out.println("| C. Jerusalem          | | D. Jericho            |");
        System.out.println("------------------------- -------------------------");
    }

    public static int activateKnowledge() {
        //Store answers
        QuestionClass q11 = new QuestionClass();
        q11.answer=66;
        QuestionClass q12 = new QuestionClass();
        q12.answer=65;
        QuestionClass q13 = new QuestionClass();
        q13.answer=67;
        QuestionClass q14 = new QuestionClass();
        q14.answer=68;
        QuestionClass q15 = new QuestionClass();
        q15.answer=65;

        //Activate questions and corresponding display
        int points = 0;
        KnowledgeCategory.knowledgeMethodQ1();
        points = q11.activateQuestion(points);
        KnowledgeCategory.knowledgeMethodQ2();
        points = q12.activateQuestion(points);
        KnowledgeCategory.knowledgeMethodQ3();
        points = q13.activateQuestion(points);
        KnowledgeCategory.knowledgeMethodQ4();
        points = q14.activateQuestion(points);
        KnowledgeCategory.knowledgeMethodQ5();
        points = q15.activateQuestion(points);
        return points;
    }

}
