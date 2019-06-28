package com.example.redisdemo;

import java.io.InputStream;
import java.util.Properties;

public class test {
    private static  String URL = null;//数据库地址
    private static  String name = null;//登录名称
    private static  String pwd = null;//密码
    private static  String Driver = null;
    static InputStream  in = null;
    static{
        try{
            Properties properties = new Properties();
            in = ClassLoader.getSystemResourceAsStream("jdbc.properties");
            properties.load(in);
            Driver = properties.getProperty("jdbc.Driver");
            URL = properties.getProperty("jdbc.Url");
            name = properties.getProperty("jdbc.UserName");
            pwd = properties.getProperty("jdbc.PassWord");
            System.out.println("读取配置信息成功！");
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("读取配置信息失败！");
        }finally{
            if(in != null){
                try{
                    in.close();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
    public static void main(String[] args) {

        System.out.println(Driver+"::"+URL+"::"+name+"::"+pwd);
    }
}
