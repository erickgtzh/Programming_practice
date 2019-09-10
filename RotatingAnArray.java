//https://practice.geeksforgeeks.org/problems/reversal-algorithm/0/?track=sp-arrays-and-searching&batchId=152

package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();

        for(int i=0;i<first;i++){
            ArrayList<Integer> arrayList = new ArrayList<>();

            int second = scanner.nextInt();
            for (int j=0;j<second;j++){
                int rec = scanner.nextInt();
                arrayList.add(rec);
            }
            int order = scanner.nextInt();
            RotatingArray(arrayList,arrayList.size(),order);
            System.out.println("");
        }
    }

    private static void RotatingArray(ArrayList<Integer> arrayList, int len,int order) {
        for(int i=0;i<len;i++){
           // System.out.println("tam: "+ arrayList.size());
            System.out.print(arrayList.get((i+order)%len) + " ");
        }
    }
}
