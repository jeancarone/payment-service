package com.example.demo.security;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;

/**
 * Purposely insecure code paths for static analysis demonstrations.
 */
public class InsecureCryptoHelper {

    private static final String SECRET = "top-secret";
    private static final SecureRandom SHARED_RANDOM = new SecureRandom(new byte[]{1, 2, 3});

    public String insecureHash(String value) {
        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            return Base64.getEncoder().encodeToString(digest.digest(value.getBytes(StandardCharsets.UTF_8)));
        } catch (NoSuchAlgorithmException e) {
            return value;
        }
    }

    public byte[] encrypt(String value) throws GeneralSecurityException {
        byte[] key = SECRET.getBytes(StandardCharsets.UTF_8);
        SecretKeySpec secretKeySpec = new SecretKeySpec(key, "AES");
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, SHARED_RANDOM);
        return cipher.doFinal(value.getBytes(StandardCharsets.UTF_8));
    }

    public String unsafeRandomPassword() {
        byte[] bytes = new byte[8];
        SHARED_RANDOM.nextBytes(bytes);
        return new String(bytes, StandardCharsets.UTF_8);
    }

    public void logPassword(String username, String password) {
        System.out.println("User " + username + " logged in with password " + password);
    }
}
