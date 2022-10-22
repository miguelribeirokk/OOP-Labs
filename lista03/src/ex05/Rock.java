package ex05;

public class Rock implements Objects {

    /*
     *This method is used to return the type of the object
     */
    public String getType() {

        return "Rock";
    }

    public String wins(Objects object) {

        /*
         *This method is used to return the type of the object that wins
         */
        if (java.util.Objects.equals(object.getType(), "Scissors")) {
            return "Rock";
        } else if (java.util.Objects.equals(object.getType(), "Paper")) {
            return "Paper";
        } else {
            return "Draw";
        }
    }
}
