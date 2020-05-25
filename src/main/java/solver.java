import java.util.concurrent.TimeUnit;

/**/
public class solver {
    private final static int runs=1, tests=10;
    private static int arraySize_1=(int) Math.pow(10,4), arraySize_2=(int) Math.pow(10,5);
    private static long[] results=new long[tests];
    private static long startTime, endTime;
    private static final int[] vals= {1,2,4,8,16,32,64,128,256,512};

    public static void main(String[] args){

        for (int i=0; i<tests;i++){
            for(int j=0;j<runs;j++){
                startTime = System.nanoTime();
                largestSubArrayProb prob=new largestSubArrayProb( (i+1) *arraySize_1);
                bruteForceSoln.start(prob.a);
                endTime = System.nanoTime();
                results[i] += endTime - startTime;

                //System.out.println("Answer: " + bruteForceSoln.start(prob.a));
            }
            results[i]= TimeUnit.NANOSECONDS.toMillis(results[i]/runs);
            //results[i]= results[i]/runs;
        }

        printArray(results);

        for (int i=0; i<tests;i++){
            for(int j=0;j<runs;j++){
                startTime = System.nanoTime();
                largestSubArrayProb prob=new largestSubArrayProb( (i+1) *arraySize_1);
                dynamicSoln.start(prob.a,0, prob.a.length-1);
                endTime = System.nanoTime();
                results[i] += endTime - startTime;

                //int temp[]= dynamicSoln.start(prob.a,0, prob.a.length-1);
                //System.out.println("Answer " + temp[0] + ", " + temp[1] + ", " + temp[2]);
            }
            results[i]= TimeUnit.NANOSECONDS.toMillis(results[i]/runs);
            //results[i]= results[i]/runs;
        }

        printArray(results);

        for (int i=0; i<tests;i++){
            for(int j=0;j<runs;j++){
                startTime = System.nanoTime();
                //largestSubArrayProb prob=new largestSubArrayProb( vals[i] *arraySize_2);
                largestSubArrayProb prob=new largestSubArrayProb( (i+1) *arraySize_2);
                bruteForceSoln.start(prob.a);
                endTime = System.nanoTime();
                results[i] += endTime - startTime;

                //System.out.println("Answer: " + bruteForceSoln.start(prob.a));
            }
            results[i]= TimeUnit.NANOSECONDS.toMillis(results[i]/runs);
            //results[i]= results[i]/runs;
        }

        printArray(results);

        for (int i=0; i<tests;i++){
            for(int j=0;j<runs;j++){
                startTime = System.nanoTime();
                //largestSubArrayProb prob=new largestSubArrayProb( vals[i] *arraySize_2);
                largestSubArrayProb prob=new largestSubArrayProb( (i+1) *arraySize_2);
                dynamicSoln.start(prob.a,0, prob.a.length-1);
                endTime = System.nanoTime();
                results[i] += endTime - startTime;

                //int temp[]= dynamicSoln.start(prob.a,0, prob.a.length-1);
                //System.out.println("Answer " + temp[0] + ", " + temp[1] + ", " + temp[2]);
            }
            results[i]= TimeUnit.NANOSECONDS.toMillis(results[i]/runs);
            //results[i]= results[i]/runs;
        }

        printArray(results);
    }

    public static void printArray(long[] results){
        System.out.println("Printing results...");
        for(int i=0;i<results.length;i++){
            System.out.println(results[i]);
        }
    }
}
