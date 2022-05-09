package edu.sdccd.cisc191.template;
import java.util.HashMap;
public class HashMapConsumer {
    private HashMap<String, String> list;
    public HashMapConsumer(HashMap<String, String> list) {
        this.list = list;
    }
    public String consume(String str) {
        String test = list.get(str);
        return test;
    }
}