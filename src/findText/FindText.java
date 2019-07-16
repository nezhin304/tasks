package findText;

import java.io.*;
import java.util.*;
import java.lang.*;

public class FindText {

    static private Collection<String> getWords(String pathToFile, String[] symbols) {

        Set<String> setWords = new HashSet<>();
        List<Character> symbolsList = new ArrayList<>();

        for (String s : symbols) {
            symbolsList.add(s.charAt(0));
        }

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(pathToFile));
            String line;
            while ((line = bufferedReader.readLine()) != null) {

                char[] charLine = line.toCharArray();
                StringBuilder newString = new StringBuilder();

                for (char c : charLine) {
                    if (!symbolsList.contains(c)) {
                        newString.append(c);
                    }
                }

                for (String s : newString.toString().split("\\s")) {
                    setWords.add(s.toLowerCase());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return setWords;
    }

    public static void main(String[] args) {


        String[] symbols = {".", ",", "/", "-", ";", ":"};
        String pathToFile = ".\\test.txt";

        Set<String> setWords = (Set<String>) getWords(pathToFile, symbols);

        for (String s : setWords) {
            System.out.println(s);
        }
    }
}
