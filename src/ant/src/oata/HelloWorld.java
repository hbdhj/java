package ant.src.oata;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

public class HelloWorld 
{
	public static void main(String[] args)
	{
		System.out.println("Hello World!");
		try{
			String strInput = "Administrator";
			byte[] plainText=strInput.getBytes("UTF8");

			//通过KeyGenerator形成一个key
			System.out.println("\nStart generate AES key");
			KeyGenerator keyGen=KeyGenerator.getInstance("AES");
			keyGen.init(128);
			Key key=keyGen.generateKey();
			System.out.println("Finish generating DES key");

			//获得一个私?加密类Cipher，ECB是加密方式，PKCS5Padding是填充方法
			Cipher cipher=Cipher.getInstance("AES/ECB/PKCS5Padding");
			System.out.println("\n"+cipher.getProvider().getInfo());

			//使用私?加密
			System.out.println("\nStart encryption:");
			cipher.init(Cipher.ENCRYPT_MODE,key);
			byte[] cipherText=cipher.doFinal(plainText);
			System.out.println("Finish encryption:");
			System.out.println(new String(cipherText,"UTF8"));

			System.out.println("\nStart decryption:");
			cipher.init(Cipher.DECRYPT_MODE,key);
			byte[] newPlainText=cipher.doFinal(cipherText);
			System.out.println("Finish decryption:");

			System.out.println(new String(newPlainText,"UTF8"));
		}catch(NoSuchAlgorithmException e){
			e.printStackTrace();
		}catch(NoSuchPaddingException e){
			e.printStackTrace();
		} catch (InvalidKeyException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
			e.printStackTrace();
		} catch (IllegalBlockSizeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BadPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
