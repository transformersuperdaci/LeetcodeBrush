# Shortest Unsorted Continuous Subarray
## Description
Given an integer array, you need to find one continuous subarray that if you only sort this subarray in ascending order, then the whole array will be sorted in ascending order, too.
You need to find the shortest such subarray and output its length.

 - [ ] Example 1


```java
Input:  [2, 6, 4, 8, 10, 9, 15]
Output:  5

```
```java
Explanation: You need to sort [6, 4, 8, 10, 9] 
in ascending order to make the whole array sorted in ascending order.
```


## Solution

## Appendix
 1. 递归写法：
 ```java
A(param){
  if(param==1) return res1;
//第二项和第一项是什么关系
  else return A();
}
 ```
2. 思路比较简单，但是我实现的时候费了点劲。
通过leetcode，我也总结一点，就是用for循环，会让程序变得复杂；另外，有的变量之间有
有一个，不必定义那么多变量，不好看还浪费效率。