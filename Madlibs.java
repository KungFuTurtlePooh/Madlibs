import java.util.Scanner;


public class Madlibs {


    // How the algorithm words is that it splits 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] madlibs = {"The ~NOUN~ swam across a ~ADJECTIVE~ ~NOUN~.", "Once upon a time in a ~ADJECTIVE~ land, a ~NOUN~ ~ADVERB~ grew."};
        String madlib = madlibs[(int) (Math.random()*madlibs.length)];

        String finishedMadLib = "";
        String[] result = madlib.split("~");

        for (var i = 0; i < result.length; i++) {
            if (i % 2 == 1) {
                String partOfSpeech = result[i];
                
                System.out.println("Please input a(n) " + partOfSpeech);
                String userInput = sc.nextLine();

                finishedMadLib = finishedMadLib.concat(userInput);

            } else {
                finishedMadLib = finishedMadLib.concat(result[i]);
            }
        }

        System.out.println(finishedMadLib);
    }


}