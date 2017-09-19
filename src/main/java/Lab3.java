import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Lab3 {
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }

    public static void main(final String[] args){

        String websiteString = urlToString("http://tgftp.nws.noaa.gov/data/raw/fz/fzus53.klot.srf.lot.txt");
        int lengthOfString = websiteString.length();
        int numberOfSpaces = 0;
        while (lengthOfString > 1) {
            if ((websiteString.charAt(lengthOfString - 1) == ' ') && (websiteString.charAt(lengthOfString) != ' ') )  {
                numberOfSpaces++;

            }
            lengthOfString--;

        }
        System.out.println(numberOfSpaces + 1);

    }
}
