import java.util.*;
class solution{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    int max=0,curr=0;
    for(int i=0;i>str.length();i++){
      char ch=str.charAt(i);
      if(ch=='1'){
        curr+=1;
      }
      else{
        curr-=1;
      }
      if(map.containsKey(curr)){
        max=Math.max(max,i-map.get(curr));}
      else{
        map.put(curr,i);
        )
      }
      System.out.println(max);
    }
  }
}
