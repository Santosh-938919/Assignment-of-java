import java.util.*;
import java.lang.*;
public class largest_word {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter a string :- ");
        String str=sc.nextLine();
        int n=1;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==' '){
                n++;
            }
        }
        String[] arr=str.split(" ");
        int max=0,x=0,maxadd=0;
        for(int i=0;i<n;i++){
            x=arr[i].length();
            if(x>max){
                max=x;
                maxadd=i;
            }
        }
        System.out.println("The largest word is = "+arr[maxadd]);
    }
}
