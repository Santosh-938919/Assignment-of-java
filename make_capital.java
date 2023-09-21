import java.util.*;
import java.lang.*;
public class make_capital {
   public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter a string :-");
        String str=sc.nextLine();
        char arr[]=new char[str.length()];
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(i==0){
                arr[i]=Character.toUpperCase(ch);
            }
            else if((i+1)!=str.length()){
                char ch2=str.charAt(i+1);
                char ch1=str.charAt(i-1);
                if(ch==' '){
                    arr[i+1]=Character.toUpperCase(ch2);
                    arr[i]=ch;
                    arr[i-1]=Character.toUpperCase(ch1);
                }
                else if(ch1 != ' '){
                    arr[i]=ch;
                }

            }
            else{
                arr[i]=Character.toUpperCase(ch);
            }
            
        }

        String s=new String(arr);
        System.out.println("The new String = "+s);
   }
}
