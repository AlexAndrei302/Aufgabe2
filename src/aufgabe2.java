public class aufgabe2 {

    // 1) findet die größte Zahl im Array
    public int findMax(int[] arr) {
        int max = arr[0];           // starte mit erster Zahl
        for (int n : arr) {         // gehe alle Zahlen durch
            if (n > max) {          // wenn Zahl größer ist
                max = n;            // ersetze max
            }
        }
        return max;                 // gib das Maximum zurück
    }
}

