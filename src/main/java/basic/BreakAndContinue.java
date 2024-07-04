package basic;

/*
Consider below mentioned scenario:Consider String Array as shownString
 [] weekdays = { ""Sunday"", ""Monday"", ""Tuesday"", ""Wednesday"", ""Thursday"", ""Friday"", ""Saturday"" };
 Traverse through array and if weekdays variable is equal to Sunday or Saturday then break
 from loop else print weekdays from respective array.
 */
public class BreakAndContinue {
    public static void main(String[] args) {

        String[] days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

        for(int i = 0; i < days.length; i++) {
            if(days[i].equals("Sunday") || days[i].equals("Saturday")){
                continue;
            }
            else {
                System.out.println(days[i]);
            }
        }



    }
}
