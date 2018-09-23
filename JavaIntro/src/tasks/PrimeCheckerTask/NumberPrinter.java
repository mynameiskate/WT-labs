package tasks.PrimeCheckerTask;

import java.util.ArrayList;

public class NumberPrinter {

    public static void printList(ArrayList<Integer> numberList,
                          String title, String defaultText) {
        System.out.println(title);

        if (numberList.size() > 0) {
            for(Integer x : numberList) {
                System.out.print(String.format(" %d", x));
            }
        } else {
            System.out.println(defaultText);
        }
    }

}
