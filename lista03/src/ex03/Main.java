package ex03;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*
         * This program creates a list of forms and prints the area and perimeter of each form
         * They have a random size
         */
        ArrayList<Form> forms = new ArrayList<>();

        for (int i = 0; i < 12; i++) {
            if (i < 4) {
                forms.add(new Square((float) (Math.random() * 10)));
            } else if (i < 8) {
                forms.add(new Circle((float) (Math.random() * 10)));
            } else {
                forms.add(new Rectangle((float) (Math.random() * 10), (float) (Math.random() * 10)));
            }
        }

        for (Form form : forms) {
            System.out.println("Type: " + form.getType());
            System.out.println("Area: " + form.calculateArea());
            System.out.println("Perimeter: " + form.calculatePerimeter());
            System.out.println("#####################################");
        }
    }
}
