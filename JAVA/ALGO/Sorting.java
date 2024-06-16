package ALGO;

public class Sorting {
    public static void main(String[] args) {
        int data[] = {10, 6, 8, 4, 2, 9, 7, 1, 2, 3, 5};
        // insertionSort(data);
        // selectionSort(data);
        bubbleSort(data);
        printArray(data);
    }

    // print array
    static void printArray(int data[]) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }


    // Insertion Sort
    static void insertionSort(int data[]) {
        int size = data.length;
        for (int i = 1; i < size; i++) {
            int j = i-1;
            int key = data[i];
            while (j>=0 && data[j] > key) {
                data[j+1] = data[j];
                j--;
            }
            data[j+1] = key;
        }
    }

    // Selection Sort
    static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    // Bubble Sort
    static void bubbleSort(int arr[]) {
        boolean flag = true;
        for (int i = 0; i < arr.length - 1 && flag == true; i++) {
            flag = false;
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
        }
    }
}
