package functionalprograms;

public class SumOfIntegers {
    static void triplets(int[] arr){
        int count = 0;
        boolean present = false;
        for(int i=0; i<arr.length-2; i++){
            for(int j=i+1; j<arr.length-1; j++){
                for(int k=j+1; k<arr.length; k++){
                    if(arr[i] + arr[j] + arr[k] == 0){
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                        count++;
                    }
                }
            }
        }
        System.out.println("Number of triplets is " + count );
    }
    public static void main(String[] args) {
        int[] arr1 = {2,8,-2,0,1,-1};
        triplets(arr1);
    }
}
