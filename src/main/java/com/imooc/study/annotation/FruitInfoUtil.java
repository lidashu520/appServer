package com.imooc.study.annotation;

import java.lang.reflect.Field;

//注解处理器
public class FruitInfoUtil {
    public static void getFruitInfo(Class clazz) {
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            if(field.isAnnotationPresent(FruitProvider.class))   {
                FruitProvider fruitProvider = (FruitProvider) field.getAnnotation(FruitProvider.class);
                //注解信息的处理地方
           String  strFruitProvicer = " 供应商编号：" + fruitProvider.id() + " 供应商名称："+ fruitProvider.name() + " 供应商地址："+ fruitProvider.address();
           System.out.println(strFruitProvicer);
            }
        }
    }

    public static void main(String[] args) {
        getFruitInfo(Apple.class);
    }
}
