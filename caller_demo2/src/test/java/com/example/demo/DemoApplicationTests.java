package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void testMonth(){
        int year = 2014;
        int length = 9;
        int count = 0;
        int[] years = new int[length];
        for (int i=length/2;i>0;i--){
            years[count] = year-i;
            count++;
        }
        years[count] = year;

        for (int i =1;i<=length/2;i++){
            count++;
            years[count] = year+i;
        }

        for (int ye:years){
            System.out.print(ye+",");
        }
    }

    @Test
    public void testYear(){
        int year = 2014;
        int length = 9;
        int[] years = new int[length];
        int middleYear = length/2;
        int beginYear = year-middleYear;
        for (int i =0;i<length;i++){
            years[i] = beginYear+i;
        }
        for (int ye:years){
            System.out.print(ye+",");
        }
    }
}
