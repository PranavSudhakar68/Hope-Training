package Sugasri_HOPE_Batch_1.DAY_12.Task.com.Survey_System.model;

import java.util.Scanner;
public class TextQuestion extends Question {
    public TextQuestion(String questionText){
        super(questionText);
    }
    public String getAnswer(Scanner sc){
        System.out.print(getQuestionText() + ": ");
        return sc.nextLine();
    }
}