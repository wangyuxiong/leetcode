/**
 * Created by metaboy on 16/5/6.
 */
public class ReverseString {

    /**
     * Write a function that takes a string as input and returns the string reversed.
     *
     * Example:
     * Given s = "hello", return "olleh".
     *
     * @param s
     * @return
     */
    public String reverseString(String s) {
        char[] arrays = s.toCharArray();
        int count = arrays.length;
        char[] reverseArrays = new char[count];
        for(int i=0;i<count;i++){
            reverseArrays[i]=arrays[count-i-1];
        }
        return String.valueOf(reverseArrays);
    }

    public static void main(String[] args) {
        ReverseString re = new ReverseString();
        String s = "hello world";
        String reStr = re.reverseString(s);
        System.out.println(reStr);
    }
}
