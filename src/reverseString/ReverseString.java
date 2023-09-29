package reverseString;

public class ReverseString {

    public static void main(String[] args) {
        String str = "HELLO";
        /*
        -->We are calling from any approach as per our used
        -->All methods are static. So, No need to created object
         */
        fifthApproach(str);
    }

    /*

   -->We know that String are immutable in java, It means we cannot manipulate or iterate.
      So, That's why we are creating new string.
     */
    private static void firstApproach(String str) {
        //creating new empty string
        //creating new empty string
        String s = "";
        for(int i=str.length()-1; i>=0; i--){
            char ch = str.charAt(i);
            s += ch;
        }
        System.out.println(s);
    }

    /*
    --->In this approach I converted String into char Array. And then we performed swapping.
    --->Creating new String object and stored in str reference variable
     */
    private static void secondApproach(String str){
        char[] charArray = str.toCharArray();

        int i=0, j=str.length()-1;
        while(i<=j){
            char temp;
            temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            i++;
            j--;
        }
        str = new String(charArray);
        System.out.println(str);

    }

    /*
    --->This Approach is similar to second Approach.
    --->In this approach we are converted String to char Array and then with the help of for loop simply printing value from last to first.
     */
    private static void thirdApproach(String str){
        char[] chArray = str.toCharArray();

        //Iterate from last to length 0 and then printing
        for (int i=chArray.length-1; i>=0; i--){
            System.out.print(chArray[i]);
        }
    }

    /*
    --->In this Approach We are created StringBuffer object and we know StringBuffer are mutable.
    --->Inside StringBuffer class reverse() method are available, It's used to reverse the String.
     */
    private static void fourthApproach(String str){

        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());
    }

    /*
    --->This Approach is similar to fourth Approach. But, In this approach we are using StringBuilder
    --->StringBuilder class are also mutable
    --->In StringBuilder class also reverse() method are available. This method is help to reverse a string
     */
    private static void fifthApproach(String str){

        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());
    }
}
