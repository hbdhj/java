package ant.src.oata;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.NoSuchPaddingException;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class HelloWorld 
{
	public static void main(String[] args)
	{
		try{
			String strInput = "Administrator";
			String strKey = "&dv0~4!qHJ^&4510";
			String strIv = "0n@eh2oqqef&&83#";
			
			byte[] input = strInput.getBytes();
			byte[] keyBytes = strKey.getBytes();
			byte[] ivBytes = strIv.getBytes();
			
			// wrap key data in Key/IV specs to pass to cipher
			SecretKeySpec key = new SecretKeySpec(keyBytes, "AES");
			IvParameterSpec ivSpec = new IvParameterSpec(ivBytes);
			// create the cipher with the algorithm you choose
			// see javadoc for Cipher class for more info, e.g.
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
		
			// Encryption 
			cipher.init(Cipher.ENCRYPT_MODE, key, ivSpec);
			byte[] encrypted = new byte[cipher.getOutputSize(input.length)];
			int enc_len = cipher.update(input, 0, input.length, encrypted, 0);
			enc_len += cipher.doFinal(encrypted, enc_len);
			System.out.println("encrypted = "+ new String(encrypted,"UTF8"));
			// decryption
			cipher.init(Cipher.DECRYPT_MODE, key, ivSpec);
			byte[] decrypted = new byte[cipher.getOutputSize(enc_len)];
			int dec_len = cipher.update(encrypted, 0, enc_len, decrypted, 0);
			dec_len += cipher.doFinal(decrypted, dec_len);
			System.out.println("decrypted = "+ new String(decrypted,"UTF8"));
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
		} catch (InvalidAlgorithmParameterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ShortBufferException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
