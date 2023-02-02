package Lab2;

public class TestEncrypter {
    public static void main(String[] args) {
        System.out.println(Encrypter.encryptRowColumn("this is a secret message", 5));
        System.out.println(Encrypter.decryptRowColumn("TSRSHAESISTASEMGICEE", 5));

        System.out.println(Encrypter.encryptRowColumn("We have 8 apples", 5));
        System.out.println(Encrypter.decryptRowColumn("WELE8EHASAPXVPX", 5));

        System.out.println(Encrypter.encryptCaesarCipher("abcde f", 26*2+1));
        System.out.println(Encrypter.decryptCaesarCipher("BCDEFG", 1));

    }
}
