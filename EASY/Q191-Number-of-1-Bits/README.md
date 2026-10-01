# LeetCode #191 — Number of 1 Bits

- Difficulty: Easy
- Language: Java
- Status: Accepted

## Concepts
- Bitwise AND operator (`&`)
- Unsigned right shift operator (`>>>`)
- While loop
- Counter variable

## Approach
1. Initialize a counter `count = 0` to track set bits (1s).
2. While `n != 0`:
   - Check the least significant bit using `(n & 1) == 1`. If it is 1, increment `count`.
   - Shift `n` right by 1 bit using the unsigned right shift operator `n >>> 1` to process the next bit.
3. Once all bits have been shifted and `n` becomes 0, return `count`.

## Complexity
Time Complexity: O(1) (processes at most 32 bits for a 32-bit integer)
Space Complexity: O(1)
