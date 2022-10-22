package ex03;

public class Rectangle implements Form {

    // Attributes
    private float width;
    private float height;

    // Constructor
    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    // Getters and setters
    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    // Methods
    public float calculateArea() {
        return width * height;
    }

    public float calculatePerimeter() {
        return 2 * (width + height);
    }
    public String getType() {
        return "Rectangle";
    }
}