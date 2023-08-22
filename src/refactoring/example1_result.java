package refactoring;

import java.util.ArrayList;

public class example1_result {
    public static int splitAndSum(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        return getSum(text.split("-"));
    }

    private static int getSum(String[] values) {
        int result = 0;
        for (Integer value : getIntegers(values)) {
            result += value;
        }
        return result;
    }

    private static ArrayList<Integer> getIntegers(String[] values) {
        ArrayList<Integer> alist = new ArrayList<>();
        for (String value : values) {
            alist.add(Integer.parseInt(value));
        }
        return alist;
    }

    public static void main(String[] args) {
        int ret = splitAndSum("55-22-33");
        System.out.println(ret);
    }

}