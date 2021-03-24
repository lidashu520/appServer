package com.imooc.study.oom;

/**
 * 1.8֮����MetaspaceSize����
 *VM Args��-XX��PermSize=10M-XX��MaxPermSize=10M
 *@author zzm
 */
public class RuntimeConstantPoolOOM{
    public static void main(String[]args){
////ʹ��List�����ų��������ã�����Full GC���ճ�������Ϊ
//        List<String> list=new ArrayList<>();
////10MB��PermSize��integer��Χ���㹻����OOM��
//        int i=0;
//        while(true){
//            list.add(String.valueOf(i++).intern());
//        }

//            String str1=new StringBuilder("�����").append("���").toString();
//            System.out.println("===========================");
//            System.out.println(str1.intern()==str1);
//            String str2=new StringBuilder("ja").append("va").toString();
//            System.out.println("----------------------------");
//            System.out.println(str2.intern()==str2);

        String str1 = "�����";
        String str2 = "�����";
        System.out.println("str1==str2:" + (str1 == str2));

        String str3 = new String("�����");
        System.out.println("str1==str3:" + (str1 == str3));
        System.out.println("str1==str3.intern():" + (str1 == str3.intern()));
        System.out.println("str2==str3.intern():" + (str2 == str3.intern()));

        String str4 = new String("�����");
        System.out.println("str3==str4:" + (str3 == str4));
        System.out.println("str3.intern()==str4.intern():" + (str3.intern() == str4.intern()));


        String str5 = new StringBuilder("���").append("����").toString();
        System.out.println("str5.intern() == str5:" + (str5.intern() == str5));

        String str6 = new String(new StringBuilder("������").append("����").toString());
        System.out.println("str6.intern() == str6:" + (str6.intern() == str6));

        String str7 = new String("������");
        System.out.println("str7.intern() == str7:" + (str7.intern() == str7));

        String str8 = "ja" + "va";
        String str9 = "j" +"ava";
        String str10 = "����" + "��";
        System.out.println(str1 == str10);
        System.out.println(str8 == str9);
        try {
            System.out.println(str10.toString());
        }catch (Exception e){
            e.printStackTrace();
        }



    }
}