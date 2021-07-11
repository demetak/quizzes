package launchcode.inheritance;

import java.util.LinkedList;

public class MultipleChoiseQuestion extends Question{
   private Integer answer;
   private Integer correctAnswer;

    public MultipleChoiseQuestion(String questionDescription, LinkedList<String> choises, Integer correctAnswer) {
        super(questionDescription, choises);
        this.correctAnswer = correctAnswer;
    }

    public Integer getAnswer() {
        return answer;
    }

    public void setAnswer(Integer answer) {
        this.answer = answer;
    }

    public boolean isAnswerCorrect(Integer aAnswer){
        return answer.equals(aAnswer);
    }

    @Override
    public int isAnswerCorrect() {
        if (answer.equals(correctAnswer))
            return 1;
        else return 0;
    }
}
