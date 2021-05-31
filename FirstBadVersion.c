// https://leetcode.com/problems/first-bad-version/

int firstBadVersion(int n) {

    long l = 1;
    long h = n;
    bool tempRes = false;
    int isBadResult = 0;
    while(l <= h){

        long mid = (l + h) / 2;
        bool isBad = isBadVersion(mid);

        if(isBad == true) {
            tempRes = true;
            isBadResult = mid;
            h = mid - 1;
        } else if(isBad == true && tempRes == true) {
            isBadResult = mid;
            break;
        } else {
            l = mid + 1;
        }

    }
    return isBadResult;
}