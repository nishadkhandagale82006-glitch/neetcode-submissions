public class Solution extends VersionControl {
    public int firstBadVersion(int n) {

        int left = 1;
        int right = n;

        while (left < right) {

            int mid = left + (right - left) / 2;// avoids over flow 

            if (isBadVersion(mid)) {// mid is bad then we need to check on the left side L--------m------R  SEE NOW M=IS BAD WE CAN ALSO USE RIGHT = MID 
                right = mid ;

            } else if(! isBadVersion(mid)) { // MID IS ON RIGHT SIDE 
                left = mid + 1;
            }
        }

        return left;
    }
}