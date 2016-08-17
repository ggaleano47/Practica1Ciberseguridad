package practica1;

import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;


@SuppressWarnings("restriction")
public class DES {
	Cipher ecipher;
	Cipher dcipher;
	SecretKey llave;

	DES(SecretKey llave) throws Exception {
		ecipher = Cipher.getInstance("DES");
		dcipher = Cipher.getInstance("DES");
		ecipher.init(Cipher.ENCRYPT_MODE, llave);
		dcipher.init(Cipher.DECRYPT_MODE, llave);
	}
	
	DES(String llave) throws Exception {
		byte[] decodedKey = Base64.getDecoder().decode(llave);
		SecretKey newSecretKey = new SecretKeySpec(decodedKey, 0, decodedKey.length, "DES");
		ecipher = Cipher.getInstance("DES");
		dcipher = Cipher.getInstance("DES");
		ecipher.init(Cipher.ENCRYPT_MODE, newSecretKey);
		dcipher.init(Cipher.DECRYPT_MODE, newSecretKey);
	}

	public String encrypt(String str) throws Exception {
		// Encode the string into bytes using utf-8
		byte[] utf8 = str.getBytes("UTF8");

		// Encrypt
		byte[] enc = ecipher.doFinal(utf8);

		// Encode bytes to base64 to get a string
		return new sun.misc.BASE64Encoder().encode(enc);
	}

	public String decrypt(String str) throws Exception {
		// Decode base64 to get bytes
		byte[] dec = new sun.misc.BASE64Decoder().decodeBuffer(str);

		byte[] utf8 = dcipher.doFinal(dec);

		// Decode using utf-8
		return new String(utf8, "UTF8");
	}

	public SecretKey generarLlave() throws NoSuchAlgorithmException {
		llave = KeyGenerator.getInstance("DES").generateKey();
		return llave;
	}

}

