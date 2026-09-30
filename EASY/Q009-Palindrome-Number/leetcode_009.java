import java.util.Scanner;

public class leetcode_009 {
    public static void main(String[] args) {

        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int original,digit,reverse = 0;
        original=n;



        while (n>0) {
        digit=n%10;
        reverse=reverse*10+digit;
        n = n/10;
            
        }
 if (original==reverse) {
    System.out.println("Palindrome number");
  } else {
    System.out.println("Not a palindrome number");

     }
 }
        
    }
