package launchcode.inheritance;

import java.util.LinkedList;

public class Quiz {
    public LinkedList<Question> questions = new LinkedList<>();
    public Integer gradeQuiz(){
        int correctAnswers = 0;
             for (Question question : questions) {
                 correctAnswers +=question.isAnswerCorrect();
             }
             return correctAnswers/questions.size()*100;
    }
    public void addQuestion(Question q){
        questions.add(q);
    }
}
