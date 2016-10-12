package com.llwwlql;

import org.apache.commons.codec.binary.Base64;

public class UseBase64 {	
	/** 
     * 二进制数据编码为BASE64字符串 
     * 
     * @param bytes 
     * @return 
     * @throws Exception 
     */ 
    public static String encode(final byte[] bytes) {  
        return new String(Base64.encodeBase64(bytes));
    }
    
	/** 
     * BASE64字符串解码为二进制 
     * 
     * @param bytes 
     * @return 
     * @throws Exception 
     */ 
	public static byte[] decode(final byte[] bytes) {  
        return Base64.decodeBase64(bytes);
    }
}
