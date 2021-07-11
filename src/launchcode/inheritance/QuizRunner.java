package launchcode.inheritance;

import java.util.Arrays;
import java.util.LinkedList;

public class QuizRunner {
    public static void main(String[] args) {
        Quiz geographyQuiz = new Quiz();
        LinkedList<String> qChoises = new LinkedList<>();
        qChoises.add("Antarctica");
        qChoises.add("Africa");
        qChoises.add("Asia");
        qChoises.add("Europe");
        geographyQuiz.addQuestion(new MultipleChoiseQuestion("What is Earth's largest continent?",qChoises,2));
        geographyQuiz.addQuestion(new TrueFalseQuestion("Tigris river runs through Baghdad. True/False?",null,true));
        qChoises.clear();
        qChoises.add("Egypt");
        qChoises.add("Algeria");
        qChoises.add("Sudan");
        qChoises.add("Libya");

        geographyQuiz.addQuestion(new CheckBoxQuestion("Which African nation has pyramids?",qChoises,null));

    }
}
