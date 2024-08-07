import java.util.*;
public class problem1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        int sum=0;
        int ans=0;
        for(int i=0;i<n;i++){
             sum+=a[i];
             if(sum<0){
                sum=0;
             }
             ans=Math.max(ans,sum);
        }
        System.out.println(ans);
        sc.close();
    }
    
}
