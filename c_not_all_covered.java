import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int psum[] = new int[N+2];
    while(M-->0){
      int L = sc.nextInt();
      int R = sc.nextInt();
      psum[L]+=1;
      psum[R+1]-=1;
    }
    int mini = 1000000;
    for(int i=1;i<=N;i++){
      psum[i]+=psum[i-1];
      mini=Math.min(psum[i],mini);
    }
    System.out.println(mini);
  }
}
