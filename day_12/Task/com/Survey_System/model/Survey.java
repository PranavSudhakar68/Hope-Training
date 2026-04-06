package Sugasri_HOPE_Batch_1.DAY_12.Task.com.Survey_System.model;

import java.util.*;
public class Survey{
    private String title;
    private ArrayList<Question> questions;
    public Survey(String title){
        this.title=title;
        this.questions=new ArrayList<>();
    }
    public String getTitle(){
        return title;
    }
    public ArrayList<Question> getQuestions(){
        return questions;
    }
    public void addQuestion(Question question){
        questions.add(question);
    }
}
