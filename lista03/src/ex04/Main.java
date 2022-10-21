package ex04;

public class Main {
    public static void main(String[] args) {

        /*
        Creating 5 new products
        They all have a randomly generated serial number
        */

        Product[] produts = new Product[5];

        for (int i = 0; i < produts.length; i++) {
            produts[i] = new Product((int) (Math.random() * 100));
        }

        /* Printing the products */

        for (Product produt : produts) {
            System.out.println(produt.toString());
        }

        /* Changing the volume of all products */
        System.out.println("#####################################");
        System.out.println("Changing the volume of all products");

        for (Product product : produts) {
            product.setVolume(500);
        }

        /* Printing the products */

        System.out.println("New volumes of the products:");
        System.out.println("#####################################");

        for (Product produt : produts) {
            System.out.println(produt.toString());

        }
    }
}

