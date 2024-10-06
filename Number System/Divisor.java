class Divisor {
  public static void main(String [] args){
    int num = 10;
    int div = 3;
    int ans = 0;
    for(int i = 0 ; i < num; i++){
        if( num < ans){
            ans += div;
        }
        else if(num - ans < div){
            System.out.println(ans);
        }
    }
  }
}