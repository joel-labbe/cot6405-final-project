public class dynamicSoln {

    public static int[] start(int[] a, int low, int high){
        int mid,size=3;
        int[] temp = new int[size], tempLeft , tempRight, tempCross;

        if(high==low){
            temp[0]=low;
            temp[1]=high;
            temp[0]=a[low];
            return(temp);
        }else {
            mid = (int) Math.floor((low + high)/2);
            tempLeft = dynamicSoln.start(a, low, mid);
            tempRight = dynamicSoln.start(a, mid + 1, high);
            tempCross = dynamicSoln.helper(a, low, mid, high);

            if (tempLeft[size - 1] >= tempRight[size - 1] && tempLeft[size - 1] >= tempCross[size - 1]) {
                return tempLeft;
            } else if (tempRight[size - 1] >= tempLeft[size - 1] && tempRight[size - 1] >= tempCross[size - 1]) {
                return tempRight;
            } else {
                return tempCross;
            }
        }
    }

    public static int[] helper(int[] a, int low, int mid, int high){
        int left=-((int) Math.pow(2,31)),
                right=-((int) Math.pow(2,31)),
                maxLeft=0,
                maxRight=0,
                sum=0;
        int[] temp=new int[3];

        for(int i=mid;i>=low;i--){
            sum+=a[i];
            if (sum>left){
                left=sum;
                maxLeft=i;
            }
        }
        sum=0;
        for(int j=mid+1;j<=high;j++){
            sum=sum+a[j];
            if(sum>right){
                right=sum;
                maxRight=j;
            }
        }

        temp[0]=maxLeft;
        temp[1]=maxRight;
        temp[2]=right + left;
        return temp;
    }

}
