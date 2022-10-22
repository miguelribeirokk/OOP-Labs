package ex03;

public class Circle implements Form {

    //Attributes
    private float radius;

    //Constructor
    public Circle(float radius) {
        this.radius = radius;
    }

    //Getters and Setters

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    //Methods

    /*
     * This method calculates area of the circle
     */

    public float calculateArea() {
        return (float) (Math.PI * Math.pow(radius, 2));
    }

    /*
     * This method calculates perimeter of the circle
     */

    public float calculatePerimeter() {
        return (float) (Math.PI * 2 * radius);
    }

    public String getType() {
        return "Circle";
    }

}