/*
 */
package com.iad.collections;

import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author use
 */
public class Maps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int limit = 1_000_000;
        int limit2 = 1_400_000;
        Map<Integer, Integer> tm = new TreeMap<>();
        Map<Integer, Integer> hm = new HashMap<>(limit2);
        Instant i1 = Instant.now();
        for (int i = 0; i < limit; i++) {
            tm.put(i, i);
        }
        Instant e1 = Instant.now();
        Duration d1 = Duration.between(i1, e1);
        System.out.println("Treemap put " + d1.toMillis());

        Instant i2 = Instant.now();
        for (int i = 0; i < limit; i++) {
            hm.put(i, i);
        }
        Instant e2 = Instant.now();
        Duration d2 = Duration.between(i2, e2);
        System.out.println("Hashmap put " + d2.toMillis());
    }

}
