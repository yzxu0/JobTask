import week2.GenArray;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

        InvokWeek2();

        System.out.println("Hello World!");
    }

    private static void InvokWeek2() {
        Calendar call1 = Calendar.getInstance();

        int[] arr = new GenArray().GenArrayProcess();

        Calendar call2 = Calendar.getInstance();

        System.out.println("耗时:" + (call2.getTimeInMillis() - call1.getTimeInMillis()) + "Millis");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
