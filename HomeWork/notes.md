# Leetcode 35
# Leetcode 704
# Leetcode 605
# Leetcode 2326

# company specific
    # Leetcode 401
    # Leetcode 1283
    # Leetcode 1552
    # Leetcode 1482

# Greedy Pattern
    55
    45
    135
    134

# Exeception Handling in java
Handling Errors in an Efficient way

# types
checked exception
unchecked exception
custom exception

# keyword for exception in java
try,catch,finally
throw,throws

1. checked/compile time:
  IOexception
  fileNotfound
  SQLexception
  classnotfound

# unchecked exceptions
- ArithematicException
- ArrayIndexOutOfBounds
- NullPointeer
- NumberFormatException


static keyword impossion 10 times
Star pattern

# DAY7 HW
bikeandpath for up and left
leetcode 64
word search leetcode 79
 
 # DAY8 hw
slove unique path by memorization or top down approach


451
496
gcd (vs)
amstrong number(vs)
213

# DAY11 HW
minimum depth of binary tree (111)
Flood Fill (733)
Island Perimeter(463)
Path Sum(112)
Path sum(113)


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int[] result = new int[n];
        int prefix = 1, suffix = 1;

        for (int i = 0; i < n; i++) {
            result[i] = prefix;
            prefix *= arr[i];
        }

        for (int i = n - 1; i >= 0; i--) {
            result[i] *= suffix;
            suffix *= arr[i];
        }

        for (int value : result) {
            System.out.print(value + " ");
        }
    }