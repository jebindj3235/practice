import java.util.*;
import java.io.*;
public class static_arr{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size:");
        int n=sc.nextInt();
        System.out.println("enter the array:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("1.display 2.search");
        int c=sc.nextInt();
        switch(c)
        {
            case 1:
            static_arr.display(n,arr);
            case 2:
            static_arr.search(n,arr);

        }
    }
    public static void display(int n,int arr[]) {
        for(int i=0;i<n;i++){
        System.out.println("the array value"+arr[i]);
        }
    }
    public static void search(int n,int arr[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the search element:");
        int sear=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==sear){
                System.out.println("the searched elements are"+arr[i]);
            }
            else{
                System.out.println("the element not found");
            }
        }
     }

}
