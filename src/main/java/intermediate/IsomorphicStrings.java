package intermediate;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String str1 = "egg";
        String str2 = "add";
        String str3 = "foo";
        String str4 = "bar";

        System.out.println(str1 + " and " + str2 + " are isomorphic: " + areIsomorphic(str1, str2));
        System.out.println(str3 + " and " + str4 + " are isomorphic: " + areIsomorphic(str3, str4));
    }

    public static boolean areIsomorphic(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] map1 = new int[256];
        int[] map2 = new int[256];

        for (int i = 0; i < str1.length(); i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);

            // Check mapping from str1 to str2
            if (map1[c1] == 0) {
                map1[c1] = c2;
            } else if (map1[c1] != c2) {
                return false; // Different mapping found
            }

            // Check mapping from str2 to str1
            if (map2[c2] == 0) {
                map2[c2] = c1;
            } else if (map2[c2] != c1) {
                return false; // Different mapping found
            }
        }

        return true;
    }
}
