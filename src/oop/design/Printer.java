package oop.design;

import java.util.ArrayList;

interface ISort {
    public void sort(ArrayList<Integer> alist) ;
}
class BubbleSort implements ISort {
    @Override
    public void sort(ArrayList<Integer> alist) {
        bubbleSort(alist);
    }

    private void bubbleSort(ArrayList<Integer> alist) {
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
}
class SelectionSort implements ISort {
    @Override
    public void sort(ArrayList<Integer> alist) {
        selectionSort(alist);
    }

    private void selectionSort(ArrayList<Integer> alist) {
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
}

class SortPrinter {
    private ArrayList<Integer> alist;
    private ISort algo;
    public SortPrinter(){
        alist = new ArrayList<>();
    }

    public void insert(int val) {
        alist.add(val);
    }
    public void select(ISort sort){
        this.algo = sort;
    }
    public void run() {
        this.algo.sort(alist);
    }
    public void show() {
        System.out.println(alist);
    }
}

public class Printer {
    public static void main(String[] args) {
        SortPrinter s = new SortPrinter();
        s.insert(3);
        s.insert(2);
        s.insert(1);
        s.insert(5);
        s.insert(9);
        s.insert(4);

        s.select(new BubbleSort());
        s.run();
        s.show();
    }
}