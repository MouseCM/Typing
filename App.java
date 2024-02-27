import java.util.Scanner;

public class App {

    static void generateResult(User myUser, AI myAi, double typingTime) {
        myUser.word = myUser.text.split(" ");
        myAi.word = myAi.text.split(" ");
        
        int minLen = Math.min(myUser.word.length, myAi.word.length);

        for(int i = 0; i < minLen; i++) {
            if(myUser.word[i].equals(myAi.word[i])) {
                myUser.correctWord++;
            }
            else {
                myUser.wrongWord++;
            }
        }

        myUser.WPM = myUser.correctWord / typingTime;

        System.out.println("Word per minute: " + myUser.WPM);
        System.out.println("Correct words: " + myUser.correctWord);
        System.out.println("Wrong words: " + myUser.wrongWord);
        System.out.println();

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        User myUser = new User();
        AI myAI = new AI();

        System.out.println();
        System.out.print("Enter number of word you want to type: ");
        int numWord = input.nextInt();
        input.nextLine();
        
        myAI.setNumOfWord(numWord);

        System.out.println();
        myAI.generateText();

        System.out.print("Press Enter when you are ready to start typing: ");
        input.nextLine();

        double startTime = System.currentTimeMillis();

        myUser.text = input.nextLine();
        input.close();

        double endTime = System.currentTimeMillis();
        double typingTime = ((endTime-startTime) / 1000) / 60;

        System.out.println();
        generateResult(myUser, myAI, typingTime);
    }

}