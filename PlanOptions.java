import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class PlanOptions {
    private ArrayList<Plan> plans;
    
    public PlanOptions() {
        plans = new ArrayList<Plan>();
        plans.add(new Plan("go to the movies! don't forget the popcorn.", "go out", 25));
        plans.add(new Plan("buy some face masks and enjoy an at-home spa day", "stay in", 10));
        plans.add(new Plan("find some friends and hit the clubs!", "go out", 40));
        plans.add(new Plan("gather a group and go bowling! avoid the gutter.", "go out", 35));
        plans.add(new Plan("find your closest communal pool and go for a swim!", "go out", 10));
        plans.add(new Plan("go to a fancy dinner", "go out", 70));
        plans.add(new Plan("treat yourself to some new items and go shopping!", "go out", 100));
        plans.add(new Plan("rest is important. sleep in for a few extra hours. you need it!", "stay in", 0));
        plans.add(new Plan("binge some TV shows! maybe a season or two", "stay in", 0));
        plans.add(new Plan("get active and go for a hike!", "go out", 0));
        plans.add(new Plan("grab some friends and shoot some hoops at your nearest basketball court!", "go out", 0));
        plans.add(new Plan("pick up some snacks and have a picnic at the park!", "go out", 20));
        plans.add(new Plan("go to the beach, but don't forget the sunscreen!", "go out", 30));
        plans.add(new Plan("increase your art skills and paint a portrait!", "stay in", 10));
        plans.add(new Plan("go to an amusement park! don't be afraid to get on the big rides!", "go out", 200));
        plans.add(new Plan("get a haircut", "go out", 20));

    }
    
    public ArrayList<Plan> getActivityPlace(String place) {
        ArrayList<Plan> places = new ArrayList<Plan>();
        for (Plan plan : plans) {
            if (plan.getPlace().equalsIgnoreCase(place)) {
                places.add(plan);
            }
        }
        return places;
    }
    
    public ArrayList<Plan> getActivityBudget(int budget) {
        ArrayList<Plan> budgets = new ArrayList<Plan>();
        for (Plan plan : plans) {
            if (plan.getBudget() <= budget) {
                budgets.add(plan);
            }
        }
        return budgets;
    }
    
    public ArrayList<Plan> getRecommendation(ArrayList<Plan> places, ArrayList<Plan> budgets) {
        ArrayList<Plan> recommendedPlans = new ArrayList<Plan>();
        for (Plan plan : places) {
            if (budgets.contains(plan)) {
                recommendedPlans.add(plan);
            }
        }
        return recommendedPlans;
    }
}