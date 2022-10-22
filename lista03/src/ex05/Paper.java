package ex05;

public class Paper implements Objects {

    public String getType() {
        /*
         *This method is used to return the type of the object
         */
        return "Paper";
    }

    public String wins(Objects object) {
        /*
         *This method is used to return the type of the object that wins
         */
        if (java.util.Objects.equals(object.getType(), "Rock")) {
            return "Paper";
        } else if (java.util.Objects.equals(object.getType(), "Scissors")) {
            return "Scissors";
        } else {
            return "Draw";
        }
    }
}


