package edu.sdccd.cisc191;

public class ArrayProducer {
    private String[] arr;


    public ArrayProducer(String[] stringArr) {
        this.arr = stringArr;
    }

    public void produce(int i, String s){
        if(arr[i] != null) {
            for(int j = arr.length - 1; j > i; j--) {
                //TODO: handle growing the array when full, for now if there is a value in the last index, it gets dropped
                arr[j] = arr[j - 1];
            }
        }
        arr[i] = s;
    }
}
