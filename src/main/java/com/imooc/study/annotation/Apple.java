package com.imooc.study.annotation;

//注解使用
public class Apple {
    private  String name;
    private  int i;
    @FruitProvider(id = 1, name = "XX公司", address = "XX  路")
    private String appleProvider;
    public void setAppleProvider(String appleProvider){
        this.appleProvider = appleProvider;
    }
    public String getAppleProvider() {
        return appleProvider;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public int getI() {
        return i;
    }

    public void setI(int i){
        this.i = i;
    }



    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.setName("你好");
        apple.setI(1);
        Apple banana = apple;
        apple.setName("李雷");
        apple.setI(2);
        System.out.println(banana.getName());
        System.out.println(banana.getI());
    }



}




