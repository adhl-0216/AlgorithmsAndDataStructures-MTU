package Lab.Lab1.Q3;

public class Q3 {
    public static void main(String[] args) {
        System.out.println(getInitials("Cathryn Casey"));
        System.out.println(getInitials("John Brosnan"));
        System.out.println(getInitials("Fergus Mc"));
    }

    private static String getInitials(String fullName){
        return "" + fullName.split(" ")[0].charAt(0) + ". " + fullName.split(" ")[1].charAt(0) + ".";
    }
}
