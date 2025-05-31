

public class Main {

    public static void main(String[] args) {

        int num = 567;
        int number = num % 10 * 100;
        num /= 10;
        number += num % 10 * 10;
        num /= 10;
        number += num;

        System.out.println(number);
        System.out.println(27);

    }
}