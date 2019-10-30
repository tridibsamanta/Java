public class CompareTo 
{ 
public static void main(String args[]) 
    { 

        String str1 = "I love to code"; 
        String str2 = "I love to code"; 
        String str3 = "Code Harder"; 
 
        System.out.println(str1.compareTo(str2)); // Equals 0 
        System.out.println(str1.compareTo(str3)); // Greater than 0
		System.out.println(str3.compareTo(str1)); // Less than 0
    } 
} 