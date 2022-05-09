package edu.sdccd.cisc191.template;

public class ArrayProducer {
    private String list[];
    public ArrayProducer(String list[])
    {
        this.list = list;
    }
    public void produce(int i, String str)
    {
        list[i] = str;
    }
}