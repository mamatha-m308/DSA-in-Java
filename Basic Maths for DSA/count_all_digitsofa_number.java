public class Main {
    public static void main(String[] args{
      int n=234;
      fun(n);
    }
    Static void fun(int n){
    int count=0;
    while(n>0){
      int rem=n%10; //it will generate last digit
      count++;      // every time when digit exist the count will incresed by 1
      n=n/10;       // remove last digit after the count   
    }
    System.out.println(count);
  }
}

