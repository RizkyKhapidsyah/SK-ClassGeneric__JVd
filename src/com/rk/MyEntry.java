/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rk;

public class MyEntry<K, V> {

    private final K key;
    private final V value;

    public MyEntry(K k, V v) {
        key = k;
        value = v;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "(" + key + ", " + value + ")";
    }
}
