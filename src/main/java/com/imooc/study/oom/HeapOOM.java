package com.imooc.study.oom;

import java.util.ArrayList;
import java.util.List;

public class HeapOOM {
    /**
     *VM Args：-Xms20m-Xmx20m-XX：+HeapDumpOnOutOfMemoryError
     *@author zzm
     */
    static class OOMObject{
    }

    public static void main(String[] args) {
        List<OOMObject> list=new ArrayList<OOMObject>();
        while(true){
            list.add(new OOMObject());
        }

    }
}
