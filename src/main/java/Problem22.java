import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *

 Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names, begin by sorting it into alphabetical order. Then working out the alphabetical value for each name, multiply this value by its alphabetical position in the list to obtain a name score.

 For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN would obtain a score of 938 × 53 = 49714.

 What is the total of all the name scores in the file?

 *
 * */

public class Problem22 {

    private List<String> parseFile(final String filename){
        List<String> names = new ArrayList<>();

        try (InputStream inputStream = new FileInputStream(filename)){
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line = bufferedReader.readLine();

            line = line.replace("\"","");
            String[] strings = line.split(",");

            names.addAll(Arrays.asList(strings));

        } catch (IOException e) {
            e.printStackTrace();
        }

        return names;
    }

    private List<String> sortNames(List<String> names){
        names.sort(
                Comparator.naturalOrder()
        );

        return names;
    }

    private Map<Character, Integer> getAlphabet(){
        Map<Character, Integer> alphabet = new HashMap<>();
        alphabet.put('A', 1);
        alphabet.put('B', 2);
        alphabet.put('C', 3);
        alphabet.put('D', 4);
        alphabet.put('E', 5);
        alphabet.put('F', 6);
        alphabet.put('G', 7);
        alphabet.put('H', 8);
        alphabet.put('I', 9);
        alphabet.put('J', 10);
        alphabet.put('K', 11);
        alphabet.put('L', 12);
        alphabet.put('M', 13);
        alphabet.put('N', 14);
        alphabet.put('O', 15);
        alphabet.put('P', 16);
        alphabet.put('Q', 17);
        alphabet.put('R', 18);
        alphabet.put('S', 19);
        alphabet.put('T', 20);
        alphabet.put('U', 21);
        alphabet.put('V', 22);
        alphabet.put('W', 23);
        alphabet.put('X', 24);
        alphabet.put('Y', 25);
        alphabet.put('Z', 26);
        return alphabet;
    }

    private Map<String, Integer> getNumericalValuesMap(List<String> names) {
        HashMap<String, Integer> namesMap = new HashMap<>();
        Map<Character, Integer> alphabet = getAlphabet();


        for(String name : names){
            Integer nameCount = 0;
            for(int i = 0; i < name.length(); i++){
                Character character = name.charAt(i);
                Integer value = alphabet.get(character);
                nameCount = nameCount + value;
            }

            namesMap.put(name, nameCount);
        }

        return namesMap;
    }

    private long getMapCount(List<String> sortedNames, Map<String, Integer> namesMap){
        long sum = 0;
        int nameIndex = 1;
        for(String name : sortedNames){
            int nameValue = namesMap.get(name);
            sum = sum + (nameValue * nameIndex);
            nameIndex++;
        }

        return sum;
    }

    public static void main(String[] args) {
        String fileName = System.getProperty("user.dir") + File.separator +
                "src" + File.separator +
                "main" + File.separator +
                "resources" + File.separator +
                "Problem22_names.txt";

        Problem22 problem22 = new Problem22();
        List<String> names = problem22.parseFile(fileName);
        names = problem22.sortNames(names);

        Map<String, Integer> numericalNameMap = problem22.getNumericalValuesMap(names);

        System.out.println(problem22.getMapCount(names, numericalNameMap));
    }
}
