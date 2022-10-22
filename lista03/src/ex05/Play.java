package ex05;

public class Play {
    /*
     * This class is used to play the game
     */


    public String Winner(Objects object1, Objects object2) {
        /*
         * This method compares the objects and returns the winner
         */
        return object1.wins(object2);
    }

    public static void main(String[] args) {

        /*
         * This method creates the objects and calls the Winner method
         * They are created randomly and the winner is printed
         */
        for (int i = 0; i < 10; i++) {
            int random1 = (int) (Math.random() * 3);
            int random2 = (int) (Math.random() * 3);
            Objects object1 = null;
            Objects object2 = null;
            switch (random1) {
                case 0 -> object1 = new Rock();
                case 1 -> object1 = new Paper();
                case 2 -> object1 = new Scissors();
            }
            switch (random2) {
                case 0 -> object2 = new Rock();
                case 1 -> object2 = new Paper();
                case 2 -> object2 = new Scissors();
            }
            System.out.println("Game " + (i + 1));
            Play game = new Play();
            assert object1 != null;
            System.out.println("Object 1: " + object1.getType());
            assert object2 != null;
            System.out.println("Object 2: " + object2.getType());
            System.out.println("Winner: " + game.Winner(object1, object2));
            System.out.println(" ");
        }

    }
}
