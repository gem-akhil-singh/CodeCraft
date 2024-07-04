package basic;

/*
Write a Program to find all substring of String
Consider String as String str="abbc";
Output All substring of “abbc” are
a
ab
abb
abbc
b
bb
bbc
b
bc
c
 */
public class PrintAllSubStrings {

    public static void main(String[] args) {
        String str= "abbc";
     //   System.out.println(str.charAt(1));
        for(int i=0; i<str.length(); i++) {
            String subStr = "";
            for (int j=i;j<str.length();j++){
                subStr+=str.charAt(j);
                System.out.println(subStr);

            }

        }

    }
}
