import java.util.*;

public class target {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();            
        int[] arr = new int[n];          

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();       
        }

        int tr = sc.nextInt();          

        for (int i = 0; i < n; i++) {
            if (arr[i] != tr) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

