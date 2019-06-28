package com.example.demo;

public interface Defaultable {
    default String notRequired(){
        return "Not Required";
    }

}
