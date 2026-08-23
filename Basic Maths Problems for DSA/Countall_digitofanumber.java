public class Main {
    public static void main(String[] args{
      int n=234;
      fun(n);
    }
    Static void fun(int n){
    int count=0;
    while(n>0){
      int rem=n%10; //it will generate last digit
      count++;
      n=n/10;         
    }
    System.out.println(count);
  }
}
