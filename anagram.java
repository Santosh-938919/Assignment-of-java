import java.util.*;
import java.lang.*;
public class anagram {
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("please enter frist string :-");
      String s1=sc.nextLine();
      System.out.println("please enter second string :-");
      String s2=sc.nextLine();
      String sa1=s1.toLowerCase(),sa2=s2.toLowerCase();
      char arr1[]=sa1.toCharArray();
      char arr2[]=sa2.toCharArray();
      Arrays.sort(arr1);
      Arrays.sort(arr2);
      int i=0,n=s1.length();
      if(s1.length()==s2.length()){
         for(i=0;i<n;i++){
            if(arr1[i]!=arr2[i]){
               break;
            }
         }
      }
      
      if(i==n){
         System.out.println("The strings are anagram");
      }  
      else{
         System.out.println("The strings are not anagram");
      }

   }
}
