public class Location {

    String item;
    String ghost;

    public Location(String item, String ghost){
        this.item = item;
        this.ghost = ghost;
    }


    public static void main(String[] arguments){
        Location [][] map = new Location[3][3];

        for (int i = 0; i < 3; i ++){
            for (int j = 0; j < 3; j++){
                map [i][j] = new Location(null, null);
            }
        }

        map [0][1].setGhost("flashlight ghost", true);

    }




    
}
