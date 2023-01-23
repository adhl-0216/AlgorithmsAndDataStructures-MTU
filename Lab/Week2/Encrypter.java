package Lab.Week2;

public class Encrypter {
    public static String encryptRowColumn(String plaintext, int numColumns){
        plaintext = plaintext.replaceAll(" ", "").toUpperCase();
        int numRows = Math.ceilDiv(plaintext.length(),numColumns);
        System.out.println(numRows);
        if (plaintext.length() < (numColumns*numRows)) {
            StringBuilder plaintextBuilder = new StringBuilder(plaintext);
            plaintextBuilder.append("X".repeat(Math.max(0, plaintextBuilder.length() - (numColumns * numRows))));
            plaintext = plaintextBuilder.toString();
        }
        StringBuilder cipherText = new StringBuilder();
        for (int col = 0; col < numColumns; col++) {
            int index = col;
            for (int row = 0; row < numRows; row++) {
                cipherText.append(plaintext.toCharArray()[index]);
                index += numColumns - 1;
            }
        }
        return cipherText.toString();
    }
    public static String decryptRowColumn(String cipherText, int numColumns){
        return encryptRowColumn(cipherText, numColumns);
    }
}
