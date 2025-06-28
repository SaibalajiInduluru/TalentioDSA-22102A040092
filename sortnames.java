public class sortnames {
    public static void main(String[] args) {
        String[] arr = {"Alice", "Eve", "Bob", "cherry", "avocado"};
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].compareToIgnoreCase(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
