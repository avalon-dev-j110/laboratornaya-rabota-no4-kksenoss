package ru.avalon.java.dev.j10.labs;
import java.util.Arrays;
import java.util.Comparator;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1
 */

import java.util.Arrays;
import java.util.Comparator;

public class implSort implements Sort {
    @Override
    public void sort(Object[] array) {
        for (int i = 0; array.length > i; i++) {
            for (int j = 1; array.length > j; j++) {
                if (array[j].toString().compareTo(array[j-1].toString()) > 0 ){
                    Object bufer = array[j];
                    array[j] = array[j-1];
                    array[j-1] = bufer;

                }
            }
        }

    }

    @Override
    public void sort(Comparable[] array) {
       Arrays.sort(array);
    }

    @Override
    public void sort(Object[] array, Comparator comparator) {
        Arrays.sort(array, comparator);
    }
}