public class bruteForceSoln {
    public static int sum=0, largestSum=0, left=0, right=0;

    public static int start(int[] a){
        for(int i=0;i<a.length;i++){
            sum=a[i];
            for(int j=i+1;j<a.length;j++){
                if(sum>largestSum){
                    largestSum=sum;
                    left=i;
                    right=j;
                }
                sum=a[j]+sum;
            }
        }
        return(largestSum);
    }
}
