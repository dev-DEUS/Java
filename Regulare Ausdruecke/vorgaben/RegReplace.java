public class RegReplace {

    /* *** Aufgabenteil (a) *** */
    // 2
    public static String swapChars(String text, char a, char b){


        
        return text;
    }

    /* *** Aufgabenteil (b) *** */
    // 2
    public static String changeNameOrder(String name) {
        
        return name;
    }

    /* *** Aufgabenteil (c) *** */
    // 2
    public static String replaceUmlaute(String text) {
        String[][] uMap = {{"ä", "ae"},{"ö","oe"},{"ü","ue"}};

        
        return text;
        
    }

    /* *************  Testaufrufe ************** */

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
        
        String[] sArr1 = {"Tina Meyer","Thomas  Müller","Marie-Agnes Strack-Zimmermann",
                         "Rüdiger Ägidius Öhmig ", 
                         "Franz-Ferdinand Maximilian Alexander vOstwestfalen-Lippe"};

        for (String s : sArr1){
            System.out.println(s + " -> " + changeNameOrder(s));
        }

        /* Test Aufgabenteil (c) */
        System.out.println("\nTest (c)):\n");

        String[] sArr2 = {sArr1[1],sArr1[3]};
        for (String s : sArr2){
            System.out.println(s + " -> " + replaceUmlaute(s));
        }
    }

}
