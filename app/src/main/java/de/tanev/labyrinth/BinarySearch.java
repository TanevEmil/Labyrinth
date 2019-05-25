package de.tanev.labyrinth;

import android.util.Log;

import java.util.Arrays;
import java.util.Random;

public class BinarySearch {
    private int[] array = new int[1024];
    private int findMe;
    public BinarySearch() {
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            int searchFor = r.nextInt(100_000);
            marker: for(int j = 0; j < i; j++) {
                if(array[j] == searchFor)
                    searchFor = r.nextInt(100_000);
                    continue marker;
            }
            array[i] = searchFor;
        }
        Arrays.sort(array);
        findMe = array[r.nextInt(1024)];
    }

    public int getFindMe() {
        return findMe;
    }

    public int[] getArray() {
        return array;
    }

}
