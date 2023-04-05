package com.bootcoding.dsa.Array;

public class CopyEvenElements {
    public static void main(String[] args) {
        // Define the input array
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8};

        // Create a new array to hold the even elements of input
        int[] output = new int[input.length];

        // Initialize a variable to keep track of the next index to add to the output array
        int outputIndex = 0;

        // Print the input array
        System.out.print("Input array: ");
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println();

        // Iterate over each element in the input array
        for (int i = 0; i < input.length; i++) {
            // Check if the element is even
            if (input[i] % 2 == 0) {
                // If it is even, add it to the output array at the next available index
                output[outputIndex] = input[i];

                // Increment the output index so that the next even number will be added at the next available index
                outputIndex++;
            }
        }

        // Print the even elements of the input array that were copied to the output array
        System.out.print("Even elements in array: ");
        for (int i = 0; i < outputIndex; i++) {
            System.out.print(output[i] + " ");
        }
        System.out.println();
    }
}
