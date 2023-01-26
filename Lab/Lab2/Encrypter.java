package Lab.Lab2;

public class Encrypter {
    public static String encryptRowColumn(String plainText, int numColumns){
        plainText = plainText.replaceAll(" ", "").toUpperCase();
        int numRows = Math.ceilDiv(plainText.length(),numColumns);
        if (plainText.length() < (numColumns*numRows)) {
            StringBuilder plainTextBuilder = new StringBuilder(plainText);
            plainTextBuilder.append("X".repeat(Math.max(0, (numColumns * numRows) - plainTextBuilder.length())));
            plainText = plainTextBuilder.toString();
        }
        StringBuilder cipherText = new StringBuilder();
        for (int col = 0; col < numColumns; col++) {
            int index = col;
            for (int row = 0; row < numRows; row++) {
                cipherText.append(plainText.toCharArray()[index]);
                index += numColumns;
            }
        }
        return cipherText.toString();
    }
    public static String decryptRowColumn(String cipherText, int numColumns){
        int key = Math.ceilDiv(cipherText.length(),numColumns);
        return encryptRowColumn(cipherText, key);
    }

    public static String encryptCaesarCipher(String plainText, int shift) {
        if (shift >= 26) shift/=26;

        char[] charArr = plainText.replaceAll(" ","").toUpperCase().toCharArray();
        StringBuilder cipherText = new StringBuilder();
        for (char chr : charArr) {
            if (!(chr == ' ')) cipherText.append(((char) (chr + shift)));
            else cipherText.append(' ');
        }

        return cipherText.toString();
    }

    public static String decryptCaesarCipher(String cipherText, int shift) {
        if (shift >= 26) shift-=26;

        char[] charArr = cipherText.replaceAll(" ","").toUpperCase().toCharArray();
        StringBuilder plainText = new StringBuilder();
        for (char chr : charArr) {
            if (!(chr == ' ')) plainText.append(((char) (chr - shift)));
            else plainText.append(' ');
        }

        return plainText.toString();
    }
}
