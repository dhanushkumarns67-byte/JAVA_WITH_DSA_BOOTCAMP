# String in Java
- Is a class
- String s1;

# 1. String Creation
1. String s1;
2. String s1 = new String("NAME);

2. String immutalbe

# string builder
- append()
- insert()
- delete()
- replace()
- reverse()

# string buffer
- safer option for multi thread
- slower than the builder

# remember
- string immutable
- string literals are maintained in a pool
- new string()stores in heap(new object)
- == compares objects
- equals() compares value 
- string is mutable in stringbuilder and buffer 
- string builder is single thread code
- stringbuffer for multi thread code 

# problem
take an array with value 123456
 add all value to the queue and take k value
 add first element of k to th stack
 lets take k has 3 and add it back to the queue
 the value from front should be added at back