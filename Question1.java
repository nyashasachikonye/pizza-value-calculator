import java.util.Scanner;

/**
 * Driver class for Assignment 3, Question 1
 */
public class Question1 {

    public static void main(String[] args) {
        System.out.println("**** Pizza Value Calculator ***");
        String quit = "y";
        float bestPizzaValueInRands = Float.MAX_VALUE;
        String bestPizzaName = null;
        Scanner s = new Scanner(System.in);

        while ("y".equalsIgnoreCase(quit)) {
            System.out.print("Enter pizza name: ");
            String name = s.nextLine();


            System.out.print("Enter pizza cost in Rands: ");
            int cost = (int) (s.nextDouble() * 100);
            s.nextLine(); //clear the \n

            System.out.print("Enter pizza diameter in cm: ");
            int diameter = s.nextInt();
            s.nextLine(); //clear the \n

            Pizza pizza = new Pizza(cost, diameter, name);
            float pizzaValueInRands = pizza.getValue() / 100f;
            System.out.printf("Pizza value is (R/cm^2): R%.2f\n", pizzaValueInRands);

            if (pizzaValueInRands < bestPizzaValueInRands) {
                bestPizzaName = pizza.getName();
                bestPizzaValueInRands = pizzaValueInRands;
            }

            System.out.print("Would you like to calculate another pizza value? (Y/N) ");
            quit = s.nextLine();
        }

        System.out.printf("The pizza with best value for money is: "
                + bestPizzaName
                + " (R%.2f) ", bestPizzaValueInRands);
    	}
	}


