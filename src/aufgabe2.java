
public class aufgabe2 {


    public int findMax(int[] arr) {
        int max = arr[0];
        for (int n : arr) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }


    public int findMin(int[] arr) {
        int min = arr[0];
        for (int n : arr) {
            if (n < min) {
                min = n;
            }
        }
        return min;
    }


    public int maxSum(int[] arr) {
        int sum = 0;
        for (int n : arr) sum += n;
        int min = findMin(arr);
        return sum - min;
    }


    public int minSum(int[] arr) {
        int sum = 0;
        for (int n : arr) sum += n;
        int max = findMax(arr);
        return sum - max;
    }

    public static void main(String[] args) {
        aufgabe2 a2 = new aufgabe2();

        int[] numbers = {4, 8, 3, 10, 17};

        System.out.println("---- Aufgabe 2 ----");


        System.out.println("Max: " + a2.findMax(numbers));


        System.out.println("Min: " + a2.findMin(numbers));
        System.out.println("Max Summe (n-1): " + a2.maxSum(numbers));


        System.out.println("Min Summe (n-1): " + a2.minSum(numbers));
    }
}
