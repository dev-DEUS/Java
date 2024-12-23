public class StringWorker {
    public static StringBuffer randomLetters(int n) {
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i <= n; i++) {
            // 65 - 122
            char randomChar = (Math.random() < 0.5)
                ? (char) (Math.random() * 26 + 65)  // A-Z
                : (char) (Math.random() * 26 + 97); // a-z

            sb.append(randomChar);
        }
        return sb;
    }

    public static StringBuffer reverse(String word) {
        StringBuffer sb = new StringBuffer();
        for (int i = word.length() - 1; i >= 0; i--) {
            sb.append(word.charAt(i));
        }
        return sb;
    }

    public static String palindromP(String word) {
        StringBuffer sb = new StringBuffer();
        for (int i = word.length() - 1; i >= 0; i--) {
            sb.append(word.charAt(i));
        }

        String reversedWord = sb.toString();
        if (word.equals(reversedWord)) {
            return "true";
        } else {
            return "false";
        }
    }

    public static String reverseSubstring(String word, int i, int j) {
        StringBuffer sb = new StringBuffer(word);

        while (i < j) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);

            i++;
            j--;
        }

        return sb.toString();
    }

    public static String setChar(String word, int index, char character) {
        return word.replace(word.charAt(index), character);
    }

    public static String setSubstring(String word, int index, String replace) {
        StringBuffer sb = new StringBuffer();
        int temp = 0; 

        if (word.length() - index >= replace.length()) { 
            for (int i = 0; i < word.length(); i++) {
                if (i >= index && temp < replace.length()) {
                    sb.append(replace.charAt(temp));
                    temp++; 
                } else {
                    sb.append(word.charAt(i));
                }
            }
	    
            return sb.toString();
	    
        } else {
            return "Not possible.";
        }
    }

    public static int countPositions1(String word, String sequence){
	int count = 0;

	for (int i = 0; i <= word.length() - sequence.length(); i++) {
	    String substring = word.substring(i, i + sequence.length());

	    if (substring.equals(sequence)) {
		count++;
	    }
	}
	return count;
    }

    public static int countPositions2(String word, String sequence) {
        
        int count = 0;
        int index = 0;
       
        while ((index = word.indexOf(sequence, index)) != -1) {
            count++;  
            index += sequence.length();
        }
        
        return count;
    }

    public static String mixStrings(String word1, String word2) {
	StringBuffer sb = new StringBuffer();
	String maxString = "";
	int max, min, temp = 0;
	
	if (word1.length() >= word2.length()) {
	    max = word1.length();
	    min = word2.length();
	    maxString = word1;
	} else {
	    max = word2.length();
	    min = word1.length();
	    maxString = word2;
	}

	while (temp < min) {
	    sb.append(word1.charAt(temp));
	    sb.append(word2.charAt(temp));
	    temp++;
	}

	sb.append(maxString.substring(temp));

	return sb.toString();
    }


    public static void main(String[] args) {
        System.out.println(randomLetters(10));
        System.out.println("-----------------------------");
        System.out.println("Reverse:\n" + "abcdef" + " -> " + reverse("abcdef"));
        System.out.println("-----------------------------");
        System.out.println("Palindrom:\n" + "abcdcba" + " -> " + palindromP("abcdcba"));
        System.out.println("-----------------------------");
        System.out.println("Reversed Substring:\n" + "aaaxyzbbb" + " -> " + reverseSubstring("aaaxyzbbb", 3, 5));
        System.out.println("-----------------------------");
        System.out.println("Set Character:\n" + "aaaXaaa" + " -> " + setChar("aaaXaaa", 3, 'Y'));
        System.out.println("-----------------------------");
	System.out.println("Set Substring:\n" + "aaaxyzbbb" + " -> " + setSubstring("aaaxyzbbb", 3, "ccc"));
        System.out.println("-----------------------------");
	System.out.println("Count Positions 1:\n" + "aaabbbaaa" + " -> " + countPositions1("aaabbbaaa", "aa"));
	System.out.println("-----------------------------");
	System.out.println("Count Positions 2:\n" + "aaabbbaaa" + " -> " + countPositions2("aaabbbaaa", "aa"));
	System.out.println("-----------------------------");
	System.out.println("Mix Strings:\n" + "abc + xyz00" + " -> " + mixStrings("abc", "xyz00"));
    }
}
