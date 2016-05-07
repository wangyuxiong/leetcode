/**
 * Created by metaboy on 16/5/7.
 */
public class NimGame {
    /**
     * You are playing the following Nim Game with your friend: There is a heap of stones on the table, each time one of you take turns to remove 1 to 3 stones. The one who removes the last stone will be the winner. You will take the first turn to remove the stones.
     *
     * Both of you are very clever and have optimal strategies for the game. Write a function to determine whether you can win the game given the number of stones in the heap.
     *
     * For example, if there are 4 stones in the heap, then you will never win the game: no matter 1, 2, or 3 stones you remove, the last stone will always be removed by your friend.
     *
     *
     * @param n
     * @return
     */
    public boolean canWinNim(int n) {

        int mod = n % 4;
        if(mod == 0){
            return false;
        }else{
            return true;
        }
    }

    public static void main(String[] args) {
        int n = 101;
        NimGame game = new NimGame();
        System.out.println(game.canWinNim(n));
    }
}
