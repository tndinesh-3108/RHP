import java.util.*;
public class Min_Max_Pair{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N+1];
        for(int i=1;i<=N;i++){
            arr[i] = sc.nextInt();
        }
        int s_cnt = 0, ex_cnt = 0;
        for(int i=1; i<=N; i++){
            if(i==arr[i]) s_cnt++;
            else if(i==arr[arr[i]]) ex_cnt++;
        }
        System.out.println(ex_cnt/2 + 1L*s_cnt*(s_cnt-1)/2);
    }
}
