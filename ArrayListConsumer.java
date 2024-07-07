package edu.sdccd.cisc191;

import java.util.ArrayList;
import java.util.List;

public class ArrayListConsumer
{
    private List<String> list;

    public ArrayListConsumer(ArrayList<String> list)
    {
        this.list = list;

    }

    public String consume()
    {
        return list.removeFirst();
    }

}