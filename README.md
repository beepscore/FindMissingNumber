# Purpose
Write Android app to find number missing from a range.

# References

# Results

## Problem statement
Consider a continous range of integers.
All but one of the numbers are put into an array in any order.

Example
Expected range is 500 to 600 inclusive.
Expected range contains 101 numbers.
Actual array has 100 items.
[570, 539, 500, 517, ...]

## Plan (approximate)

### Assumptions
In a more general case, if the actual array contains consecutive numbers,
you could say the "missing" number is at the minimum end or at the maximum end.
To avoid ambiguity, use argument "expectedMinimum".

### Method 1: Calculate expected sum, actual sum, number is expected - actual
Be careful to avoid number overflow.
Python avoids this by automatically increasing integer size.

#### Expected sum
Expected sum if all 101 numbers were present.
Use method of Gauss, pair numbers, sum them, multiply by number of pairs.
If collection count is odd, will have one unpaired number.

### Method 2: Alternately add an expected and subtract an actual
This reduces chance of number overflow by keeping intermediate result from becoming large.
Aside- If using Python, remember it doesn't support ++ operator, will misinterpret it as unary +.

int result = 0;

for (index = 0; index <= maximum; ++index)
   // add an expected
   result += (minimum + index);
   result -= numbers[index];

### Method 3: Xor
Bitwise xoring a number with itself yields zero e.g. 0000 0000.
Xor is commutative, order doesn't matter.
Xor all 100 + 101 numbers in any order.
Result is the number.
I think this is correct- unit test to verify.
