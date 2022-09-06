package md5;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author zhaoyinghao
 * @decription MD5加密算法
 * @date 2022/2/28
 */
public class MD5Test {

    public static void main(String[] args) {
        MD5Test md5Test = new MD5Test();
        System.out.println(md5Test.getMD5String("22223333333333333333123123123123123123123123123123123123123123123123"));
    }

    public String getMD5String(String str) {
        byte[] secretBytes = null;
        try {
            secretBytes = MessageDigest.getInstance("md5").digest(str.getBytes());
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("没有这个md5算法！");
        }
        StringBuilder md5code = new StringBuilder(new BigInteger(1, secretBytes).toString(16));
        for (int i = 0; i < 16 - md5code.length(); i++) {
            md5code.insert(0, "0");
        }
        return md5code.toString();
    }

}
