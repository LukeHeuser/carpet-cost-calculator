public class Main {

    public static void main(String[] args) {

        Carpet carpet = new Carpet(5.50);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("The total cost is $" + calculator.getTotalCost());

        carpet = new Carpet(3.45);
        floor = new Floor(20, 12);
        calculator = new Calculator(floor, carpet);
        System.out.println("The total cost is $" + calculator.getTotalCost());

    }
}
