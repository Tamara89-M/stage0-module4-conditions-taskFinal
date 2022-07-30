package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {

        try {
            int dividing = dividend / divider;
            int result = dividing * divider;
            if (result == dividend) {
                System.out.println("can be divided completely");
            } else {
                System.out.println("cannot be divided completely");
            }
        } catch (ArithmeticException e) {
            System.out.println("division by zero");
        }

    }


    public static void main(String[] args) {
        IntegerDivider i = new IntegerDivider();
        i.printCompletelyDivided(25, 0);
    }
}
