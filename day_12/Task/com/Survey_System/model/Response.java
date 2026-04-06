package Sugasri_HOPE_Batch_1.DAY_12.Task.com.Survey_System.model;

import java.util.ArrayList;
public class Response{
    private String userName;
    private ArrayList<String> answers;
    public Response(String userName){
        this.userName=userName;
        this.answers=new ArrayList<>();
    }
    public String getUserName(){
        return userName;
    }
    public ArrayList<String> getAnswers(){
        return answers;
    }
    public void addAnswer(String answer){
        answers.add(answer);
    }
}