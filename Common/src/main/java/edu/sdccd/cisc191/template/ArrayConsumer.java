package edu.sdccd.cisc191.template;
public class ArrayConsumer {
    private String[] list;
    private int count = 0;
    public ArrayConsumer(String[] list)
    {
        this.list = list;
    }
    public String consume()
    {
        String test = list[count];
        count++;
        return test;
    }
}