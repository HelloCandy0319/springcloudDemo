package com.example.demo;

import java.util.Arrays;

public class JdkTest {
    public static void main(String[] args) {
        String sempator = ",";
        Arrays.asList("a","b","c").forEach(e->{
            if (e.equals("a") || e.equals("c")){
                System.out.print(e+sempator);
            }
        });
    }
}
