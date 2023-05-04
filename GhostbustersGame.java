// import java.util.Scanner; 
// import java.util.Random;


// class GhostbustersGame {


// public static void main(String[] args) {
//     // create scanner object
//     Scanner input = new Scanner(System.in);
//     Random rand = new Random();

    
//     //System.out.println("each requires a different item to be defeated. all items can be found in the house");
//     //reader.close();


//     //game variables

//     String[] ghosts = {"Slimer", "Dream Ghost", "Stay Puft Marshmallow Man", "Muncher", "Giant Eyeball Ghost"};
//     int maxGhostHealth = 15;
//     int ghostPower = 10;


//     // character variables

//     int ghostbusterHealth = 25;
//     int ghostbusterPower = 10;
//     int powerUps = 5;
//     int powerUpAmount = 10;
//     int ghostsDefeated = 0;
    

//     boolean gaming = true;

//     System.out.println("hello, enter player name");
//     String playerName = input.nextLine();
//     System.out.println(playerName + ", you are a ghostbuster in a haunted house");
//     System.out.println("your goal is to defeat the ghosts");

    
//     while(gaming) {

//         int ghostHealth = rand.nextInt(maxGhostHealth);
//         String ghost = ghosts[rand.nextInt(ghosts.length)];
//         System.out.println(ghost + " has appeared");

//         while(ghostHealth > 0){
//             System.out.println("your health: " + ghostbusterHealth);
//             System.out.println("ghost health: " + ghostHealth);
//             System.out.println("destroy or power up?");
            
//             String choice = input.nextLine();
//             if (choice.equals("destroy")){
//                 int attack = rand.nextInt(ghostbusterPower);
//                 int damage = rand.nextInt(ghostPower);

//                 ghostHealth = ghostHealth - attack;
//                 System.out.println("you lessened " + ghost + "'s power by " + attack);
//                 ghostbusterHealth = ghostbusterHealth - damage;
//                 System.out.println(ghost + " lessened your power by " + damage);

//                 if (ghostbusterHealth < 1){
//                     System.out.println("you have no more power");
//                     break;
//                 }

//             }
//             else if (choice.equals("power up")){
//                 if (powerUps > 0) {
//                     ghostbusterHealth = ghostbusterHealth + powerUpAmount;
//                     powerUps = powerUps - 1;
//                     System.out.println("you have powered up by " + powerUpAmount);
//                     System.out.println("your power is at " + ghostbusterHealth);
//                     System.out.println("you have " + powerUps + " power ups left");

//                 }
//                 else{
//                     System.out.println("you do not have any power ups");
//                 }
//             }
//             else{
//                 System.out.println("invalid choice");
//             }


//         }

//         if (ghostbusterHealth < 1) {
//             System.out.println("you are too weak");
//             break;
//         }
        
//         System.out.println("you defeated " + ghost + "!");
//         ghostsDefeated = ghostsDefeated + 1;
//         System.out.println("your power is at " + ghostbusterHealth);

//         System.out.println("would you like to find more ghosts or leave the house? enter: continue or leave");

//         String choice = input.nextLine();

//         while(!choice.equals("continue") & !choice.equals("leave")){
//             System.out.println("invalid choice");
//             choice = input.nextLine();

//         }
//         if (choice.equals("continue")){
//             System.out.println("continue finding ghosts");
//         }
//         else if(choice.equals("leave")){
//             System.out.println("you have left the house");
//             System.out.println("congrats, you defeated " + ghostsDefeated + " ghosts!");
//             break;
//         }


//     }

//     System.out.println("thanks for playing!");

// }

// }