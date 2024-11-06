public class RegReplace {

    /* *** Aufgabenteil (a) *** */
    // 2
    public static String swapChars(String text, char a, char b) {
        String stringA = Character.toString(a);
        String stringB = Character.toString(b);
        String nullChar = Character.toString((char) 0);

        text = text.replaceAll(stringA, nullChar);
        text = text.replaceAll(stringB, stringA);
        text = text.replaceAll(nullChar, stringB);

        return text;
    }

    /* *** Aufgabenteil (b) *** */
    // 2
    public static String changeNameOrder(String name) {
        /*
         * String[] splitName = name.split("\\s+");
         * StringBuffer nBuffer = new StringBuffer("");
         * nBuffer.append(splitName[splitName.length - 1] + ", ");
         * 
         * for (int i = 0; i < splitName.length - 1; i++) {
         * nBuffer.append(splitName[i] + " ");
         * }
         * 
         * name = nBuffer.toString();
         * 
         */

        String[] splitString = name.split("\\s");
        StringBuffer vorname = new StringBuffer();
        String nachname = splitString[splitString.length - 1];

        for (int i = 0; i < splitString.length - 1; i++) {
            vorname.append(splitString[i] + " ");
        }

        String vornameString = vorname.toString();
        String temp = "temp";

        name = name.replaceAll(nachname, temp);
        name = name.replaceAll(vornameString, nachname + ", ");
        name = name.replaceAll(temp, vornameString);

        return name;
    }

    /* *** Aufgabenteil (c) *** */
    // 2
    public static String replaceUmlaute(String text) {
        String[][] uMap = { { "ä", "ae" }, { "ö", "oe" }, { "ü", "ue" } };

        for (int i = 0; i < uMap.length; i++) {
            text = text.replaceAll(uMap[i][0], uMap[i][1]);

            // Erster String
            String originalString1 = Character.toString(Character.toUpperCase(uMap[i][0].charAt(0)));

            // Zweiter String
            String upperString2 = Character.toString(Character.toUpperCase(uMap[i][1].charAt(0)));
            String restString2 = uMap[i][1].substring(1);
            String originalString2 = upperString2 + restString2;

            text = text.replaceAll(originalString1, originalString2);

        }
        return text;

    }

    /* ************* Testaufrufe ************** */

    public static void main(String[] args) {
        /* Test Aufgabenteil (a) */
        System.out.println("Test (a)):\n");

        String s1 = "aabbccc";
        System.out.print(s1 + " --> ");
        System.out.println(swapChars(s1, 'a', 'b'));

        String s2 = "128 895 556 788 999";
        System.out.print(s2 + " --> ");
        System.out.println(swapChars(s2, '8', '9'));

        /* Test Aufgabenteil (b) */
        System.out.println("\nTest (b)):\n");

        String[] sArr1 = { "Tina Meyer", "Thomas  Müller", "Marie-Agnes Strack-Zimmermann",
                "Rüdiger Ägidius Öhmig ",
                "Franz-Ferdinand Maximilian Alexander vOstwestfalen-Lippe" };

        for (String s : sArr1) {
            System.out.println(s + " -> " + changeNameOrder(s));
        }

        /* Test Aufgabenteil (c) */
        System.out.println("\nTest (c)):\n");

        String[] sArr2 = { sArr1[1], sArr1[3] };
        for (String s : sArr2) {
            System.out.println(s + " -> " + replaceUmlaute(s));
        }
    }

}
