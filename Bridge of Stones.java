static void findJumps(long N, long X){
        
        // Your code goes here
        long mid = N/2;
        long count = 0;
        int i=1;
        int j = (int)N;
        if(X < mid){
            while(i < X){
                count++;
                i+=2;
            }
        }
        else if(X > mid){
            
            if(N%2==0)
            {
            while(j>X){
                count++;
                j-=2;
            }
            }
            else{
                j--;
                while(j>X){
                count++;
                j-=2;
            }
                
            }
        }
        else{
            count = mid/2;
        }
        
        System.out.println(count);
    }
