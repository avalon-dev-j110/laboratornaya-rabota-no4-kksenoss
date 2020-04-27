/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs;
import java.util.Comparator;

/**
 *
 * @author 1
 */
public class implComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String s1 = (String) o1;
        String s2 = (String) o2;
        if(s1.compareTo(s2) > 0) {
            return -5;}
        else if (s1.compareTo(s2) < 0) {
            return 6;
        } else
        return 0;
    }
}
