public class BubbleSortExample {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 60, 35, 2, 45, 320, 5};

        System.out.println("Array before bubble sort:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println(); 

       
        bubbleSort(arr);

        System.out.println("Array after bubble sort:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println(); 
    }
}
