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
// 2) findet die kleinste Zahl im Array
public int findMin(int[] arr) {
    int min = arr[0];
    for (int n : arr) {
        if (n < min) {
            min = n;
        }
    }
    return min;
}

void main() {
}
// 3) maximale Summe berechnen (n-1 Zahlen)
public int maxSum(int[] arr) {
    int sum = 0;
    for (int n : arr) sum += n;
    int min = findMin(arr);
    return sum - min;
}


