package edu.sdccd.cisc191.template;
import java.util.HashSet;
public class HashSetConsumer {
    private HashSet<String> list;
    public HashSetConsumer(HashSet<String> list) {
        this.list = list;
    }
    public boolean consume(String str) {
        if (list.contains(str)) {
            list.remove(str);
            return true;
        }
        else return false;
    }
}