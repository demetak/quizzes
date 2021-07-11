package launchcode.inheritance;

import java.util.LinkedList;

public abstract class Question {
    private String questionDescription;
    private LinkedList<String> choises;

    public Question(String questionDescription, LinkedList<String> choises) {
        this.questionDescription = questionDescription;
        this.choises = choises;
    }

    public String getQuestionDescription() {
        return questionDescription;
    }

    public void setQuestionDescription(String questionDescription) {
        this.questionDescription = questionDescription;
    }

    public LinkedList<String> getChoises() {
        return choises;
    }

    public void setChoises(LinkedList<String> choises) {
        this.choises = choises;
    }

    @Override
    public String toString() {
        return "Question:'" + questionDescription ;
    }
    public String possibleAnswers (){
        return "possible answers"+ choises;
    }
    public abstract int isAnswerCorrect();

}
