import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class PlanRecommendation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome! having trouble coming up with an activity for the weekend? i can help!");
        System.out.println("do you want to stay in the comfort of your home or get out? enter: stay in or go out");
        String place = input.nextLine();
        
        System.out.println("only trying to spend a certain amount? no problem! what's your budget in dollars? ");
        int budget = input.nextInt();
        
        PlanOptions planOptions = new PlanOptions();
        ArrayList<Plan> activityPlace = planOptions.getActivityPlace(place);
        ArrayList<Plan> activityBudget = planOptions.getActivityBudget(budget);
        ArrayList<Plan> recommendedPlans = planOptions.getRecommendation(activityPlace, activityBudget);
        
        if (recommendedPlans.isEmpty()) {
            System.out.println("Sorry, no recommendation found for your input.");
        } else {
            Random random = new Random();
            int randomIndex = random.nextInt(recommendedPlans.size());
            Plan recommendation = recommendedPlans.get(randomIndex);
            System.out.println("here's an activity recommendation:");
            System.out.println(recommendation.getActivity());
            System.out.println("the  approximate cost of this activity is $" + recommendation.getBudget());
            System.out.println("have fun!!");

        }
    }
}