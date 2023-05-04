import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Plan {
    private String activity;
    private String place;
    private int budget;
    
    public Plan(String activity, String place, int budget) {
        this.activity = activity;
        this.place = place;
        this.budget = budget;
    }
    
    public String getActivity() {
        return activity;
    }
    
    public String getPlace() {
        return place;
    }
    
    public int getBudget() {
        return budget;
    }
}
