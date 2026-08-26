class Solution {
    public boolean isPalindrome(int n) {
  int original=n;
  int rev=0;
  while(n>0){
    int rem=n%10;
    rev=rev*10+rem;
    n=n/10;
  }
   if(rev==original){
    return true;
    }else{
        return false;
    }
 
  }
    }
