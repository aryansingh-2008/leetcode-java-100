# LeetCode #231 — Power of Two

- Difficulty: Easy
- Language: Java
- Status: Accepted

## Concepts
- If condition
- For loop / Iteration
- Multiplication / Power generation
- Boundary condition handling

## Approach
1. Handle edge cases: if `n <= 0`, it cannot be a power of two, so return `false`.
2. Initialize `power = 1` ($2^0$).
3. Loop through powers of two from exponent 0 to 30 ($2^{30}$ is the largest power of two that fits in a standard 32-bit signed integer):
   - If `power == n`, then `n` is a power of two, so return `true`.
   - Otherwise, update `power = power * 2` for the next check.
4. If no matching power is found after the loop, return `false`.

## Complexity
Time Complexity: O(1) (fixed loop running at most 31 iterations)
Space Complexity: O(1)
