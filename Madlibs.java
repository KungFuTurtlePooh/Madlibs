/*
1.2.10 Mad Libs

Author: Brian Hoang, Jaden Tagulinao
Date: Sept 22, 2022
Course: APCSA

Description: This program simulates a madlib game. Gets user input for some parts of speech and adds that to the
madlib.
Preconditions: User inputs parts of speech.
Postconditions: Prints out completed Mad lib.
*****************/
// imports Scanner class
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // List of different madlibs.
    String[] madLibs = {"The <noun> crossed the <adjective> <noun>.", "The <noun> attacked the <adjective> <noun>.", "Paul Harris ate a(n) <adjective> <noun> with <noun>."};

    // Chooses a random madlib from the madLibs list.
    String madLib = madLibs[(int) (Math.random() * madLibs.length)];

    // Creates a scanner object
    Scanner sc = new Scanner(System.in);

    // While loop which continuously run the code inside of the while loop until all instances of "<" is gone from
    // the String, madLib
    while (madLib.contains("<")) {
        // Gets the first instance where you need to input a part of speech. It find the first instance of "<" and 
        // find the first instance of ">" using .indexOf() and substrings everything inside the <> using .substring().
        String partOfSpeech = madLib.substring(madLib.indexOf("<"), madLib.indexOf(">") + 1);

        // Prompts the user to input a certain part of speech and reads what the user inputs.  The substring here
        // gets partOfSpeech and substrings everything inside the <>, excluding the <>.
        System.out.println("Please input a(n) " + partOfSpeech.substring(1, partOfSpeech.length() - 1));
        String input = sc.nextLine();

        // Gets the madLib String variable and replaces the first instance of when "partOfSpeech" appears
        // in the String, "madLib", using .replaceFirst() method.
        madLib = madLib.replaceFirst(partOfSpeech, input);
    }

    // Prints out the finished madlib and closes instance using .close().
    sc.close();
    System.out.println(madLib);
  }
}
