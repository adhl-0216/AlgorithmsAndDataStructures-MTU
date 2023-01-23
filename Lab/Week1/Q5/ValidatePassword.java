package Lab.Week1.Q5;

import javax.swing.*;

public class ValidatePassword {
    public static String inputNewPassword(){
        while (true) {
            String password = JOptionPane.showInputDialog("Please Enter Your Password: ");
            if (isValid(password)) return password;
        }
    }

    private static boolean isValid(String password){
        if (password.length() < 8) return false;
        if (password.matches("[a-z]*")) return false;
        if (password.matches("[A-Z]*")) return false;
        if (password.matches("[0-9]*")) return false;
        return true;
    }
}
