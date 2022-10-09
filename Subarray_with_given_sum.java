class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer> start=new ArrayList<>();
        int sum=0;
        int end=1;
        for(int i=0;i<n;i++){
            sum =arr[i];
            end=i+1;
            while(sum<s && end<n){
                sum=sum+arr[end++];
               
            }
            if(sum==s){
              start.add(i+1);
              start.add(end);
              return start;
           }
        }
       start.add(-1);
       return start;
    }
}
