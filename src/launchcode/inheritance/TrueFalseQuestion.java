package launchcode.inheritance;

import launchcode.inheritance.Question;

import java.util.LinkedList;

public class TrueFalseQuestion extends Question {
    private boolean answer;
    private boolean correctAnswer;

    public TrueFalseQuestion(String questionDescription, LinkedList<String> choises, boolean correctAnswer) {
        super(questionDescription, choises);
        this.correctAnswer = correctAnswer;
    }

    public boolean isAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }

    @Override
    public int isAnswerCorrect() {
        if (answer==correctAnswer)
        return 1;
        else return 0;
    }
}
