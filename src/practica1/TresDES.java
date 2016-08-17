package practica1;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.KeySpec;
import java.util.Arrays;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

@SuppressWarnings("restriction")
public class TresDES {

    public String _encrypt(String message, String secretKey) throws Exception {
	
		MessageDigest md = MessageDigest.getInstance("SHA-1");
		byte[] digestOfPassword = md.digest(secretKey.getBytes("utf-8"));
		byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);
		
		SecretKey key = new SecretKeySpec(keyBytes, "DESede");
		Cipher cipher = Cipher.getInstance("DESede");
		cipher.init(Cipher.ENCRYPT_MODE, key);
		
		byte[] plainTextBytes = message.getBytes("utf-8");
	    byte[] buf = cipher.doFinal(plainTextBytes);
	    byte [] base64Bytes = Base64.encodeBase64(buf);
	    String base64EncryptedString = new String(base64Bytes);
	    
	    return base64EncryptedString;
	}

	public String _decrypt(String encryptedText, String secretKey) throws Exception {
	
	    byte[] message = Base64.decodeBase64(encryptedText.getBytes("utf-8"));
		
		MessageDigest md = MessageDigest.getInstance("SHA-1");
		byte[] digestOfPassword = md.digest(secretKey.getBytes("utf-8"));
		byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);
		SecretKey key = new SecretKeySpec(keyBytes, "DESede");
		
		Cipher decipher = Cipher.getInstance("DESede");
		decipher.init(Cipher.DECRYPT_MODE, key);
		
		byte[] plainText = decipher.doFinal(message);
		
		return new String(plainText, "UTF-8");
	}
    
    /*
    static Cipher TresDESCipherEncrypt;
    static Cipher TresDESCipherDecrypt;
    
    public TresDES(String llave) throws Exception {

        byte[] valuebytes = llave.getBytes("UTF8");
        KeySpec newKeySpec = new DESedeKeySpec(valuebytes);
        SecretKeyFactory mySecretKeyFactory = SecretKeyFactory.getInstance("DESede");
        SecretKey key = mySecretKeyFactory.generateSecret(newKeySpec);
        TresDESCipherDecrypt = Cipher.getInstance("DESede");
        TresDESCipherEncrypt = Cipher.getInstance("DESede");
        TresDESCipherEncrypt.init(Cipher.ENCRYPT_MODE, key);
        TresDESCipherDecrypt.init(Cipher.DECRYPT_MODE, key);
    }

    public String encrypt(String texto) throws Exception {
        String encryptedString = null;
        try {
            byte[] plainText = texto.getBytes("UTF8");
            byte[] encryptedText = TresDESCipherEncrypt.doFinal(plainText);
            BASE64Encoder base64encoder = new BASE64Encoder();
            encryptedString = base64encoder.encode(encryptedText);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return encryptedString;
    }

    public String decrypt(String texto) throws Exception {
        String decryptedText = null;
        try {
            byte[] encryptedText = new BASE64Decoder().decodeBuffer(texto);
            byte[] plainText = TresDESCipherDecrypt.doFinal(encryptedText);
            decryptedText = new String(plainText, "UTF8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return decryptedText;
    }
    */
}
