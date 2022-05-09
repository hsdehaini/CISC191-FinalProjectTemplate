package edu.sdccd.cisc191.template;
import java.util.HashMap;
public class HashMapProducer {
    private HashMap<String, String > list;
    public HashMapProducer(HashMap<String, String> list) {
        this.list = list;
    }
    public void produce(String key, String str) {
        list.put(key, str);
    }
}