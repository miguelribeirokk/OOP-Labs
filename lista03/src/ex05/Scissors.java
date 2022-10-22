package ex05;

public class Scissors implements Objects {


    public String getType() {
        /*
         *This method is used to return the type of the object
         */

        return "Scissors";
    }

    public String wins(Objects object) {
        /*
         *This method is used to return the type of the object that wins
         */
        if (java.util.Objects.equals(object.getType(), "Paper")) {
            return "Scissors";
        } else if (java.util.Objects.equals(object.getType(), "Rock")) {
            return "Rock";
        } else {
            return "Draw";
        }
    }
}
