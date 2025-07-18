package Lec_10;
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class FirstBadVersion extends VersionControl {
    public int firstBadVersion(int n) {
        int lo=1;
        int hi=n;
        int ans=0;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
        
            if(isBadVersion(mid)){
                hi=mid-1;
                ans=mid;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }
}