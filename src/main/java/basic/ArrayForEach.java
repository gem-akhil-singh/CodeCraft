package basic;
/*

Write a Program as per below scenario:Declare an Array of String ,
with array storing following valuesC,C++,Java,Python,RubyUse enhanced For Loop to Print each Value.

 */
public class ArrayForEach {
    public static void main(String[] args) {
        String[] languages = {"C","C++","Java","Python","Ruby"};

        for (String language : languages
             ) {
            System.out.println(language);

        }
    }
}
