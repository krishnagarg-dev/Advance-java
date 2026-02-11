public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] arr = {2,3,1,8,7,5,4};
        int k =3;
        int MaxSum = 0;
        for(int i=0; i<k;i++){
            MaxSum += arr[i];
        }
        
        for(int j=k; j<arr.length; j++){
            int tempSum = MaxSum - arr[j-k] + arr[j];
        }
    }
}

//if i place any curly brackets after a constructor then it will be a anonymous block and it will be executed when the class is loaded. It is not a constructor.
//it is an anonymous class if it is followed by parentheses and curly brackets. It is an instance initializer block if it is not followed by parentheses.