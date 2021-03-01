package str;
import java.lang.reflect.Array;
import java.util.*;

public class StringOperations {
	
	public static int stringCompare(String s1, String s2, int l1, int l2){
		int flag=0;
		if(l1==l2){ 
			for(int i=0;i<l1;i++){
		        if(s1.charAt(i)!=s2.charAt(i)){
		            flag=0;
		            break;
		        }
		    }
		}
		else
			flag=0; 
		   
		
		return flag;
	}
	
	public static String reverseString(String str,int len){
		String revStr = "";
		for(int i=len-1; i>=0; i--){
			revStr += str.charAt(i);
		}
		return revStr;
	}
	
	public static String reverseCaseOfString(String str, int len){
		String revCaseStr = "";
		for(int i=0; i<len; i++){
			//reversing the case
			if (str.charAt(i)==' ')
				revCaseStr += ' ';
			else if(Character.isLowerCase(str.charAt(i)))
				revCaseStr += Character.toUpperCase(str.charAt(i));
			else if(Character.isUpperCase(str.charAt(i)))
				revCaseStr += Character.toLowerCase(str.charAt(i));
		}
		return revCaseStr;
	}
	
	public static String largestWordInString (String str, int len){
		 
		String[] wordsArray = str.split(" ");
		String largestWordInStr = wordsArray[0];
		for(int i=0; i<wordsArray.length; i++){
			if(wordsArray[i].length() >= largestWordInStr.length()){
				largestWordInStr = wordsArray[i];
			}
		}
		return largestWordInStr;
		}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int len1,len2;
		 String s1 ,s2;
		 
		 System.out.println("Enter the 1st string");
		 s1=scan.nextLine();
		 System.out.println("Enter the 2nd string");
		 s2=scan.nextLine();
		 
		 len1=s1.length();
		 len2=s2.length();
		 
		 //Comparing 2 Strings
		 int compareString = stringCompare(s1, s2, len1, len2);
		 if(compareString==1)
			 System.out.println("The two string are EQUAL!!!\n");
		 else
			 System.out.println("The two string are NOT EQUAL!!!\n");
		 
		 
		 //Reversing a String
		 String revStr = reverseString(s1, len1);
		 System.out.println("The reversed String is : " +revStr+"\n");
		 
		 
		 //Reversing the case of String
		 String revCaseString = reverseCaseOfString(s1, len1);
		 System.out.println("The reversed Case String is : " +revCaseString+"\n");
		 
		 
		 //Finding Largest word in String
		 String largestWordInString = largestWordInString(s1, len1);
		 System.out.println("The largest word in the String is : " +largestWordInString+"\n");
		 
		 scan.close();
		
	}
}
