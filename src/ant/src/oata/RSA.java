package ant.src.oata;

import java.security.*;
import javax.crypto.*;
import java.io.UnsupportedEncodingException;

public class RSA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// check args and get plaintext
	    if (args.length !=1) {
	      System.err.println("Usage: java PublicExample text");
	      System.exit(1);
	    }
	    try {
		    byte[] plainText = args[0].getBytes("UTF8");
		    //
		    // generate an RSA key
		    System.out.println( "\nStart generating RSA key" );
		    KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
		    keyGen.initialize(1024);
		    KeyPair key = keyGen.generateKeyPair();
		    System.out.println( "RSA public key = " + new String(key.getPublic().getEncoded(), "UTF8"));
		    System.out.println( "RSA private key = " + new String(key.getPrivate().getEncoded(), "UTF8"));
		    System.out.println( "Finish generating RSA key" );
		    //
		    // get an RSA cipher object and print the provider   
		    Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
		    System.out.println( "\n" + cipher.getProvider().getInfo() );
		    //
		    // encrypt the plaintext using the public key
		    System.out.println( "\nStart encryption" );
		    cipher.init(Cipher.ENCRYPT_MODE, key.getPublic());
		    byte[] cipherText = cipher.doFinal(plainText);
		    System.out.println( "Finish encryption: " );
		    System.out.println( new String(cipherText, "UTF8") );
		    //
		    // decrypt the ciphertext using the private key
		    System.out.println( "\nStart decryption" );
		    cipher.init(Cipher.DECRYPT_MODE, key.getPrivate());
		    byte[] newPlainText = cipher.doFinal(cipherText);
		    System.out.println( "Finish decryption: " );
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
