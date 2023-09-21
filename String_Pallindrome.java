import java.util.*;
import java.lang.*;
public class String_Pallindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the string :-");
        String str=sc.nextLine();
        int flag=0,n=str.length();

        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                flag++;
                break;
            }
        }
        if(flag==0){
            System.out.print("The strint is a pallindrome! :-)");
        }
        else{
            System.out.print("The string is not a pallindrome :-(");
        }
    }
}