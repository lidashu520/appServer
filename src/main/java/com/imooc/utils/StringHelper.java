package com.imooc.utils;

import com.imooc.config.LogServiceTakeTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.*;

public class StringHelper {
    public static final String SPLID_PREFEX = "#####";

    final static Logger log = LoggerFactory.getLogger(StringHelper.class);


    public static String randUUID() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString().replaceAll("-", "");
    }

    public static boolean isNullOrEmpty(String name) {
        if (name == null) {
            return true;
        }
        if ("".equals(name)) {
            return true;
        }
        return false;
    }

    public static boolean isNotEmpty(String str) {
        return !isNullOrEmpty(str);
    }

    public static String buildKey(Object... objs) {
        String str = null;
        StringBuffer sb = new StringBuffer();
        for (Object obj : objs) {
            sb.append(obj.toString()).append("-");
        }
        if (sb.length() > 0) {
            str = sb.substring(0, sb.length() - 1);
        }
        return str;
    }

    public static String build(Object... objs) {
        StringBuffer sb = new StringBuffer();
        for (Object obj : objs) {
            sb.append(String.valueOf(obj.toString()));
            sb.append(SPLID_PREFEX);
        }
        return sb.substring(0, sb.length() - SPLID_PREFEX.length());
    }


    public static String build(Collection<Object> objs) {
        StringBuffer sb = new StringBuffer();
        for (Object obj : objs) {
            sb.append(String.valueOf(obj.toString()));
            sb.append(SPLID_PREFEX);
        }
        return sb.substring(0, sb.length() - SPLID_PREFEX.length());
    }

    public static String getIP(String name) {
        InetAddress address = null;
        try {
            address = InetAddress.getByName(name);
        } catch (UnknownHostException e) {
            e.printStackTrace();
            log.error("获取失败");
        }
        return address.getHostAddress().toString();
    }

    public static String sort(Object... objs) {
        List<String> list = new ArrayList<String>();
        for (Object obj : objs) {
            list.add(String.valueOf(obj.toString()));
        }
        Collections.sort(list);
        return build(list);
    }
}
