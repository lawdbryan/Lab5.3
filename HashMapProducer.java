package edu.sdccd.cisc191;

import java.util.HashMap;
import java.util.Map;

public class HashMapProducer {
    Map<String, String> map;
    public HashMapProducer(HashMap<String, String> map) {
        this.map = map;
    }
    public void produce(String key, String value){
        map.put(key, value);
    }
}
