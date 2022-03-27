import java.io.*;

public class Test {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\jonathan.cindanomwam\\Documents\\deci_spec\\RD30.T00.2203220930");
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String line;
        int characterCount = 0;
        int nbCharInLine = 0;
        int sentenceCount = 0;

        while ((line = bufferedReader.readLine()) != null) {
            if (line.startsWith("FC30A")) {
                characterCount += line.length();
                String[] sentence = line.split("[!?.:]+");
                sentenceCount += sentence.length;
            }
        }
        nbCharInLine = characterCount/sentenceCount;
        System.out.println("Total number of sentences = " + sentenceCount);
        System.out.println("Total number of characters = " + characterCount);
        System.out.println("Il y'a " + nbCharInLine + " caractères sur une ligne de déclaration");
    }
}
