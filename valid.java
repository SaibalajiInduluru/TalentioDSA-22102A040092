import java.util.Scanner;

class Valid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String cleaned = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }
            if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
                cleaned = cleaned + ch;
            }
        }
        String reversed = "";
        for (int i = cleaned.length() - 1; i >= 0; i--) {
            reversed = reversed + cleaned.charAt(i);
        }
        if (cleaned.equals(reversed)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
