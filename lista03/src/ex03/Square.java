package ex03;

public class Square implements Form {
    //Attributes
    private float side;

    //Constructor

    public Square(float side) {
        this.side = side;
    }

    //Getters and Setters


    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }

    //Methods

    public float calculateArea() {
        return side * side;
    }

    public float calculatePerimeter() {
        return 4 * side;
    }

    public String getType() {
        return "Square";
    }
}

