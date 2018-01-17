package Test;


import org.apache.commons.codec.binary.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Aes {
	public static void 	main(String[] args) throws Exception{
        String a="{\"accountKey\":\"ACT180109103823921lfc12b\",\"province\":\"330000\",\"city\":\"330300\",\"district\":\"330303\",\"address\":\"打算大大萨达萨达\",\"fiixedPhone\":\"\",\"shopCategory\":\"0\",\"registerType\":\"1\",\"shopName\":\"测试季涛123\",\"classify\":\",GCD2fqxCejKidtdw9U,GC3PK6Y9oUdzw7fB2s,GCtFKgdjn1QMI3obeS\",\"linkName\":\"车少时诵诗书\",\"linkmanTel\":\"13333333333\",\"shopIcon\":\"http://10.108.26.242:8080/img/20180109/merchantset/0213310109104010109.png\",\"shopContent\":\"大萨达撒大打打多多多多多多多多多\"}";
       // String b="{\"accountKey\":\"ACTzZHx8lkNs<accountkey>\",\"flag\":\"1\",\"commCardFront\":\"http://10.108.26.242:8080/img/20180109/merchantset/2438400109104213082.png\",\"commCardBack\":\"http://10.108.26.242:8080/img/20180109/merchantset/2552450109104216587.png\",\"commBusLic\":\"http://10.108.26.242:8080/img/20180109/merchantset/4314410109104157149.png\",\"companyOrg\":\"http://10.108.26.242:8080/img/20180109/merchantset/6471360109104201936.png\",\"companyTaxReg\":\"http://10.108.26.242:8080/img/20180109/merchantset/7583360109104205656.png\",\"companyLic\":\"http://10.108.26.242:8080/img/20180109/merchantset/3006880109104209073.png\",\"personName\":\"测试测试测试123\",\"personCard\":\"333333333333333333\"}";
        //String c="{\"accountKey\":\"ACTzZHx8lkNs<accountkey>\",\"flag\":\"2\",\"commCardFront\":\"http://10.108.26.242:8080/img/20180109/merchantset/2438400109104213082.png\",\"commCardBack\":\"http://10.108.26.242:8080/img/20180109/merchantset/5421210109105525358.png\",\"commBusLic\":\"http://10.108.26.242:8080/img/20180109/merchantset/4314410109104157149.png\",\"companyOrg\":\"http://10.108.26.242:8080/img/20180109/merchantset/6471360109104201936.png \",\"companyTaxReg\":\"http://10.108.26.242:8080/img/20180109/merchantset/7583360109104205656.png\",\"companyLic\":\"http://10.108.26.242:8080/img/20180109/merchantset/3006880109104209073.png\",\"personName\":\"测试测试测试123222\",\"personCard\":\"333333333333333333\"}";

        String body1=new String(Test.Aes.EncryptByte(a.getBytes(),"fuzhongjtrj_2016"));
		System.out.println(body1);
	}
	String AES_DEFAULT_KEY = "fuzhongjtrj_2016";
	static String AES_DEFAULT_CONFIG = "AES/CBC/PKCS5Padding";
	static String AES_DEFAULT_IV = "0102030405060708";


	public static byte[] EncryptByte(byte[] sSrc, String sKey) throws Exception
			    {
			        if (sKey == null)
			        {
			            System.out.print("Key为空null");
			            return null;
			        }
			        // 判断Key是否为16位
			        if (sKey.length() != 16)
			        {
			            System.out.print("Key长度不是16位");
			            return null;
			        }
			        byte[] raw = sKey.getBytes();
			        SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
			        Cipher cipher = Cipher.getInstance(AES_DEFAULT_CONFIG);// "算法/模式/补码方式"
			        IvParameterSpec iv = new IvParameterSpec(AES_DEFAULT_IV.getBytes());// 使用CBC模式，需要一个向量iv，可增加加密算法的强度
			        cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);
			        byte[] encrypted = cipher.doFinal(sSrc);
			        // 此处使用BAES64做转码功能，同时能起到2次加密的作用。
			        return Base64.encodeBase64(encrypted);
			    }
	

}
