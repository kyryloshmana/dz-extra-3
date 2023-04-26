import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String sentence = "I would like to have a dog";
        getVowelLetter(sentence);
        getArrayFromString(sentence);
        printInUpperCase(getArrayFromString(sentence));
        getFirstThreeLetters(getArrayFromString(sentence));
        getChangeDogToCat(sentence);
    }

    static void getVowelLetter (String sentence){
        System.out.println("***********Порахуйте загальну кількість голосних (a, e, i, o, u) у рядку.***********");
        char [] value = sentence.toCharArray();
        int countVowelLatter = 0;


            for(Character later:value){
               //System.out.println(later);
                for(VowelLatter vowelLatter: VowelLatter.values()){
                //System.out.println(vowelLatter.getVowelLatter());
                if(later == vowelLatter.getVowelLatter()){
                    countVowelLatter++;
                }
               }


        }
        System.out.println(countVowelLatter);
    }

    static String [] getArrayFromString(String sentence){
        System.out.println("****************Розділіть рядок на масив слів за допомогою пробілу як роздільника.***************");
        String [] words = sentence.split(" ");
        for (String arrWords:words){
            System.out.println(arrWords);
        }
        return words;
    }

    static void printInUpperCase(String [] words){
        System.out.println("""
                **************Створіть StringBuilder
                Додати по одному слову "I would like to have a dog";
                Перетворіть у стірнг
                Виведіть у консоль в upper case***************""");
        StringBuilder stringBuilder = new StringBuilder();

        for(String value:words){
            //System.out.println(stringBuilder.append(value));
            stringBuilder.append(value).append(" ");
        }
        String data = stringBuilder.toString().toUpperCase();
        System.out.println(data);
    }

    static void getFirstThreeLetters(String[] words){
        System.out.println("************Витягніть перші три символи першого слова та виведіть їх на консоль.**********");
        ArrayList <String> helper = new ArrayList<>();
        for(String word:words){
            if(word.length()>=3){
                helper.add(word);
                }
        }
        String [] wordLong = helper.toArray(new String[0]);
        String word = wordLong[0].substring(0,3);
        System.out.println(word);
    }

    static void getChangeDogToCat(String sentence){
        System.out.println("****************Замініть всі входження слова \"dog\" на \"cat\" у рядку.**********");
        String word = sentence.replace("dog", "cat");
        System.out.println(word);
    }
}
