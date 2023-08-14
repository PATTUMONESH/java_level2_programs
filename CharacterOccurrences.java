package level2;

public class CharacterOccurrences {
    public static int countOccurrences(String inputString, char targetCharacter) {
        int count = 0;
        for (char c : inputString.toCharArray()) {
            if (c == targetCharacter) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String inputString = "monesh@1123";
        char targetCharacter = '@';
        String targetCharacter1 = "m";
        int result = countOccurrences(inputString, targetCharacter);
        System.out.println("The character '" + targetCharacter + "' appears " + result + " times in the string.");
     System.out.println("The character '" + targetCharacter1 + "' appears " + result + " times in the string.");

  
}
}