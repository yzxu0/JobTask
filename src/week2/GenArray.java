package week2;

public class GenArray {
    public int[] GenArrayProcess() {
        int[] arr = new int[1000];
        for (int i = 0; i < 1000; i++) {
            arr[i] = i * (i % 2 == 1 ? 1 : -1);
        }
        return arr;
    }
}
