package dynamicprogram;

/**
 * Created by denglingang on 2017/6/8.
 */
public class KingGoldProblem {
    static int[] gold = new int[]{200, 300, 350, 400, 500};
    static int[] peopleNeed = new int[]{100, 400, 350, 500, 400};
    public static void main(String[] args) {

        System.out.println(maxGold(1000, 4));
    }
    public static int maxGold(int peopleNum, int mineNum) {
        if(mineNum == 0) {
            if(peopleNum >= peopleNeed[mineNum]) {
                return gold[mineNum];
            } else {
                return 0;
            }
        } else if(peopleNum >= peopleNeed[mineNum]) {
            return Integer.max(maxGold(peopleNum - peopleNeed[mineNum], mineNum - 1) + gold[mineNum],
                    maxGold(peopleNum,  mineNum - 1));
        } else {
            return maxGold(peopleNum, mineNum - 1);
        }
    }
}
