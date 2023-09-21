import java.util.*;
import java.lang.*;
public class String_count {
   public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter a string :-");
        String str=sc.nextLine();
        int v=0,c=0,ws=0,d=0,s=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                v++;
            }
            else if(ch==' '){
                ws++;
            }
            else if(ch>='A'&&ch<='Z' ||ch>='a'&&ch<='z'){ 
                c++;
            }
            /*
             else if(ch>=97&&ch<=122 ||ch>=65&&ch<=90){ 
                c++;
            }
            */
            else if(Character.isDigit(ch)){
                d++;
            }
            else{
                s++;
            }
        }

        System.out.println("Vowels = "+v+" Consonants = "+c+" White Spaces = "+ws+" Digits = "+d+" Special characters = "+s);
   }
}
