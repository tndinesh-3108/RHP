import java.util.*;
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int s1 = str1.length();
        int s2 = str2.length();
        int grid[][]=new int[s1+1][s2+1];
        int max=0;
        for(int i=1;i<=s1;i++){
            for(int j=1;j<=s2;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    grid[i][j]=grid[i-1][j-1]+1;
                    max=Math.max(max,grid[i][j]);
                }
                else{
                    grid[i][j]=Math.max(grid[i-1][j],grid[i][j-1]);
                }
            }
        }
        System.out.println(max);
    }
}
