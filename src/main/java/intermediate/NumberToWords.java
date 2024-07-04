package intermediate;

public class NumberToWords {

    private static final String[] tensWords = {
            "", "Ten", "Twenty", "Thirty", "Forty",
            "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    private static final String[] unitsWords = {
            "", "One", "Two", "Three", "Four",
            "Five", "Six", "Seven", "Eight", "Nine"
    };

    private static final String[] teensWords = {
            "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen",
            "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    public static void main(String[] args) {
        int n = 998;
        String words = convertToWords(n);
        System.out.println(n + " in words: " + words);
    }

    public static String convertToWords(int n) {
        if (n == 0) {
            return "Zero";
        }


        String[] hundredsWords = {
                "", "One Hundred", "Two Hundred", "Three Hundred", "Four Hundred",
                "Five Hundred", "Six Hundred", "Seven Hundred", "Eight Hundred", "Nine Hundred"
        };

        // Extract hundreds, tens and units places
        int hundreds = n / 100;
        int tens = (n % 100) / 10;
        int units = n % 10;

        StringBuilder words = new StringBuilder();

        words.append(hundredsWords[hundreds]);

        // Append "and" if there are any tens or units
        if (hundreds > 0 && (tens > 0 || units > 0)) {
            words.append(" and ");
        }

        // Append words for tens and units places
        if (tens == 1) {
            words.append(teensWords[units]);
        } else {
            words.append(tensWords[tens]);
            if (tens > 0 && units > 0) {
                words.append(" ");
            }
            words.append(unitsWords[units]);
        }

        return words.toString().trim();
    }
}
