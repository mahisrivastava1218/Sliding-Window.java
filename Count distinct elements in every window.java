class Solution
{
    ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
        // code here 
        ArrayList<Integer>lt = new ArrayList<>();
       HashMap<Integer,Integer>map = new HashMap<>();
       
       int i=0;
       while(i<=k-2)
       {
           map.put(A[i],map.getOrDefault(A[i],0)+1);
           i++;
       }
       i--;
       int j = -1;
       while(i<n-1){
           i++;
           map.put(A[i],map.getOrDefault(A[i],0)+1);  
           lt.add(map.size());
           j++;
           int fre = map.get(A[j]);
           if(fre==1){
               map.remove(A[j]);
           }else{
               map.put(A[j],map.get(A[j])-1);
           }
       }
       return lt;
    }
}

