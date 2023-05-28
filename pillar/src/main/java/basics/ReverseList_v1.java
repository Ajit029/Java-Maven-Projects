package basics;

import java.util.Arrays;

public class ReverseList_v1 {

    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};

        // Reverse the list.
        for (int i = 0; i < list.length / 2; i++) {
            int temp = list[i];
            list[i] = list[list.length - i - 1];
            list[list.length - i - 1] = temp;
        }

        // Print the new list.
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}

