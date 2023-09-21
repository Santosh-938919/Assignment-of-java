import java.util.*;
import java.lang.*;
public class remove_vowels {
   public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter a string :-");
        String str=sc.nextLine();
        int v=0,j=0;
        char arr[]=new char[str.length()];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                v++;
            }
            else{
                arr[j]=str.charAt(i);
                j++;
            }
        }

        String s=new String(arr);
        System.out.println("The new String = "+s);
        System.out.println("Vowels removed = "+v);
   }
}
