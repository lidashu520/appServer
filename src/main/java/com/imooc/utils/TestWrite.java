package com.imooc.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestWrite {
    public static void writerText(String path, String content) {

        File dirFile = new File(path);

        if (!dirFile.exists()) {
            dirFile.mkdir();
        }

        try {
            long start = System.currentTimeMillis();

            for(int i=0; i<100; i++){

                BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
                writer.newLine();// windows linux 通用
                writer.flush();
                writer.close();
            }
            long end = System.currentTimeMillis();
            long hour = (end -start)/1000/60;
            System.out.println(hour);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        writerText("D:\\Test.txt", "2014-07-14 23:43:00");
    }

    public static void replaceAll(StringBuilder builder, String from, String to)
    {
        int index = builder.indexOf(from);
        while (index != -1)
        {
            builder.replace(index, index + from.length(), to);
            index += to.length(); // Move to the end of the replacement
            index = builder.indexOf(from, index);
        }
    }
}
