import java.util.Scanner;

public class leetcode_191 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int count = 0;

        while (n != 0) {

            if ((n & 1) == 1) {
                count++;
            }

            n = n >>> 1;
        }

        System.out.println("Number of 1 bits: " + count);

        sc.close();
    }
}

//FOR LEET CODE SUBMISSION
/*class Solution {
    public int hammingWeight(int n) {

        int count = 0;

        while (n != 0) {

            if ((n & 1) == 1) {
                count++;
            }

            n = n >>> 1;
        }

        return count;
    }
} */