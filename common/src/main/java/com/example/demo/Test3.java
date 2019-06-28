package com.example.demo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {

        String deletePath = "C:\\File\\SVN\\lis_biz_new\\lis_biz\\lis_biz_java\\src\\main\\java\\com\\sinosoft\\lis";
        String fefPath = "C:\\File\\SVN\\lis_biz_new\\lis_msr\\lis_biz_msr_java\\src\\main\\java\\com\\sinosoft\\lis";
        List<String> tableNames = new ArrayList<>();
        List<String> deleteTableNames = new ArrayList<>();
        List<String> AllTableNames = new ArrayList<>();
        List<String> refTables = getFile(fefPath,tableNames);
        List<String> deleteTables = getFile(deletePath,deleteTableNames);
////       for (String s: refTables){
////           System.out.println(s);
////       }
////       System.out.println("Num is ："+refTables.size());
//        for (String s:deleteTableNames){
//            System.out.println(s);
//        }
//        System.out.println("Num is ："+deleteTableNames.size());
//        for (String refS: refTables){
//            HashMap hashMap = new HashMap();
//            hashMap.put(refS,1);
//            refTableHash.add(hashMap);
//        }
        for (String refS: refTables){
            for (String deleS:deleteTables){
//                int index = directoryPath.indexOf("sinosoft");
//                String s = directoryPath.substring(index);
//                System.out.println("绝对路径"+s);
//                int targetIndex = targetPath.indexOf("sinosoft");
//                String targetNeedPath = targetPath.substring(0,targetIndex);
//                String tasgetPathENnd = targetNeedPath+s;
//                int srcIndex = srcPre.indexOf("sinosoft");
//                String srcNeedPath = srcPre.substring(0,srcIndex);
//                String srcPathENnd = srcNeedPath+s;
                int refIndex = refS.indexOf("sinosoft");
                String refString = refS.substring(refIndex,refS.length());
                int delIndex = deleS.indexOf("sinosoft");
                String delString = deleS.substring(delIndex,deleS.length());
                if (refString.equals(delString)){
                    AllTableNames.add(deleS);
                }
            }
        }

        for (String s:AllTableNames){
            File file = new File(s);
            if (file.exists()){
                file.delete();
            }else{
                System.out.println("文件不存在");
            }
        }
        System.out.println(AllTableNames.size());



    }

    public static List<String> getFile(String refPath,List<String> tableNames){
        File refFile = new File(refPath);
        File [] refArray = refFile.listFiles();
        for (int i = 0; i < refArray.length; i++) {
            if (refArray[i].isFile()){
                tableNames.add(refArray[i].getPath());
            }else if (refArray[i].isDirectory()){
                String filePath = refArray[i].getPath();
                getFile(filePath,tableNames);
            }
        }
            return tableNames;
    }
}
