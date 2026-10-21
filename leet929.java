import java.util.Arrays;

public class leet929 {
    public int numUniqueEmails(String[] emails) {
        // Loop for removing '.'  and anything after '+' upto the '@' sign.
        for (int i = 0; i < emails.length; i++) {
            int at = emails[i].indexOf('@'); // get the index of '@' sign
            emails[i] = emails[i].substring(0, at).split("\\+")[0].replace(".","") + emails[i].substring(at);
        }
        Arrays.sort(emails);

        int count = 0;
        for (int i=0; i < emails.length; i++) {
            if (i==0 || !emails[i].equals(emails[i-1])) count++;
        }
        return count;
        }
    }

