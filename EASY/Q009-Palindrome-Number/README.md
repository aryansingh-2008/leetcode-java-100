# LeetCode #9 — Palindrome Number

- Difficulty: Easy
- Language: Java
- Status: Accepted

## Concepts
- Variables
- If condition
- While loop
- Modulo operator (%)
- Integer division (/)
- Number reversal

## Approach
1. Store the original number in `original` to preserve its value for later comparison.
2. Initialize `reverse` to 0 to build the reversed number.
3. While `n > 0`:
   - Extract the last digit of `n` using the modulo operator (`digit = n % 10`).
   - Append the digit to `reverse` (`reverse = reverse * 10 + digit`).
   - Discard the last digit from `n` using integer division (`n = n / 10`).
4. Compare `original` with `reverse` using an `if` condition:
   - If they are equal, print "Palindrome number".
   - Otherwise, print "Not a palindrome number".

## Complexity
Time Complexity: O(log n)
Space Complexity: O(1)
