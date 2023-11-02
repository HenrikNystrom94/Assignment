package assignment;

public class Counter { //inte bästa namnet på klassen men va en "counter" i början av uppgiften
    int charCounter;
    int lineCounter = 0;
    int wordCounter;
    String longestWord = "";
    private int bigWord = 0;

    public boolean getStopCheck(String input) {

        String[] stringInput = input.split(" "); //skapar en array av användares input där mellanslag
                                                       // separerar de olika orden som sätts i arrayen
        for (int i = 0; i < stringInput.length; i++) { // for loop som körs så länge i är mindre än längden på arrayen.
            if (stringInput[i].equals("stop")) {       // if sats som kontrollerar varje array om ordet stop är skrivet
                                                       // av användaren, om så är fallet retunerar man true.
                return true;
            }
        }
        return false;                                   //om "stop" inte hittas i någon array returnerar man false
                                                        // och användaren kan fortsätta mata in text
    }

    public int getCharCounter(String input) {
        return charCounter = input.length() + charCounter;
    }

    public int getLineCounter() {                       //Osäker hur man testar denna om
        return lineCounter++;                           // man vill få ut annat resultat än 0
    }

    public int getWordCounter(String input) {
        String[] stringInput = input.split(" ");
        wordCounter = stringInput.length + wordCounter;
        return wordCounter;
    }

    public String getLongestWord(String input) {

        String[] stringInput = input.split(" ");  //skapar en array av användares input där mellanslag
                                                        // separerar de olika orden som sätts i arrayen
        for (int i = 0; i < stringInput.length; i++) {  // for loop som körs så länge i är mindre än längden på arrayen.
            if (stringInput[i].length() > bigWord) {    // if sats som testar om längden på varje array är större än bigWord
                bigWord = stringInput[i].length();      // om bigword är mindre så blir bigword längden av det nya största ordet.
                longestWord = stringInput[i];           // och longestword blir det nya längsta ordet
            }
        }
        return longestWord;
    }
}


