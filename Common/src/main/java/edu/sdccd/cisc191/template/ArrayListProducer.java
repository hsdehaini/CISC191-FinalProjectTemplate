package edu.sdccd.cisc191.template;
import java.util.ArrayList;
public class ArrayListProducer
{
    private ArrayList<String> list;
    public ArrayListProducer(ArrayList<String> list)
    {
        this.list = list;
    }
    public void produce(int i, String str)
    {
        list.add(i, str);
    }
}