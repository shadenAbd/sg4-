public class Program {


    public static int countWords(String s) {
        int count = 0;
        String after = s.replaceAll("( )+", " ");
        char result;
        String blank=" ";
        if(!after.equals(blank)) {
            if (!after.isEmpty()) {
                count = 1;
                for (int i = 1; i < after.length(); i++) {
                    result = after.charAt(i);
                    if (result == ' ') {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    public static String reverseWords(String str) {

        String reversed = "";
        String after = str.replaceAll("( )+", " ");
        System.out.println("the required string :"+after);
        int endIndex = after.length();
        for (int i = after.length() - 1; i >= 0; i--) {

            if (after.charAt(i) == ' ') {

                    reversed += after.substring(i + 1, endIndex) + " ";
                    endIndex = i;
                }
            }

        reversed += after.substring(0, endIndex);

        return reversed;


    }

}
