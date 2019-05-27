package de.tanev.labyrinth.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import de.tanev.labyrinth.model.renderer.Down;
import de.tanev.labyrinth.model.renderer.Left;
import de.tanev.labyrinth.model.renderer.Right;
import de.tanev.labyrinth.model.renderer.Up;

public class BinarySearch {
    private static BinarySearch bs;
    private ArrayList<Renderer> frames;
    private int pathCounter;
    private int[] array = new int[1024];
    private int toFind;
    private int left;
    private int right;

    public static BinarySearch getInstance(){
        if(bs == null)
            bs = new BinarySearch();
        return bs;
    }
    private BinarySearch() {
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
        toFind = array[r.nextInt(1024)];
        left = 0;
        right = array.length - 1;
        frames = new ArrayList<>();
        search();
        pathCounter = 0;
    }
    private void search() {
        boolean flipper = false;
        frames.add(new Up(array, left, right, toFind));
        while(left <= right) {
            int m = left + (right - left) / 2;
            if (array[m] == toFind) {
                if (flipper) frames.add(new Down(array, left, right, toFind));
                else frames.add(new Left(array, left, right, toFind));
                return;
            } else if(toFind < array[m]) {
                right = m - 1;
                if(flipper) frames.add(new Down(array, left, right, toFind));
                else frames.add(new Left(array, left, right, toFind));
            } else {
                left = m + 1;
                if(flipper) frames.add(new Up(array, left, right, toFind));
                else frames.add(new Right(array, left, right, toFind));
            }
            flipper = !flipper;
        }
    }
    public ArrayList<Renderer> getFrames() {
        return frames;
    }
    public int getPathCounter() {
        return pathCounter;
    }
    public void incrementPathCounter() {
        pathCounter++;
    }
}
