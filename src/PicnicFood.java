import java.util.*;

public class PicnicFood {
    private final String stringOfFood;

    public PicnicFood(String stringOfFood) {
        this.stringOfFood = stringOfFood.toLowerCase();
    }

    public int getFoodQty() {
        String[] foodArr = stringOfFood.split(" ");
        return foodArr.length;
    }

    public String getLongestFoodName(){
        String[] foodArr = stringOfFood.split(" ");
        
        int maxLength = 0;
        String longestWord = "";

        for (String string : foodArr) {
            if (string.length() > maxLength) {
                maxLength = string.length();
                longestWord = string;
            }
        }

        Set<String> uniqueWords = new HashSet<>();
        for (String word : foodArr){
            if(word.length() == longestWord.length()) {
                uniqueWords.add(word);
            }
        }

        return uniqueWords.toString().substring(1, uniqueWords.toString().length() - 1);
    }

    public void foodFrequency(){
        String[] foodArr = stringOfFood.split(" ");
        Map<String, Integer> foodFreq = new HashMap<>();
        for (String word : foodArr){
            if (!foodFreq.containsKey(word)) {
                foodFreq.put(word, 0);
            }
            foodFreq.put(word, foodFreq.get(word) + 1);
        }

        for (String word : foodFreq.keySet()) {
            System.out.println(word + ": " + foodFreq.get(word) + " pcs.");
        }
    }
}
