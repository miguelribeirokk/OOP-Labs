package ex04;

public class Product {

    // Attributes
    private int serialNumber;
    private int volume;
    private String test;

    // Constructor
    public Product(int serialNumber) {
        this.serialNumber = serialNumber;
        this.volume = 300;
        this.test = unitTest() ? "Test passed" : "Test failed";
    }

    //Getters and setters

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    //Methods

    public boolean unitTest() {

        /*
        This method is used to test the quality of the product
        It returns true if the product is good and false if it is bad
        */

        double numberTest = Math.random();
        return numberTest > 0.1;
    }

    public String toString() {

        /*
        This method converts all attributes of the product to a string
        */
        return "Product{" +
                "serialNumber=" + serialNumber +
                ", volume=" + volume +
                ", test='" + test + '\'' +
                '}';
        }
}

