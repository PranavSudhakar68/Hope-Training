package Sugasri_HOPE_Batch_1.DAY_12.Task.com.Survey_System.service;

import java.util.*;
import Sugasri_HOPE_Batch_1.DAY_12.Task.com.Survey_System.model.*;
public class SurveyService{
    private Survey survey;
    private ArrayList<Response> responses;
    public SurveyService(){
        responses=new ArrayList<>();
    }
    public void createSurvey(String title){
        survey=new Survey(title);
        responses.clear();
        System.out.println("Survey created successfully!");
    }
    public void addTextQuestion(String questionText) {
        if(survey==null){
            System.out.println("Please create a survey first!");
            return;
        }
        survey.addQuestion(new TextQuestion(questionText));
        System.out.println("Text question added successfully!");
    }
    public void addRatingQuestion(String questionText) {
        if (survey==null) {
            System.out.println("Please create a survey first!");
            return;
        }
        survey.addQuestion(new RatingQuestion(questionText));
        System.out.println("Rating question added successfully!");
    }
    public void takeSurvey(Scanner sc) {
        if (survey==null) {
            System.out.println("No survey available!");
            return;
        }
        if (survey.getQuestions().isEmpty()) {
            System.out.println("No questions added to the survey!");
            return;
        }
        System.out.print("Enter your name: ");
        String userName = sc.nextLine();
        Response response = new Response(userName);
        System.out.println("\nAnswer the following questions:");
        for (Question q : survey.getQuestions()) {
            String answer = q.getAnswer(sc);   // Polymorphism
            response.addAnswer(answer);
        }
        responses.add(response);
        System.out.println("Survey submitted successfully!");
    }
    public void showRatingAverage(){
        if(survey==null) {
            System.out.println("No survey created yet!");
            return;
        }
        if (responses.isEmpty()){
            System.out.println("No responses available for analysis!");
            return;
        }
        for(int i=0;i<survey.getQuestions().size();i++){
            if (survey.getQuestions().get(i) instanceof RatingQuestion) {
                int sum=0;
                int count=0;
                for(Response response:responses){
                    try {
                        int rating=Integer.parseInt(response.getAnswers().get(i));  
                        sum+=rating;
                        count++;
                    }catch (NumberFormatException e){
                        System.out.println("Invalid rating found in responses");
                    }
                }
                if(count>0){
                    double average=(double)sum/count;
                    System.out.println("Average rating for Question " + (i + 1) + ": " + average);
                }
            }
        }
    }
    public Survey getSurvey(){
        return survey;
    }

    public ArrayList<Response> getResponses(){
        return responses;
    }
}