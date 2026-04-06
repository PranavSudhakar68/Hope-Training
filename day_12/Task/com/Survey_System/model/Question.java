package Sugasri_HOPE_Batch_1.DAY_12.Task.com.Survey_System.model;

import java.util.Scanner;
public abstract class Question {
    private String questionText;
    public Question(String questionText){
        this.questionText=questionText;
    }
    public String getQuestionText(){
        return questionText;
    }
    public abstract String getAnswer(Scanner sc);
}
