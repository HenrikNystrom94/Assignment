package assignment;

import java.util.Scanner;

public class AssignmentMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Counter counter = new Counter();
        boolean stop = false;

        while(!stop) {                         //om stop är false så fortsätter while loopen.
            String input = scan.nextLine();
            counter.getStopCheck(input);       //anropar getStopCheck från counter klassen för att kontrollera om input är stop
            stop = counter.getStopCheck(input);//om getStopCheck returnerar true blir stop true.
            if(!stop){                         //kontroll om stop fortfarande är false innan resten av programmet körs.
                counter.getCharCounter(input);
                counter.getLineCounter();
                counter.getWordCounter(input);
                counter.getLongestWord(input);
            }
        }

        int charCounter = counter.charCounter;
        int lineCounter = counter.lineCounter;
        int wordCounter = counter.wordCounter;
        String longestWord = counter.longestWord;
        System.out.println("You used " + charCounter + " character(s)");
        System.out.println("You used " + lineCounter + " line(s)");
        System.out.println("You used " + wordCounter + " word(s)");
        System.out.println("Your longest word was: " + longestWord);

    }
}

 /*boolean stop = false; //G-lösning för kontroll om input är stop

        while (!stop) {
            String input = scan.nextLine();
            if (!(input.equals("stop"))) {
                counter.getCharCounter(input);
                counter.getRowCounter();
                counter.getWordCounter(input);
                counter.getLongestWord(input);
            } else {
                stop = true;
            }
        }*/

