package method;


import java.util.ArrayList;

class Node {
    public int dateCode;
    public String name;

    public Node(int dateCode, String name) {
        this.dateCode = dateCode;
        this.name = name;
    }
}

public class firstSign {

    void makeSign(ArrayList<Node> signList) throws Exception {
        //1. 서명 정렬하기
        for (int y = 0; y < signList.size(); y++) {
            for (int x = y + 1; x < signList.size(); x++) {
                if (signList.get(y).dateCode > signList.get(x).dateCode) {
                    Node temp = new Node(signList.get(y).dateCode, signList.get(y).name);
                    signList.get(y).dateCode = signList.get(x).dateCode;
                    signList.get(y).name = signList.get(x).name;
                    signList.get(x).dateCode = temp.dateCode;
                    signList.get(x).name = temp.name;
                }
            }
        }

        //2. valid 검사
        boolean flag = false;
        for (Node tar : signList) {
            if (tar.dateCode > 0 && tar.dateCode < 10) continue;
            flag = true;
            break;
        }

        if (flag == true) {
            throw new Exception();
        }
        else {
            //3. 서명하기
            for (Node tar : signList) {
                System.out.println(tar.dateCode + " : " + tar.name);
            }
        }
    }

    public static void main(String[] args) {
        firstSign sign = new firstSign();
        ArrayList<Node> arr = new ArrayList<>();
        arr.add(new Node(5, "KFC"));
        arr.add(new Node(1, "JASON"));
        arr.add(new Node(2, "LUCKY"));

        try {
            sign.makeSign(arr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}