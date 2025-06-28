import java.util.Scanner;

public class substring{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = sc.nextInt();
        boolean found = false;
        for (int i = 0; i <= str.length() - len; i++) {
            String sub = str.substring(i, i + len);
            System.out.println(sub);
            found = true;
        }
    }
}
