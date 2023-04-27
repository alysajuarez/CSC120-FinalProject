import java.util.Hashtable;
//import java.util.Scanner;

public class Character {

    private Hashtable<String, Boolean> inventory;
    private String name;
    private int position;

    public Character(String name) {
        this.name = name;
        this.inventory = new Hashtable<String, Boolean>();
        this.inventory.put("flashlight", false);
        this.inventory.put("vacuum", false);
        this.inventory.put("dust", false);
        this.position = 15;
    }


    public void move(String direction){
        System.out.println("enter the direction you would like to move: N, E, S, W");
       if (direction == "N"){
        this.position = position - 4;

       }

    }


    public void lookAround(){
        if (this.position == 1){
            System.out.println(name + ", you are in the master bedroom. to the north and west there are walls");
            if (this.inventory.get("vacuum")==false){
                System.out.println("there is a vacuum here, add to inventory?");
            }
        }
        if (this.position == 2){
            System.out.println("you are in the master bedroom. to the north there is a wall");
    
        }
        if (this.position == 3){
            System.out.println("you are in the guest bedroom. to the north there is a wall");
    
        }
        if (this.position == 4){
            System.out.println("you are in the guest bedroom. to the north and east there are walls");
    
        }
        if (this.position == 5){
            System.out.println("you are in the master bedroom. to the west there is a wall");
    
        }
        if (this.position == 6){
            System.out.println("you are in the master bedroom. to the east and south there are walls");
    
        }
        if (this.position == 7){
            System.out.println("you are in the guest bedroom. to the west and south there are walls");
    
        }
        if (this.position == 8){
            System.out.println("you are in the guest bedroom. to the east there is a wall");
    
        }
        if (this.position == 9){
            System.out.println("you are in the kitchen. to the west there is a wall");
    
        }
        if (this.position == 10){
            System.out.println("you are in the kitchen. to the north there is a wall");
    
        }

        if (this.position == 11){
            System.out.println("you are in the living room. to the north there is a wall");
    
        }
        if (this.position == 12){
            System.out.println("you are in the living room. to the east there is a wall");
            if (this.inventory.get("flashlight")==false){
                System.out.println("there is a flashlight here, add to inventory?");
            }
    
        }
        if (this.position == 13){
            System.out.println("you are in the kitchen. to the west and south there are walls");
    
        }
        if (this.position == 14){
            System.out.println("you are in the kitchen. to the south and east there are walls");
            if (this.inventory.get("dust")==false){
                System.out.println("there is a bag of magic dust here, add to inventory?");
            }
    
        }
        if (this.position == 15){
            System.out.println("you are in the living room. to the west and south there are walls");
    
        }
        if (this.position == 16){
            System.out.println("you are in the living room. to the east and south there are walls");
    
        }
    }




    public void take(String take, String item){
        System.out.print("there is an item here, add to inventory? Yes or No");
        if (take == "Yes"){
            this.inventory.replace(item, false, true);
            System.out.print("you have added the " + item + " to your inventory");
        }
    
    }


    public void expel(String ghost){
        if (ghost == "flashlight ghost"){
            if (this.inventory.get("flashlight")==true){
                this.inventory.replace(ghost, false, true);
                System.out.println("you have expelled the ghost!");
            }
            else{
                System.out.println("you failed to expel the ghost! you lose");
                System.out.println("start over? Yes or No");
                // start game over code (loop?)
            }
        }
        if (ghost == "vacuum ghost"){
            if (this.inventory.get("vacuum")==true){
                this.inventory.replace(ghost, false, true);
                System.out.println("you have expelled the ghost!");
            }
            else{
                System.out.println("you failed to expel the ghost! you lose");
                System.out.println("start over? Yes or No");
                // start game over code (loop?)
            }
        }
        if (ghost == "dust ghost"){
            if (this.inventory.get("dust")==true){
                this.inventory.replace(ghost, false, true);
                System.out.println("you have expelled the ghost!");
            }
            else{
                System.out.println("you failed to expel the ghost! you lose");
                System.out.println("start over? Yes or No");
                // start game over code (loop?)
            }
        }
       
    }




    public static void main(String[] arguments) {
        Character me = new Character("myname");
        //Scanner input = new Scanner(System.in);
        me.take("Yes", "flashlight");
    }
    
}



