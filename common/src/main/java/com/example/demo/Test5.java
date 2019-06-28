package com.example.demo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Test5 {
    public static void main(String[] args) {
        String[] strings = {
                "CalTask2009051214.java",
                "CrontabParser.java",
                "Ftp.java",
                "RIAccRDDetailBL.java",
                "SendUWReInsureBL.java",
               "RITempConclusionBL.java",
                "RIWFManage.java"

        };
        String path ="C:\\File\\com";
        List<String> result = new ArrayList<>();
       List<String> res= getFileName(path,result);
       List<String> names = new ArrayList<>();
       for (String s:strings){
           for (String s1:res){
               int lastIndex = s1.lastIndexOf("\\");
               String name = s1.substring(lastIndex+1,s1.length());
               if (s.equals(name)){
                   names.add(s1);
               }
           }
       }
       System.out.println(strings.length);
       for (String name: names){
           System.out.println(name);
       }
       System.out.println(names.size());

    }

    public static List<String> getFileName(String path,List<String> res){
        File files = new File(path);
        File[] array = files.listFiles();
        for (File file: array){
            if (file.isFile()){
                res.add(file.getPath());
            }else{
                getFileName(file.getPath(),res);
            }
        }
        return res;
    }
}
