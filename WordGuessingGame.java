/**
 * Class WordGuessingGame.
 *
 * @author (202200131_202200130)
 * @version (13-03-2024)
 */
public class WordGuessingGame
{
    private String hiddenWord;
    private String guessedWord;
    private int numberOfTries;
    private InputReader reader;
    
    /**
     * Constructor for objects of class WordGuessingGame
     */
    public WordGuessingGame()
    {
        this.hiddenWord = "abc";
        this.guessedWord = "___";
        this.numberOfTries = 0;
        this.reader = new InputReader();
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
    
    private void showWelcome(){
        System.out.println("Bem vindo, bora jogar?!");
    }

    private boolean guess(char letter){
        boolean found = false;
        StringBuilder newGuessedWord = new StringBuilder(guessedWord);
        for(int i=0; i < hiddenWord.length(); i++){
            if(hiddenWord.charAt(i) == letter && guessedWord.charAt(i) == '_'){
                newGuessedWord.setCharAt(i, letter);
                found = true;
            }
        }
        if(found){
            guessedWord = newGuessedWord.toString();
        }
        return found;
    }
    
    private void showResult(){
        System.out.println("Conseguiu resolver em " + this.numberOfTries + " tentativas!");
    }
    
    public void play(){
        showWelcome();
        while(!guessedWord.equals(hiddenWord)){
            char guess = reader.getChar("Guess a letter:  ");
            this.numberOfTries++;
            if(!guess(guess)){
                System.out.println("Incorrect guess! Try again!");
            }
            showGuessedWord();
        }
        showResult();
    }
}
