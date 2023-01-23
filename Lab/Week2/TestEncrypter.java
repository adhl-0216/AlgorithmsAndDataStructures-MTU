package Lab.Week2;

public class TestEncrypter {
    public static void main(String[] args) {
        System.out.println(Encrypter.encryptRowColumn("this is a secret message", 5));
        System.out.println(Encrypter.decryptRowColumn("TSRSHAESISTASEMGICEE", 4));

        System.out.println(Encrypter.encryptRowColumn("random message", 3));

    }
}
