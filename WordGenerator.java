import java.util.ArrayList;
import java.util.Random;

/**
 * Class WordGenerator.
 *
 * @author (202200131_202200130)
 * @version (13-03-2024)
 */
public class WordGenerator
{
    private ArrayList<String> words = new ArrayList<>();

    public WordGenerator() {
        fillArrayList();
    }

    private void fillArrayList(){
        words.add("boolean");
        words.add("break");
        words.add("byte");
        words.add("case");
        words.add("char");
        words.add("class");
        words.add("continue");
        words.add("do");
        words.add("double");
        words.add("else");
        words.add("enum");
        words.add("for");
        words.add("if");
        words.add("import");
        words.add("int");
    }
    
    public String generateWord(){
        Random random = new Random();
        int randomIndex = random.nextInt(words.size());
        return words.get(randomIndex);
    }
    
    public void addWord(String newWord){
        words.add(newWord);
    }
}
