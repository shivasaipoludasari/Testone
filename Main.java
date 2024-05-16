public class Main {
    public static void main(String[] args) {
        String str = "Banana";
        char target = 'a';
        int index = -1;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("The index of the first occurrence of 'a' in the string is: " + index);
        } else {
            System.out.println("The character 'a' is not present in the string.");
        }
    }
}

 