package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int[] a = {6, 0, 2, 1};
        boolean flag = true;

        for (int i = 0; i < a.length - 1; i++) {
            if(a[i]<a[i+1]){
                flag = false;
            }
        }
        if(flag){
            System.out.println("true");
        }else{
            System.out.println("false");

        }
    }
}