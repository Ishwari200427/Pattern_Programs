import java.util.*;

class Rotate_Array_By_K_Position {

    public static void main(String args[]) {

        int arr[] = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1. Rotate Right");
            System.out.println("2. Rotate Left");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");

            int dir = sc.nextInt();

            switch (dir) {

                case 1:
                    RotateRight(2, arr);
                    System.out.println(Arrays.toString(arr));
                    break;

                case 2:
                    RotateLeft(2, arr);
                    System.out.println(Arrays.toString(arr));
                    break;

                case 3:
                    System.exit(0);

                default:
                    System.out.println("Enter Valid Choice");
            }
        }
    }

    public static void RotateLeft(int k, int arr[]) {

        k = k % arr.length;

        Reverse(arr, 0, k - 1);
        Reverse(arr, k, arr.length - 1);
        Reverse(arr, 0, arr.length - 1);
    }

    public static void RotateRight(int k, int arr[]) {

        k = k % arr.length;

        Reverse(arr, arr.length - k, arr.length - 1);
        Reverse(arr, 0, arr.length - k - 1);
        Reverse(arr, 0, arr.length - 1);
    }

    public static void Reverse(int arr[], int start, int end) {

        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
