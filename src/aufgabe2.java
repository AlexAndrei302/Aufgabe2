public class aufgabe2 {

    // 1) findet die größte Zahl im Array
    public int findMax(int[] arr) {
        int max = arr[0];
        for (int n : arr) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }
}

