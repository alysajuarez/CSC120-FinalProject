import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Plan {

    /**
    * string name for activity
    */
    private String activity;
    /**
    * string for place
    */
    private String place;
    /**
    * string for type
    */
    private String type;
    /**
    * int for budget amount
    */
    private int budget;
    
    /**
    * constructs attributes for Library class
    * @param String activity 
    *         activity 
    * @param String place
    *         place: stay in or go out
    * @param String type
    *         type of activity: relax or active
    * @param int budget
    *         int of budget for activity
    */ 
    public Plan(String activity, String place, String type, int budget) {
        this.activity = activity;
        this.place = place;
        this.type = type;
        this.budget = budget;
    }
    
    /**
    * accessor to get activity
    * @return activity
    */
    public String getActivity() {
        return activity;
    }
    
    /**
    * accessor to get place
    * @return place
    */
    public String getPlace() {
        return place;
    }
    
    /**
    * accessor to get type
    * @return type
    */
    public String getType() {
        return type;
    }

    /**
    * accessor to get budget
    * @return budget
    */
    public int getBudget() {
        return budget;
    }

  


}
