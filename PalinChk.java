import java.util.Scanner;  
 
class PalinChk {  

   public static void main(String args[])  
   {  
      String user, reverse = ""; 
	  
      Scanner sc = new Scanner(System.in);   
      System.out.println("Enter for check palindrome");  
      user = sc.nextLine();  
	  
      int length = user.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + user.charAt(i);  
      if (user.equals(reverse))  
         
         System.out.println("It's a PALINDROME.");  
      else  
		  
         System.out.println("It isn't PALINDROME.");   
   }  
}  