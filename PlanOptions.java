import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class PlanOptions {

    /**
    * private Array of plans
    */
    private static ArrayList<Plan> plans;
    
    /**
    * constructor attributes for PlanOptions class to add to Array
    *
    */ 
    public PlanOptions() {
        plans = new ArrayList<Plan>();
        plans.add(new Plan("go to the movies! don't forget the popcorn.", "go out", "relax", 25));
        plans.add(new Plan("buy some face masks and enjoy an at-home spa day", "stay in", "relax", 10));
        plans.add(new Plan("find some friends and hit the clubs!", "go out", "active", 40));
        plans.add(new Plan("gather a group and go bowling! avoid the gutter.", "go out", "active", 35));
        plans.add(new Plan("find your closest communal pool and go for a swim!", "go out", "active", 10));
        plans.add(new Plan("go to a fancy dinner", "go out", "relax", 70));
        plans.add(new Plan("treat yourself to some new items and go shopping!", "go out", "active", 100));
        plans.add(new Plan("rest is important. sleep in for a few extra hours. you need it!", "stay in", "relax", 0));
        plans.add(new Plan("binge some TV shows! maybe a season or two", "stay in", "relax", 0));
        plans.add(new Plan("catch up on some work! you'll thank yourself later", "stay in", "active", 0));
        plans.add(new Plan("get active and go for a hike!", "go out","active", 0));
        plans.add(new Plan("grab some friends and shoot some hoops at your nearest basketball court!", "go out", "active", 0));
        plans.add(new Plan("pick up some snacks and have a picnic at the park!", "go out", "relax", 20));
        plans.add(new Plan("go to the beach, but don't forget the sunscreen!", "go out", "relax", 30));
        plans.add(new Plan("increase your art skills and paint a portrait!", "stay in","relax", 10));
        plans.add(new Plan("go to an amusement park! don't be afraid to get on the big rides!", "go out", "active", 200));
        plans.add(new Plan("get a haircut", "go out", "relax", 20));
        plans.add(new Plan("read a book at the park", "go out", "relax", 0));

    }

    /**
    * method to add plan(with parameters) to array list
    * @param String activity
    *           activity
    * @param String places
    *           stay in or go out
    * @param String type
    *          relax or active
    * @param int budget
    *            budget for activity
    * @return plans
    */
    public static ArrayList<Plan> addOptions(String activity, String place, String type, int budget){
        plans.add(new Plan(activity, place, type, budget));
        return plans;
    }
    
    /**
    * method to get places for activity and add to array
    * @param String place
    *           stay in or go out
    * @return places
    */
    public ArrayList<Plan> getActivityPlace(String place) {
        ArrayList<Plan> places = new ArrayList<Plan>();
        for (Plan plan : plans) {
            if (plan.getPlace().equalsIgnoreCase(place)) {
                places.add(plan);
            }
        }
        return places;
    }

    /**
    * method to get types for activity and add to array
    * @param String type
    *           relax or active
    * @return types
    */
    public ArrayList<Plan> getActivityType(String type) {
        ArrayList<Plan> types = new ArrayList<Plan>();
        for (Plan plan : plans) {
            if (plan.getType().equalsIgnoreCase(type)) {
                types.add(plan);
            }
        }
        return types;
    }
    

    /**
    * method to get budgets for activity and add to array
    * @param int budget
    *           budget for activity
    * @return budgets
    */
    public ArrayList<Plan> getActivityBudget(int budget) {
        ArrayList<Plan> budgets = new ArrayList<Plan>();
        for (Plan plan : plans) {
            if (plan.getBudget() <= budget) {
                budgets.add(plan);
            }
        }
        return budgets;
    }
    
    /**
    * method to get recommendations based on array lists for parameters
     * @param ArrayList<Plan> places
    *           array list of places fitting parameter
     * @param ArrayList<Plan> types
    *           array list of types fitting parameter
    * @param ArrayList<Plan> budgets
    *           array list of budgets fitting parameter
    * @return recommendedPlans
    */
    public ArrayList<Plan> getRecommendation(ArrayList<Plan> places, ArrayList<Plan> types, ArrayList<Plan> budgets) {
        ArrayList<Plan> recommendedPlans = new ArrayList<Plan>();
        for (Plan plan : places) {
           
            if (types.contains(plan) && budgets.contains(plan)) {
                recommendedPlans.add(plan);
            }
        
        }
        return recommendedPlans;
    }
}