import java.util.regex.*;

public class RegPatternMatcher {
    
    /* *** Aufgabenteil (a) *** */
    // 2
    public static void findAdverbs(String text) {
        
    }

    /* *** Aufgabenteil (b) *** */
    // 3*
    public static void findRecipesWithoutChocolate(String recipes) {

        
    }

    /* *************  Testaufrufe ************** */

    
    public static void main(String[] args) {

        String t3 = "He was happily, crazily, foolishly over the moon."; // 3
        String t4 = "The horse acted aggressively and stubbornly.";      // 2
        String t5 = "She forgot where to buy the lysol.";                // 0
        String t6 = "She writes poetry beautifully.";                    // 1
        String t7 = "Ilya ran to the store.";                            // 0

        for (String t : new String[] {t3,t4,t5,t6,t7}){
            findAdverbs(t);
        }

        String recipeList =
            "Cake 1: sugar, flour, cocoa powder, baking powder, baking soda, salt, eggs, milk, vegetable oil, vanilla extract, chocolate chips \n" +  
            "Cake 2: cream cheese, sugar, vanilla extract, crescent rolls, cinnamon, butter, honey  \n" +  
            "Cake 3: dark chocolate cake mix, instant chocolate pudding mix, sour cream, eggs, vegetable oil, coffee liqueur \n" +  
            "Cake 4: flour, baking powder, salt, cinnamon, butter, sugar, egg, vanilla extract, milk, chopped walnuts  \n" +  
            "Cake 5: gingersnap cookies, chopped pecans, butter, cream cheese, sugar, vanilla extract, eggs, canned pumpkin, cinnamon  \n" +  
            "Cake 6: flour, baking soda, sea salt, butter, white sugar, brown sugar, eggs, vanilla extract, chocolate chips, canola oil  \n" +  
            "Cake 7: wafers, cream cheese, sugar, eggs, vanilla extract, cherry pie filling \n";

        findRecipesWithoutChocolate(recipeList);

    }

}
