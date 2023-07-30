public class CalculatorTest {

    public static void testAdd() {
        String expression = "3+5";
        String expectedResult = "8.0";
        String result = Calculator.Run(expression);

        System.out.println("\n\ntestAdd(): ");
        System.out.println("Inserted expression: " + expression);
        System.out.println("Expected value: " + expectedResult);
        System.out.println("Calculated value: " + result);

        System.out.println("\nTest: ");
        if (expectedResult.equals(result)) {
            System.out.println("Passed\n");
        } else {
            System.out.println("Fail\n");
        }

    }

    public static void testSub() {
        String expression = "6-3";
        String expectedResult = "3.0";
        String result = Calculator.Run(expression);

        System.out.println("\n\ntestSub(): ");
        System.out.println("Inserted expression: " + expression);
        System.out.println("Expected value: " + expectedResult);
        System.out.println("Calculated value: " + result);

        System.out.println("\n\nTest: ");
        if (expectedResult.equals(result)) {
            System.out.println("Passed\n");
        } else {
            System.out.println("Fail\n");
        }

    }

    public static void main(String[] args) {

        CalculatorTest.testAdd();
        CalculatorTest.testSub();

    }

}
