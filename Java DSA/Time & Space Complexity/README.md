# Time and Space Complexity in Algorithms

## Table of Contents
1. [Introduction](#introduction)
2. [Time Complexity](#time-complexity)
    1. [Definition](#definition)
    2. [Big O Notation](#big-o-notation)
    3. [Common Time Complexities](#common-time-complexities)
    4. [Examples](#examples)
3. [Space Complexity](#space-complexity)
    1. [Definition](#definition)
    2. [Examples](#examples-1)
4. [Graphical Representation](#graphical-representation)
5. [Java Code Examples](#java-code-examples)
6. [References](#references)

## Introduction

Understanding time and space complexity is crucial for writing efficient algorithms. This chapter explains these concepts, how to calculate them, and provides examples in Java.

## Time Complexity

### Definition

Time complexity measures the amount of time an algorithm takes to complete as a function of the length of the input.

### Big O Notation

Big O notation describes the upper limit of the time complexity, giving the worst-case scenario.

### Common Time Complexities

- **O(1)**: Constant time
- **O(log n)**: Logarithmic time
- **O(n)**: Linear time
- **O(n log n)**: Linearithmic time
- **O(n^2)**: Quadratic time
- **O(2^n)**: Exponential time

### Examples

1. **O(1) - Constant Time**

    ```java
    int getFirstElement(int[] array) {
        return array[0];
    }
    ```

2. **O(n) - Linear Time**

    ```java
    int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
    ```

3. **O(n^2) - Quadratic Time**

    ```java
    void printPairs(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[i] + ", " + array[j]);
            }
        }
    }
    ```

## Space Complexity

### Definition

Space complexity measures the amount of memory an algorithm uses as a function of the length of the input.

### Examples

1. **O(1) - Constant Space**

    ```java
    int getFirstElement(int[] array) {
        return array[0];
    }
    ```

2. **O(n) - Linear Space**

    ```java
    int[] duplicateArray(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }
    ```

## Graphical Representation

Graphical representations help visualize different time complexities. Below are some examples:

- **O(1)**: A flat line, indicating constant time.
- **O(log n)**: A slowly increasing curve, indicating logarithmic time.
- **O(n)**: A straight line, indicating linear time.
- **O(n^2)**: A steep curve, indicating quadratic time.
- **O(2^n)**: An extremely steep curve, indicating exponential time.

Here are some example graphs:
![Time Complexities](https://www.bigocheatsheet.com/img/big-o-cheat-sheet-poster.png)

## Java Code Examples

### Example 1: Linear Search

```java
public class LinearSearch {
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int target = 3;
        int index = linearSearch(array, target);
        System.out.println("Element found at index: " + index);
    }
}
```

### Example 2: Bubble Sort

```java
public class BubbleSort {
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 1, 4, 2, 8};
        bubbleSort(array);
        System.out.println("Sorted array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
```

## References

- [Big O Cheat Sheet](https://www.bigocheatsheet.com/)
- [Introduction to Algorithms by Cormen, Leiserson, Rivest, and Stein](https://mitpress.mit.edu/9780262046305/introduction-to-algorithms/)
- [Geeks for Geeks - Time Complexity](https://www.geeksforgeeks.org/analysis-of-algorithms-set-1-asymptotic-analysis/)

---

