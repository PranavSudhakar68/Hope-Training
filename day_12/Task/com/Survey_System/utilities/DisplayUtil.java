package Sugasri_HOPE_Batch_1.DAY_12.Task.com.Survey_System.utilities;

import java.util.*;
import Sugasri_HOPE_Batch_1.DAY_12.Task.com.Survey_System.model.*;
public class DisplayUtil {
    public void displaySurvey(Survey survey) {
        if (survey==null) {
            System.out.println("No survey created yet!");
            return;
        }
        System.out.println("\nSurvey Title: " + survey.getTitle());
        System.out.println("Questions:");
        int i=1;
        for(Question q:survey.getQuestions()){
            System.out.println(i + ". " + q.getQuestionText());
            i++;
        }
    }
    public void displayResponses(ArrayList<Response> responses) {
        if (responses.isEmpty()) {
            System.out.println("No responses submitted yet!");
            return;
        }
        System.out.println("\n===== RESPONSES =====");
        for (Response response : responses) {
            System.out.println("User: " + response.getUserName());
            int i = 1;
            for (String answer:response.getAnswers()){
                System.out.println("Answer " + i + ": " + answer);
                i++;
            }
            System.out.println();
        }
    }
}
