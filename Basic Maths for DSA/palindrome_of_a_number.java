class Solution {
    public boolean isPalindrome(int n) {
      int original=n;   //to store original number 
      int rev=0;
      while(n>0) {
        int rem=n%10;     //gives last digit
        rev=rev*10+rem;   //rev*10(it automatically creates the position like 10th, 100th, 1000th position  and in last the remainder will added)
        n=n/10;           // removes last digit from a original number
     }
        if(rev==original){    //if rev is equal to original then it is palindrome otherwise it will not
        return true;
        }else{
        return false;
     }
    }
} 
