public class Swap {

    static void Display(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        System.out.println("\nAfter Swapping:");
        for (int a = 0; a < arr.length; a++) {
            System.out.print(arr[a] + " ");
        }
    }

        public static void main(String[] args) {
            int arr[] = {10, 20, 30, 40, 50, 60};
            System.out.println("Before Swapping:");
            for (int a= 0; a < arr.length; a++) {
                System.out.print(arr[a] + " ");
            }
            Display(arr, 0, 5);

        }
    }

