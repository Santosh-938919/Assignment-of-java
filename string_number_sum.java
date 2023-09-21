import java.util.*;
import java.lang.*;
public class string_number_sum {
   public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter a string :-");
        String str=sc.nextLine();
        int j=0,n=0,sum=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isDigit(ch)){
                int x=Character.getNumericValue(ch);
                n=n*10+x;
                j=n;
            }
            else{
                sum+=j;
                j=0;
                n=0;
            }
        }

        sum+=j;
        
        System.out.println("Sum of numbers of string ="+sum);
   }
}