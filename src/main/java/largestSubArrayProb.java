import java.util.Random;

public class largestSubArrayProb {
    public int[] a =null;
    public int size;
    final int bound =1000;//size of int

    public largestSubArrayProb(int n){
        size=n;
        a= new int[n];
        Random rand = new Random();
        rand.setSeed(23329623);//My student number
        for(int i=0;i<n;i++){
            a[i]=rand.nextInt(10000 - (-10000)) -10000;
        }
    }
}
