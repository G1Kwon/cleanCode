package oop.design;

import java.util.ArrayList;

public class Sort {

    static void bubbleSort(ArrayList<Integer> alist) {
        for(int cycle = 0 ; cycle < alist.size(); cycle ++) {
            for(int i = 0 ; i < alist.size() - 1 - cycle ; i ++){
                if(alist.get(i) > alist.get(i + 1)){
                    // swap
                    int tmp = alist.get(i);
                    alist.set(i,alist.get(i + 1));
                    alist.set(i + 1, tmp);
                }
            }
        }
    }

    static void selectionSort(ArrayList<Integer> alist) {
        for(int smallIndex = 0 ; smallIndex < alist.size(); smallIndex ++){
            for(int i = smallIndex + 1; i < alist.size(); i ++) {
                if(alist.get(smallIndex) > alist.get(i)){
                    // swap
                    int tmp = alist.get(smallIndex);
                    alist.set(smallIndex,alist.get(i));
                    alist.set(i, tmp);
                }
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> alist = new ArrayList<>();
        alist.add(3);
        alist.add(1);
        alist.add(2);
        alist.add(7);
        alist.add(8);
        alist.add(2);
        selectionSort(alist);
        System.out.println(alist);
    }
}