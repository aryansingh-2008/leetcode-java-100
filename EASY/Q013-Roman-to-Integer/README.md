# LeetCode #13 — Roman to Integer

- Difficulty: Easy
- Language: Java
- Status: Accepted

## Concepts
- Variables
- For loop / String traversal
- Character comparison (`charAt`)
- If-else condition
- Roman numeral value mapping
- Subtraction rule

## Approach
1. Iterate through the string character by character.
2. Determine the integer value corresponding to the current Roman symbol:
   - `I` = 1, `V` = 5, `X` = 10, `L` = 50, `C` = 100, `D` = 500, `M` = 1000
3. If there is a next character, determine its value as well.
4. Apply the Roman numeral subtraction rule:
   - If the current value is less than the next value (e.g., `IV` = 4, `IX` = 9), subtract the current value from the result.
   - Otherwise, add the current value to the result.
5. Return the accumulated result.

## Complexity
Time Complexity: O(n) (where n is the length of the string, at most 15 for valid Roman numerals, effectively O(1))
Space Complexity: O(1)
