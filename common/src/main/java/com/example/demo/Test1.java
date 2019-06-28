package com.example.demo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * copy 项目的java文件
 */
public class Test1 {
    public static void main(String[] args) throws Exception{

        String path ="C:\\File\\lis_biz_frame-master\\lis_biz_system_bl\\src\\main\\java\\com\\sinosoft\\lis";
        String targetPath ="C:\\File\\SVN\\lis_biz_new\\lis_biz_aml\\lis_biz_aml_java\\src\\main\\java\\com\\sinosoft";
        String srcPre ="C:\\File\\SVN\\lis_biz_new\\lis_biz\\lis_biz_java\\src\\main\\java\\com\\sinosoft";
        getFile(path,targetPath,srcPre);
//        test2();
    }
    private static void getFile(String path,String targetPath,String srcPre) throws Exception {
        File file = new File(path);
        File[] array = file.listFiles();
        List<String> tableNames = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i].isFile()) {
                tableNames.add(array[i].getName());
                test2(targetPath,srcPre,tableNames);
            } else if (array[i].isDirectory()) {
                String directoryPath = array[i].getPath();
                int index = directoryPath.indexOf("sinosoft");
                String s = directoryPath.substring(index);
                System.out.println("绝对路径"+s);
                int targetIndex = targetPath.indexOf("sinosoft");
                String targetNeedPath = targetPath.substring(0,targetIndex);
                String tasgetPathENnd = targetNeedPath+s;
                int srcIndex = srcPre.indexOf("sinosoft");
                String srcNeedPath = srcPre.substring(0,srcIndex);
                String srcPathENnd = srcNeedPath+s;
                getFile(array[i].getPath(),tasgetPathENnd,srcPathENnd);
            }
        }
    }

    public static void test2(String targetPath,String srcPre,List<String> tableNames) {
        File folds = new File(srcPre);
//        System.out.println("folds"+folds.getPath());
        File[] files = folds.listFiles();
        if(files == null){
            System.out.println(srcPre+"空了");
            return;
        }
        File fileEx = new File(targetPath);
        if (!fileEx.exists()){
            System.out.println("111111111111111创建文件夹"+targetPath);
            fileEx.mkdirs();
        }
        for (File file : files) {
            String foldName = file.getName();
            for (String table:tableNames){
                if (table.equals(foldName)){
                    System.out.println("要复制的文件名：：：" +foldName);
                    file.renameTo(new File(targetPath + "\\" + foldName));
                }
            }
        }
    }

}
