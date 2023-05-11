package topcrowd;

public class PatternFound {
	
	    public static boolean checkPattern(String word, String pattern)
	    {
	       
	        if (word == null || pattern == null || word.length() < pattern.length()) {
	            return false;
	        }
	 	        
	        Character prev = null;
	 	        
	        for (char curr: pattern.toCharArray())
	        {
	            
	            int firstIndex = word.indexOf(curr);
	            if (firstIndex == -1 || (prev != null && word.lastIndexOf(prev) > firstIndex)) {
	                return false;
	            }
	 	            
	            prev = curr;
	        }
	 
	       
	        return true;
	    }
	 
	    public static void main(String[] args)
	    {
	        String word = "Techie Delight";
	        String pattern = "el";
	 
	        if (checkPattern(word, pattern)) {
	            System.out.println("Pattern found");
	        }
	        else {
	            System.out.println("Pattern not found");
	        }
	    }
}
