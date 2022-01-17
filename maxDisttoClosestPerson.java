class Solution {
    public int maxDistToClosest(int[] seats) {
        int n = seats.length;
        int cntj = 1;
        int cntk = 1;
        int maxDist_i = 0;
        int ans = 0;
        //distance of occupied seat on left and right
        for(int i=0; i<n; i++){
            if(seats[i]==0){
                cntj=1;
                cntk=1;
                int j=i-1;
                if(j>0){
                    while(j>0 && seats[j]==0){
                        cntj++;
                        j--;
                    } 
                }
                int k=i+1;
                    while(k<n-1 && seats[k]==0){
                        cntk++;
                        k++;
                    }
                if(i==n-1){
                    maxDist_i = cntj;
                }
                if(i==0){
                    maxDist_i = cntk;
                    
                }
                if(i!=n-1 && i!=0){
                   maxDist_i = Math.min(cntj,cntk); 
                }
                // System.out.println("i " + i);
                // System.out.println("cntj " + cntj);
                // System.out.println("cntk " + cntk);
                // System.out.println("maxDist_i " + maxDist_i);
                
                ans = Math.max(ans,maxDist_i);
                // System.out.println("ans " + ans);
            }
            else{
                continue;
            }
        }
        return ans;
    }
}
