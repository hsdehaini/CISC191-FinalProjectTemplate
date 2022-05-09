package edu.sdccd.cisc191.template;
import java.util.HashSet;
public class HashSetProducer {
    private HashSet<String> list;
    public HashSetProducer(HashSet<String> list) {
        this.list = list;
    }
    public boolean produce(String str) {
        if (list.contains(str)) {
            return false;
        } else {
            list.add(str);
            return true;
        }
    }
}