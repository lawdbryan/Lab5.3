package edu.sdccd.cisc191;

public class ArrayConsumer {
    private String[] arr;


    public ArrayConsumer(String[] stringArr) {
        this.arr =  stringArr;
    }

    public String consume(){
        String value = arr[0];

        for(int i = 1; i < arr.length; i++){
            arr[i - 1] = arr[i];
        }
        return value;
    }

}
