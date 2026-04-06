package Sugasri_HOPE_Batch_1.DAY_12.Task.com.Survey_System.model;

import java.util.Scanner;
public class RatingQuestion extends Question {
    public RatingQuestion(String questionText){
        super(questionText);
    }
    public String getAnswer(Scanner sc){
        while(true){
            System.out.print(getQuestionText()+" (Rate 1 to 5): ");
            String input=sc.nextLine();
            try {
                int rating=Integer.parseInt(input);
                if(rating>=1&&rating<=5){
                    return String.valueOf(rating);
                }else{
                    System.out.println("Invalid! Enter a number between 1 and 5.");
                }
            }catch (NumberFormatException e){
                System.out.println("Invalid input! Enter a valid number.");
            }
        }
    }
}
