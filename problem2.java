import java.util.*;
public class problem2 {
    public static void rotate(int[] a,int i,int j){
        while(i<=j){
            int t=a[i];
            a[i]=a[j];
            a[j]=t;
            i++;
            j--;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
          rotate(a,0,k-1);
          rotate(a,k,n-1);
          rotate(a,0,n-1);
          for(int i:a)
          System.out.print(i+" ");
          System.out.println();
          sc.close();
    }
}
