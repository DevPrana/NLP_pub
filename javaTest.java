import java.lang.Math;
class javaTest{
    public static void main(String[] args) {
        int[] arr = {3,0,3,0};
        int max = arr[0];
        int minIndex = Integer.MAX_VALUE;
        int n = arr.length;
        for(int i = 1; i<n; i++){

            if(max < arr[i]){
                max = arr[i];
                minIndex = Math.min(minIndex, i);
            }

        }

        System.out.println("max: "+max);
        System.out.println("minIndex: "+minIndex);
    }
}