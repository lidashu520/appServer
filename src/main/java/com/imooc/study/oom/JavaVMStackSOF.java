package com.imooc.study.oom;

/**
 *VM Args£º-Xss128k
 *@author zzm
 */
public class JavaVMStackSOF{
    private int stackLength=1;
    public void stackLeak(){
        stackLength++;
        System.out.println(stackLength);
        stackLeak();
    }
    public static void main(String[]args)throws Throwable{
        JavaVMStackSOF oom=new JavaVMStackSOF();
        try{
            oom.stackLeak();
        }catch(Throwable e){
            System.out.println("stack length£º"+oom.stackLength);
            throw e;
        }
    }
}
