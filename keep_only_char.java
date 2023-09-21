import java.util.*;
import java.lang.*;
public class keep_only_char {
   public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter a string :-");
        String str=sc.nextLine();
        int r=0,j=0;
        char arr[]=new char[str.length()];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z'){
                arr[j]=str.charAt(i);
                j++;
            }
            else{
                r++;
            }
        }

        String s=new String(arr);
        System.out.println("The new String = "+s);
        System.out.println("Removed symbols = "+r);
   }
}
