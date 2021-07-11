package launchcode.inheritance;

import java.util.LinkedList;

public class CheckBoxQuestion extends Question{

    public CheckBoxQuestion(String question, LinkedList<String> choises, LinkedList<Integer> correctAnswer) {
        super(question,choises);
        this.correctAnswer = correctAnswer;
    }

    private LinkedList<Integer> answer;
    private LinkedList<Integer> correctAnswer;

    public LinkedList<Integer> getAnswer() {
        return answer;
    }

    public void setAnswer(LinkedList<Integer> answer) {
        this.answer = answer;
    }

    @Override
    public int isAnswerCorrect() {
        if (answer.equals(correctAnswer))
            return 1;
        else return 0;
    }
}
