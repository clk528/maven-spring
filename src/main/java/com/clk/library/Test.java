package com.clk.library;

public class Test {
	static String publicKey;  
    static String privateKey;
    
    /*static {  
        try {  
            Map<String, Object> keyMap = RSAUtils.genKeyPair();  
            publicKey = RSAUtils.getPublicKey(keyMap);  
            privateKey = RSAUtils.getPrivateKey(keyMap);  
            System.err.println("公钥: \n\r" + publicKey);  
            System.err.println("私钥： \n\r" + privateKey);  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }*/ 
    static void test() throws Exception {  
        System.err.println("公钥加密——私钥解密");  
        String source = "这是一行没有任何意义的文字，你看完了等于没看，不是吗？";  
        System.out.println("\r加密前文字：\r\n" + source);  
        byte[] data = source.getBytes();  
        byte[] encodedData = RSAUtils.encryptByPublicKey(data, publicKey);  
        System.out.println("加密后文字：\r\n" + new String(encodedData));  
        byte[] decodedData = RSAUtils.decryptByPrivateKey(encodedData, privateKey);  
        String target = new String(decodedData);  
        System.out.println("解密后文字: \r\n" + target);  
    }
    static void testSign() throws Exception {  
        System.err.println("私钥加密——公钥解密");  
        String source = "这是一行测试RSA数字签名的无意义文字";  
        System.out.println("原文字：\r\n" + source);  
        byte[] data = source.getBytes();  
        byte[] encodedData = RSAUtils.encryptByPrivateKey(data, privateKey);  
        System.out.println("加密后：\r\n" + new String(encodedData));  
        byte[] decodedData = RSAUtils.decryptByPublicKey(encodedData, publicKey);  
        String target = new String(decodedData);  
        System.out.println("解密后: \r\n" + target);  
        System.err.println("私钥签名——公钥验证签名");  
        String sign = RSAUtils.sign(encodedData, privateKey);  
        System.err.println("签名:\r" + sign);  
        boolean status = RSAUtils.verify(encodedData, publicKey, sign);  
        System.err.println("验证结果:\r" + status);  
    }
    static void test3(String source)  throws Exception {
    	String PRIVATEKEY ="+Oe1tvpmHZqv3G1bqchjnPCClhpZ81xX+bG13yPQoWtggFlVeigCZ1CtI5PI/KMlu9IdSTduJWV3bqS9c07BQi9COloft4rAiSmboXBcJ6PyxnZdND4u5vf0itYkdOnLJGNdnQU+OQX2stTHBvHjK5i+ENpntAgMBAAECgYEAkFljPOSOklCfFPFAGbrl5DHwAQFd+YQ8JATZMPjHVduSlUo3PG3nornkDgsZit4sVmO7VzZmkVWFM/U93sHIdYBkZrE5aNdky9z4d9cxPgAnGmd27GbFvbaFE61gIAyfbvQK0HyuTk25vhXgfjdZ7Vuneygo8uj5cns12wnsg0ECQQDVJWbw8fLkfpndF+2vgg436C94WZByTMZ9hj6FebHORLNo5XWB1HaZAkhwjNckAebsv3gwP0XSldkYB52f98+JAkEAvmer1dceeJmTeG+rg9g/ZUDsqEDfQcXipYwdUne7z4gsCFrUzHZBnJhHYc+M8uVVVhy9fkvZeqI0BHr/nOnaRQJBAJy5pMjUTzJeOMrOdnIP4l6PdqA60zCIbYcM99nzUp+F+pnN5ypwzEfT2uoPVX5fe6pnW3u2eqPOlVPK/ccLU2kCQAfvNAbuNvPZmn6bUK9m1IV4piQAyAzqnR4+733fRXFJgGQ8vL9kcil/YwIdbwc0LVEwU2ku6folRjulkH9Oc20CQQCj45Z2wneYS3qdU3mGb3x/uRUR/V6A1xOuA5imNGTzPGY6wVS5RcIYXxpH6AnXPkWsJ1rQLLgWa8BSR2+lahq+";

        byte[] decodedData = RSAUtils.decryptByPrivateKey(source.getBytes(), PRIVATEKEY);  
        String target = new String(decodedData);  
        System.out.println("解密后: \r\n" + target);  
        /*System.err.println("私钥签名——公钥验证签名");  
        String sign = RSAUtils.sign(encodedData, privateKey);  
        System.err.println("签名:\r" + sign);  
        boolean status = RSAUtils.verify(encodedData, publicKey, sign);  
        System.err.println("验证结果:\r" + status); */
    	
    }
	public static void main(String[] args) throws Exception {
		//test();
		//System.out.println("============================");
		test3("Clkd44ozf24Q4E0UHZvcuT5OsOOzXH1iLdJSErZMypYSxdRe01E1LrShUnHBhCbFXW4xkdU+zoTSj5piCK36hPlfEH/+AJa8Er3yUh1PJbQnJ6TJ4UljBsk8Hnuk9P6B8vPhKC39bvamLdxU36MXS4kQyO+T/DF4zPMmJ+l14fc=");
		//testSign(); 
	}
}
