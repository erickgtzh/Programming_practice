//https://practice.geeksforgeeks.org/problems/immediate-smaller-element/0/?track=sp-arrays-and-searching&batchId=152

package com.training;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0;i<num;i++){
            int repet = sc.nextInt();
            for(int j=0;j<repet;j++){
                int to_add = sc.nextInt();
                arrayList.add(to_add);
            }
            arrayList.add(-1);
        }
        SmallerElement(arrayList);
    }

    public static void SmallerElement(ArrayList arrayList) {
        StringBuilder sb=new StringBuilder();

        for (int i=0;i<arrayList.size();i++){
            if((Integer)arrayList.get(i) == -1)    sb.append("\n");
            else{
                if((i==arrayList.size()-1) || ((Integer)arrayList.get(i) <= (Integer)arrayList.get(i+1)))   sb.append("-1 ");
                else sb.append(arrayList.get(i+1) + " ");
            }
        }
        System.out.print(sb);
    }
}
