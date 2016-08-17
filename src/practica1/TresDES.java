package practica1;

import java.security.spec.KeySpec;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

@SuppressWarnings("restriction")
public class TresDES {
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
}
