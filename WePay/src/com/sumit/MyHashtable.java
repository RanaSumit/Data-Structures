package com.sumit;
import java.io.*;
import java.util.*;

public class MyHashtable<K, V> {
    public static void main(String args[]) throws Exception {
        new TestHarness(new MyHashtable<String, String>()).run();
    }
    private K k;
    private V v;
    public void put(K key, V value) {
        if(key!=null && value!=null)
        {
            v = value;
            k = key;
        }
    }

    public V get(K key) {
        if(k.equals(key))
            return v;

        return  null;
    }

    /**
     * A helper class that tests MyHashtable by feeding it puts and gets from STDIN.
     */
    public static class TestHarness implements Runnable {
        final MyHashtable<String, String> hashtable;

        public TestHarness(MyHashtable<String, String> hashtable) {
            this.hashtable = hashtable;
        }

        public void run() {
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNext()) {
                String k = scanner.next();
                String v = null;

                if (k.contains("=")) {
                    String[] split = k.split("\\=");
                    System.out.print("K" + split[0]);

                    try {
                        if(!split[0].equals(null) && !split[1].equals(null)){
                            k = split[0];
                            v = split[1];
                            System.out.print("V" + split[1]);
                        }
                    }catch (Exception e){
                        System.out.print(e);
                    }




                }
                if (v == null) {
                    System.out.println(hashtable.get(k));
                } else {
                    hashtable.put(k, v);
                }
            }
        }
    }
}

