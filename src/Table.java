public class Table {
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int product = n * i; // calculate the product of n and i
            System.out.println(n + " x " + i + " = " + product); // output the result
        }

    }
}
