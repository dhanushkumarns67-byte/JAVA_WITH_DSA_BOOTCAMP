# Checked/compiler
1. Checked by Compiler
2. Must handle using try and catch block
3. EXternal Conditions are responsible
4. Occurs in runtime as well
5. throws is required

# throw and throws
- throws is for a function
- throw is for a declared line

# Custom Exception in JAVA
- When you crerating and class of exception with user defined.

1. Checked Custom Exception
2. Unchecked Custom Exception

Leetcode numbers
9
13
66
258
326
342
367
904

# sliding window maxmimum
''''int[] num={1, 3, -1, -3, 5, 3, 6, 7};''''
     '''int k=3;'''

i=0
int num[i]=1
currentwindow=1
Dequevalue=1

i=1
num[i]=3
currentWindow=[1,3] 
DequeValue=[3]


i=2
num[i]=-1
currentWindow=[1,3,-1] max=3
DequeValue=[3,-1]
results=[3]

i=3
num[i]=-3
currentWindow=[3,-1,-3] max=3
DequeValue=[-1,-3]
results=[3]

i=4
num[i]=5
currentWindow=[-1,-3,5] max=5
DequeValue=[-3,5]
results=[5]

i=5
num[i]=3
currentWindow=[-3,5,3] max=5
DequeValue=[5,3]
results=[5]

i=6
num[i]=6
currentWindow=[5,3,6] max=6
DequeValue=[3,6]
results=[6]

i=7
num[i]=7
currentWindow=[3,6,7] max=7
DequeValue=[6,7]
results=[7]