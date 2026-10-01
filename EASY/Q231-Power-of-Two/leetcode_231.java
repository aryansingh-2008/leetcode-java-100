import java.util.Scanner;

public class leetcode_231 {

    public static void main(String[] args) {

        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int power = 1;
        boolean found = false;

        for (int i = 0; i <= n; i++) {

            if (power == n) {
                found = true;
                break;
            }

            power = power * 2;
        }

        if (found) {
            System.out.println("Power of two");
        } else {
            System.out.println("Not a power of two");
        }
    }
}

//for leet code

/*class Solution {
    public boolean isPowerOfTwo(int n) {

        if (n <= 0) {
            return false;
        }

        int power = 1;

        for (int i = 0; i < 31; i++) {

            if (power == n) {
                return true;
            }

            power = power * 2;
        }

        return false;
    }
}*/