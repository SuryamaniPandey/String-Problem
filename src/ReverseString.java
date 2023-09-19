public class ReverseString {

    public static void main(String[] args) {
        String str = "hello";
        approachFirst(str);
    }

    /*
    -->This is the first approach to reverse a String.
   -->We know that String are immutable in java, It means we cannot manipulate or iterate. So, That's why we are creating new string.
     */
    private static void approachFirst(String str) {
        //creating new empty string
        String s = "";
        for(int i=str.length()-1; i>=0; i--){
            char ch = str.charAt(i);
            s += ch;
        }
        System.out.println(s);
    }
}
