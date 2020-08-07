package net.Collections;

import net.arrays.RandomGenerator;

import java.util.ArrayList;
import java.util.HashSet;

public class CollectionDataGeneration {
    public static void main(String[] args) {
        System.out.println(new ArrayList<String>(
                CollectionData.list(
                        new RandomGenerator.String(9), 10)));
        System.out.println(new HashSet<Integer>(
                new CollectionData<>(
                        new RandomGenerator.Integer(), 10)));
    }
}
