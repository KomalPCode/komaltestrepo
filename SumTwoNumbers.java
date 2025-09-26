public class SumTwoNumbers {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();
        double sum = firstNumber + secondNumber;
        System.out.println(sum);
        scanner.close();
    }
}

