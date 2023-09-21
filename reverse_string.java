import java.util.*;
import java.lang.*;
public class reverse_string {
   public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter a string :-");
        String str=sc.nextLine();

        //without using toCharArray function
        // char arr[]=new char[str.length()];
        // int j=0;
        // for(int i=str.length()-1;i>=0;i--){
        //     char ch=str.charAt(i);
        //     arr[j]=ch;
        //     j++;
        // }

        //Using toCharArray function 
        char arr[]=str.toCharArray();
        int n=str.length();
        for(int i=0;i<n/2;i++){
            char x=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=x;
        }

        String s=new String(arr);
        System.out.println("The new String = "+s);
   }
}
