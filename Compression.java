import java.util.*;
public class Compression{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    Set<Integer> s=new TreeSet<>();
    for(int i=1;i<=N;i++){
      s.add(sc.nextInt());
    }
    System.out.println(s.size());
    for(int v: s){
      System.out.print(v+" ");
    }
  }
}
