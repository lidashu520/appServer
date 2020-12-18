package com.imooc.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Utils {
	public static String getPassword(String pwd,String encryt){
		return string2MD5(string2MD5(pwd)+encryt);
	}
	public static String toRadix(int data,int radix){
        char[] digits={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char buf[] = new char[33];
        int charPos = 32;
        
        while(data>radix){
            buf[charPos--]=digits[data % radix];
            data=data/radix;
        }
        buf[charPos] = digits[data];
        return new String(buf, charPos, (33 - charPos));    
    }
	public static String string2MD5(String str){  
		if(str==null){
			return "a";
		}
		MessageDigest messageDigest = null;  
		try {  
	    	messageDigest = MessageDigest.getInstance("MD5");  
	    	messageDigest.reset();  
	    	messageDigest.update(str.getBytes("UTF-8"));  
		 } catch (NoSuchAlgorithmException e) {  
		     System.out.println("NoSuchAlgorithmException caught!");  
		     System.exit(-1);  
		 } catch (UnsupportedEncodingException e) {  
		     e.printStackTrace();  
		 }  
		 byte[] byteArray = messageDigest.digest();  
		 StringBuffer md5StrBuff = new StringBuffer();  
		 for (int i = 0; i < byteArray.length; i++) {              
		     if (Integer.toHexString(0xFF & byteArray[i]).length() == 1)  
		         md5StrBuff.append("0").append(Integer.toHexString(0xFF & byteArray[i]));  
		     else  
		         md5StrBuff.append(Integer.toHexString(0xFF & byteArray[i]));  
		 }  
		 return md5StrBuff.toString(); 
    }  
}
