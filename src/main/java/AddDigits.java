/**
 * Created by metaboy on 16/5/9.
 */
public class AddDigits {
    /**
     * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
     *
     * For example:
     *
     * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
     *
     * Follow up:
     * Could you do it without any loop/recursion in O(1) runtime?
     *
     *  找到规律后很简单,变数学问题: https://en.wikipedia.org/wiki/Digital_root
     *
     * @param num
     * @return
     */

    public int addDigits(int num) {
        int n = String.valueOf(num).toCharArray().length;

        int x =0;
        for(int i=n-1;i>=0;i--){
            int mod = num / power(10,i);
            num = num - mod * power(10,i);
            x = x + mod;
        }

        if(x >= 10){
            return addDigits(x);
        }else{
            return x;
        }
    }

    public int power(int x,int count){
        int sum=1;
        if(count==0){
            return 1;
        }
        for(int i=1;i<=count;i++){
            sum = sum * x;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num = 15;
        AddDigits add = new AddDigits();
        int sum = add.addDigits(num);
        System.out.println(sum);
    }
}
