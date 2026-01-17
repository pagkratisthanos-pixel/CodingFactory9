package gr.aueb.cf.cf9.review_challenges;

/**
 * Γράψτε μια μέθοδο που αντικαθιστά όλα τα κενά (' ')
 * σε ένα String με "%20" (όπως γίνεται σε URLs).
 *
 */

public class URLEnconding {

    public static void main(String[] args) {
        String string = "Hello Coding Factory!";

        System.out.println(urlEncoding(string));

    }

    public static String urlEncoding (String s) {

        StringBuilder stringBuilder = new StringBuilder();

        for (char ch : s.toCharArray()) {

            if (ch == ' ') {
                stringBuilder.append("%20");
            }
            else {
                stringBuilder.append(ch);
            }
        }

        return stringBuilder.toString();
    }
}
