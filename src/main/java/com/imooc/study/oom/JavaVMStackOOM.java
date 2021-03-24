package com.imooc.study.oom;

/**
 *VM Args��-Xss2M(��ʱ�򲻷����ô�Щ
 *@author zzm
 */
public class JavaVMStackOOM{
    private void dontStop(){
        while(true){
        }
    }
    public void stackLeakByThread(){
        while(true){
            Thread thread=new Thread(new Runnable(){
                @Override
                public void run(){
                    dontStop();
                }
            });
            thread.start();
        }
    }
    public static void main(String[]args)throws Throwable{
        JavaVMStackOOM oom=new JavaVMStackOOM();
        oom.stackLeakByThread();
    }
}
