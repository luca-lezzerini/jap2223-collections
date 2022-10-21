/*
 */
package com.iad.collections;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author use
 */
public class Collections {

    public static void main(String[] args) {
        int limit = 1_000_000;
        List<Integer> al = new ArrayList<>();
        List<Integer> ll = new LinkedList<>();
        Instant i1 = Instant.now();
        for (int i = 0; i < limit; i++) {
            al.add(0,i);
        }
        Instant e1 = Instant.now();
        Duration d1 = Duration.between(i1, e1);
        Instant i2 = Instant.now();
        for (int i = 0; i < limit; i++) {
//            ll.add(i);
            ll.add(0, i);
        }
        Instant e2 = Instant.now();
        Duration d2 = Duration.between(i2, e2);
        Instant i3 = Instant.now();
        for (int i = 0; i < limit; i++) {
//            al.remove(0);
        }
        Instant e3 = Instant.now();
        Duration d3 = Duration.between(i3, e3);
        Instant i4 = Instant.now();
        for (int i = 0; i < limit; i++) {
//            ll.remove(0);
        }
        Instant e4 = Instant.now();
        Duration d4 = Duration.between(i4, e4);
        System.out.println("ArrayList adding " + d1.toMillis());
        System.out.println("LinkedList adding " + d2.toMillis());
        System.out.println("ArrayList removing " + d3.toMillis());
        System.out.println("LinkedList removing " + d4.toMillis());
    }
}
