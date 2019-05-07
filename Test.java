
import java.util.HashMap;
import java.util.Map;

/**
 * Java program - String Anagram Example.
 * This program checks if two Strings are anagrams or not
 * * @author Alexander Chen */

public class Test
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    System.out.println(IsAnagram("code", "docce"));
    System.out.println(IsAnagram("code", "doce"));
    System.out.println(IsAnagram("decorate", "coerated"));
  }
  
  public static boolean IsAnagram(String s1, String s2)
  {
    // If the two words are equal, they are anagrams
    // If the length of two words are different, they are not anagrams
    if (s1.equals(s2)){
      return true;
    } else if(s1.length() != s2.length()){
      return false;
    }
	
    // Construct two maps for string1 and string2
    Map<Character, Integer> map1 = new HashMap<>();
    Map<Character, Integer> map2 = new HashMap<>();
	
    // Put elements to map1
    for(int i = 0; i < s1.length(); i++){
      map1.put(s1.charAt(i), (map1.get(s1.charAt(i)) == null) ? 1 : map1.get(s1.charAt(i))+1);
    }
	
    // Put elements to map2
    for(int i = 0; i < s2.length(); i++){
      map2.put(s2.charAt(i), (map2.get(s2.charAt(i)) == null) ? 1 : map2.get(s2.charAt(i))+1);
    }
	
    // If two maps are equal, they are anagrams
    if(map1.equals(map2)){
      return true;
    }else{
      return false;
    }
  }
}


