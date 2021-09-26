class GfG
{
	public int remAnagrams(String s,String s1) {
	    
	    int [] arr1 = new int[256];
	    int [] arr2 = new int[256];
	    
	    char [] a1 = s.toCharArray();
	    char [] a2 = s1.toCharArray();
	    
        for(char ch : a1){
            int i = (int)ch;
            arr1[i]++;
        }
        for(char ch : a2){
            int i = (int)ch;
            arr2[i]++;
        }	 
	    int res = 0;
	    for(int i=0; i<256; i++){
	           int toAdd = Math.abs(arr1[i] - arr2[i]);
	           res += toAdd;
	    }
	    return res;
    }
}
