package refactoring;

public class example2_result {
    public static void main(String[] args) {
        System.out.println(getResult("25+61=86"));
        System.out.println(getResult("12345+12345=24690"));
        System.out.println(getResult("5++5=10"));
        System.out.println(getResult("10000+1=10002"));
    }

    private static String getResult(String str) {
        int plusCnt = getSymbolCnt('+', str);
        int plusIndex = getSymbolIndex('+', str);
        int equalCnt = getSymbolCnt('=', str);
        int equalIndex = getSymbolIndex('=', str);

        if (!isValidSymbol(str)) return "ERROR";
        if (plusCnt != 1 || equalCnt != 1) return "ERROR";
        if (plusIndex < 1 || equalIndex < 3 || equalIndex >= str.length() - 1 || plusIndex >= equalIndex) return "ERROR";

        int n1 = Integer.parseInt(str.substring(0, plusIndex)); // [0,plusIndex)
        int n2 = Integer.parseInt(str.substring(plusIndex + 1, equalIndex)); // [plusIndex+1,equalIndex)
        int n3 = Integer.parseInt(str.substring(equalIndex + 1));// [equalIndex+1,)
        if (n1 + n2 == n3) {
            return "PASS";
        } else {
            return "FAIL";
        }
    }

    private static int getSymbolIndex(char symbol, String str) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != symbol) continue;
            result = i;
        }
        return result;
    }

    private static int getSymbolCnt(char symbol, String str) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != symbol) continue;
            result++;
        }
        return result;
    }

    private static boolean isValidSymbol(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '+') continue;
            if (str.charAt(i) == '=') continue;
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') continue;
            return false;
        }
        return true;
    }
}