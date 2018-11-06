
public class substringSearch {
  void  strngComp(String  string1, String string2){
	  boolean match =string1.equals(string2);
	 if (match!=false){
		 System.out.println("\n\nThis is an exact match" + match); 
	 }
	 boolean contains = string1.contains(string2);
	 if (contains!=false && match==false){
	 System.out.println("\n\nThis string contains substring" + contains); 
	 }
	 else
		 System.out.println("\n\nThis string doesnt contains the substring" + contains); 
 
	 }	  
  }
