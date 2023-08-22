package method;

import java.util.ArrayList;

class SignCard {
    public int dateCode;
    public String name;

    public SignCard(int dateCode, String name) {
        this.dateCode = dateCode;
        this.name = name;
    }

    public boolean isValid() {
        return dateCode > 0 && dateCode < 10;
    }
}

public class Sign {
    void makeSign(ArrayList<SignCard> signList) throws Exception {
        if (!isAllValid(signList)) {
            throw new Exception();
        }
        sort(signList);
        doSigns(signList);
    }
    private boolean isAllValid(ArrayList<SignCard> signList) {
        for (SignCard tar : signList) {
            if (tar.isValid()) continue;
            return false;
        }
        return true;
    }

    private void sort(ArrayList<SignCard> signList) {
        for (int y = 0; y < signList.size(); y++) {
            for (int x = y + 1; x < signList.size(); x++) {
                if (signList.get(y).dateCode > signList.get(x).dateCode) {
                    SignCard temp = new SignCard(signList.get(y).dateCode, signList.get(y).name);
                    signList.get(y).dateCode = signList.get(x).dateCode;
                    signList.get(y).name = signList.get(x).name;
                    signList.get(x).dateCode = temp.dateCode;
                    signList.get(x).name = temp.name;
                }
            }
        }
    }

    private void doSigns(ArrayList<SignCard> signList) {
        for (SignCard tar : signList) {
            System.out.println(tar.dateCode + " : " + tar.name);
        }
    }


    public static void main(String[] args) {
        Sign sign = new Sign();
        ArrayList<SignCard> arr = new ArrayList<>();
        arr.add(new SignCard(5, "KFC"));
        arr.add(new SignCard(1, "JASON"));
        arr.add(new SignCard(2, "LUCKY"));

        try {
            sign.makeSign(arr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}