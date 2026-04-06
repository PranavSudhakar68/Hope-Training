package Sugasri_HOPE_Batch_1.DAY_12.Task.com.Survey_System.main;

import java.util.Scanner;
import Sugasri_HOPE_Batch_1.DAY_12.Task.com.Survey_System.model.*;
import Sugasri_HOPE_Batch_1.DAY_12.Task.com.Survey_System.service.*;
import Sugasri_HOPE_Batch_1.DAY_12.Task.com.Survey_System.utilities.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        SurveyService surveyService=new SurveyService();
        DisplayUtil displayUtil=new DisplayUtil();
        int choice;
        do {
            System.out.println("\n******** SURVEY SYSTEM ********");
            System.out.println("1. Create Survey");
            System.out.println("2. Add Text Question");
            System.out.println("3. Add Rating Question");
            System.out.println("4. Take Survey");
            System.out.println("5. View Survey");
            System.out.println("6. View Responses");
            System.out.println("7. Show Rating Average");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            while(!sc.hasNextInt()){
                System.out.println("Invalid input! Please enter a number.");
                sc.next();
                System.out.print("Enter your choice: ");
            }
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Enter Survey Title: ");
                    String title=sc.nextLine();
                    surveyService.createSurvey(title);
                    break;
                case 2:
                    System.out.print("Enter Text Question: ");
                    String textQ=sc.nextLine();
                    surveyService.addTextQuestion(textQ);
                    break;
                case 3:
                    System.out.print("Enter Rating Question: ");
                    String ratingQ=sc.nextLine();
                    surveyService.addRatingQuestion(ratingQ);
                    break;
                case 4:
                    surveyService.takeSurvey(sc);
                    break;
                case 5:
                    Survey survey=surveyService.getSurvey();
                    displayUtil.displaySurvey(survey);
                    break;
                case 6:
                    displayUtil.displayResponses(surveyService.getResponses());
                    break;
                case 7:
                    surveyService.showRatingAverage();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }while(choice!=8);
        sc.close();
    }
}
