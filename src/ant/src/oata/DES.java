package ant.src.oata;

import java.io.UnsupportedEncodingException;
import java.security.*;

import javax.crypto.*;

public class DES {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// check args and get plaintext
	    if (args.length !=1) {
	      System.err.println("Usage: java PrivateExample text");
	      System.exit(1);
	    }
	    
	    try {
			//byte[] plainText = args[0].getBytes("UTF8");
	    	byte[] plainText = args[0].getBytes();
			//
			// get a DES private key
			System.out.println( "\nStart generating DES key" );
			KeyGenerator keyGen = KeyGenerator.getInstance("DES");
			keyGen.init(56);
			Key key = keyGen.generateKey();
			System.out.println( "Finish generating DES key" );
			//
			// get a DES cipher object and print the provider
			Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
			System.out.println( "\n" + cipher.getProvider().getInfo() );
			//
			// encrypt using the key and the plaintext
			System.out.println( "\nStart encryption" );
			cipher.init(Cipher.ENCRYPT_MODE, key);
			byte[] cipherText = cipher.doFinal(plainText);
			System.out.println( "Finish encryption: " );
			System.out.println( new String(cipherText) );
			System.out.println( new String(cipherText, "UTF8") );

			//
			// decrypt the ciphertext using the same key
			System.out.println( "\nStart decryption" );
			cipher.init(Cipher.DECRYPT_MODE, key);
			byte[] newPlainText = cipher.doFinal(cipherText);
			System.out.println( "Finish decryption: " );

			System.out.println( new String(newPlainText) );
			System.out.println( new String(newPlainText, "UTF8") );
	    } catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    catch (IllegalBlockSizeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BadPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    catch (InvalidKeyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    catch (NoSuchPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
