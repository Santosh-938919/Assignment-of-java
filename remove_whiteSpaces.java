import java.util.*;
import java.lang.*;
public class remove_whiteSpaces {
   public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter a string :-");
        String str=sc.nextLine();
        int w=0,j=0;
        char arr[]=new char[str.length()];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==' '){
                w++;
            }
            else{
                arr[j]=str.charAt(i);
                j++;
            }
        }

        String s=new String(arr);
        System.out.println("The new String = "+s);
        System.out.println("White spaces removed = "+w);
   }
}
