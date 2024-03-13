/**
 * Class WordGuessingGame.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WordGuessingGame
{
    private String hiddenWord;
    private String guessedWord;
    private int numberOfTries;

    /**
     * Constructor for objects of class WordGuessingGame
     */
    public WordGuessingGame()
    {
        this.hiddenWord = "abc";
        this.guessedWord = "___";
        this.numberOfTries = 0;
    }

    public String getHiddenWord(){
        return this.hiddenWord;
    }
    
    public String getGuessedWord(){
        return this.guessedWord;
    }
    
    public int numberOfTries(){
        return this.numberOfTries;
    }
    
    public void showGuessedWord(){
        System.out.println("Guessed Word:  " + this.guessedWord);
    }
}
