class Solution
{
    public int klengthpref(String[] arr, int n, int k, String str) {
        int count = 0;
        for(int i=0; i<n; i++){
            if(arr[i].indexOf(str.substring(0,k)) == 0){
                count++;
            }
        }
        return count;
    }
}

