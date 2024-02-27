import java.util.Random;

public class AI extends Entity {
    String[] words = {
        "hello", "glass", "huge", "nation", "end", "option",
        "this", "zebra", "just", "insane", "most", "out",
        "end", "must", "should", "usecase", "print", "class",
        "void", "string", "public", "amazing", "style", "document",
        "system"
    };

    public void generateText() {
        for(int i = 0; i < numOfWord; i++) {
            Random rand = new Random(); 
            int position = rand.nextInt(25); 
            text += words[position] + " ";
        }

        System.out.println(text);
        System.out.println();
    }
}
