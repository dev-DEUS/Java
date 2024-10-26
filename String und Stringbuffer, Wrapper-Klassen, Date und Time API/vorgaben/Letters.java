public class Letters {

    // Aufgabenteil (a)
    public static boolean contains(String s, char c) {

        return s.contains(String.valueOf(c));
    }

    public static boolean contains(StringBuffer sb, char c) {
        return sb.toString().contains(String.valueOf(c));
    }

    // Aufgabenteil (b)
    public static void addLetter(StringBuffer sBuf, char c) {

        if (sBuf.isEmpty()) { // Um den Code in Aufgabenteil c uebersichtlicher zu gestalten, habe ich die
                              // Ueberpruefung ob sBuf empty ist, in Aufgabenteil c verschoben
            sBuf.append(c);
        } else {
            for (int i = 0; i < sBuf.length(); i++) {
                if (sBuf.charAt(i) > c) {
                    sBuf.insert(i, c);
                    break;
                } else if (i == sBuf.length() - 1) {
                    sBuf.append(c);
                    break;
                }
            }

        }
    }

    // Aufgabenteil (c)
    public static void checkSharedLetters(String w1, String w2) {
        StringBuffer sharedLetters = new StringBuffer();
        StringBuffer uniqueLettersW1 = new StringBuffer();
        StringBuffer uniqueLettersW2 = new StringBuffer();

        for (int i = 0; i < w1.length(); i++) {
            char c = w1.charAt(i);
            if (contains(w2, c)) {
                if (!(contains(sharedLetters, c))) {
                    addLetter(sharedLetters, c);
                }
            } else {
                if (!(contains(uniqueLettersW1, c))) {

                    addLetter(uniqueLettersW1, c);
                }
            }

        }

        for (int i = 0; i < w2.length(); i++) {
            char c = w2.charAt(i);
            if (!contains(w1, c)) {
                if (!contains(uniqueLettersW2, c)) {
                    addLetter(uniqueLettersW2, c);
                }
            }

        }

        System.out.println("Word 1: " + w1);
        System.out.println("Word 2: " + w2);
        System.out.println("Shared letters: " + sharedLetters); // Ausgabe ergänzen!
        System.out.println("Unique letters of word 1: " + uniqueLettersW1); // Ausgabe ergänzen!
        System.out.println("Unique letters of word 2: " + uniqueLettersW2); // Ausgabe ergänzen!

    }

    public static void main(String[] args) {
        if (args.length == 2) {
            // Aufgabenteil (d): Aufruf von checkSharedLetters ergänzen
            checkSharedLetters(args[0].toLowerCase(), args[1].toLowerCase());
        } else {
            System.out.println("Call: \njavaSharedLetters <word1> <word2>");
        }
        // checkSharedLetters("sharp", "soap");
        // checkSharedLetters("board", "bored");
        // checkSharedLetters("Happiness".toLowerCase(), "Envelope".toLowerCase());
    }
}
