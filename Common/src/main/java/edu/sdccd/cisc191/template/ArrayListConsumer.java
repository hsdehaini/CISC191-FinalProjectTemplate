package edu.sdccd.cisc191.template;
import java.util.ArrayList;
public class ArrayListConsumer
{
    private ArrayList<String> list;
    public ArrayListConsumer(ArrayList<String> list)
    {
        this.list = list;
    }
    public String consume()
    {
        String test = list.get(0);
        list.remove(0);
        return test;
    }
}