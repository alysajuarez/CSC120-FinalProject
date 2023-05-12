import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class PlanRecommendation extends PlanOptions {
    
    /**
    * main method for PlanRecommendation
    *
    */ 
    public static void main(String[] args) {

        boolean planning = true;
        System.out.println("welcome! want to create a list of plans or having trouble coming up with an activity for the weekend? i can help!");

        while (planning){

            ArrayList<String> personalList = new ArrayList<String>();
            Scanner input = new Scanner(System.in);

            System.out.println("do you want to (1) enter your own plan or (2) get a recommendation? enter 1 or 2");
            int choice = input.nextInt();
            input.nextLine();

            if (choice == 2){

                System.out.println("do you want to stay in the comfort of your home or get out? enter: 'stay in' or 'go out'");
                String place = input.nextLine();
                

                System.out.println("do you want to have a more relaxed time or get more active? enter: 'relax' or 'active'");
                String type = input.nextLine();
                
                System.out.println("only trying to spend a certain amount? no problem! what's your budget in dollars? ");
                int budget = input.nextInt();
                input.nextLine();
                
                PlanOptions planOptions = new PlanOptions();
                ArrayList<Plan> activityPlace = planOptions.getActivityPlace(place);
                ArrayList<Plan> activityBudget = planOptions.getActivityType(type);
                ArrayList<Plan> activityType = planOptions.getActivityBudget(budget);
                ArrayList<Plan> recommendedPlans = planOptions.getRecommendation(activityPlace, activityType, activityBudget);
                
                if (recommendedPlans.isEmpty()) {
                    System.out.println("Sorry, no recommendation found for your input.");
                }
                else {
                    Random random = new Random();
                    int randomIndex = random.nextInt(recommendedPlans.size());
                    Plan recommendation = recommendedPlans.get(randomIndex);
                    String addToList = recommendation.getActivity();
                    personalList.add(addToList);
                    System.out.println("here's an activity recommendation:");
                    System.out.println(recommendation.getActivity());
                    System.out.println("the  approximate cost of this activity is $" + recommendation.getBudget());
                
                }
            
            }
            if (choice == 1){

                PlanOptions planOptions = new PlanOptions();

                System.out.println("what is the activity you want to add?");
                String activity = input.nextLine();

                System.out.println("do you stay in for this activity or go out? enter: 'stay in' or 'go out'");
                String place = input.nextLine();

                System.out.println("is this a more relaxed or active activity? enter: 'relax' or 'active'");
                String type = input.nextLine();
            
                System.out.println("approximately how much would this activity cost? enter: number amount ");
                int budget = input.nextInt();
                input.nextLine();

                // how to call method?
                planOptions.addOptions(activity, place, type, budget);
                Plan addedPlan = new Plan(activity, place, type, budget);
                String addToList = addedPlan.getActivity();
                personalList.add(addToList);
                System.out.println("thanks for adding this activity!");

            }

           

            System.out.println("would you like to continue planning? enter: 'continue' or 'end'");
            String keepgoing = input.nextLine();

            while(!keepgoing.equals("continue") & !keepgoing.equals("end")){
                System.out.println("invalid choice. enter: 'continue' or 'end'");
                keepgoing = input.nextLine();
                }

            if (keepgoing.equals("continue")){
                    System.out.println("keep planing away!");

                }
            else if(keepgoing.equals("end")){
                    System.out.println("have fun with your new plans!");
                    
                    // System.out.println("Using For Loop\n ");
                    // for (int i = 0; i < personalList.size();i++) { 		      
                    //     System.out.println(personalList.get(i)); 		
                    // }   
                    System.out.println(personalList);
                    break;
            }
        
        }
    }
}