import util.impl.FileConnector;

public class AppRunner {
    public static void run() {

        String stringOfFood = FileConnector.getFileContent();

        if(stringOfFood.equals("-1")){
            System.out.println("File input.txt is Empty!");
        } else {
            PicnicFood picnicFood = new PicnicFood(stringOfFood);

            int foodQty = picnicFood.getFoodQty();
            String longestFoodName = picnicFood.getLongestFoodName();

            System.out.println("Amount of food for a picnic is " + foodQty + ", " + "the longest name of product is " + longestFoodName + ".");
            System.out.println();

            picnicFood.foodFrequency();
        }
    }
}
