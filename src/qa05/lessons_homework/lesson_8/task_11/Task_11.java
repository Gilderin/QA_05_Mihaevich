package lessons_homework.lesson_8.task_11;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_11 {
    public static void main(String[] args) {
        // Set<String> words=new TreeSet();
        TreeSet<String> words = new TreeSet();
        TreeSet<String> newWords = new TreeSet();
        words.add("Holl");
        words.add("Words");
        words.add("Clocs");
        words.add("Holl");
        words.add("Holl");
        words.add("Holl");
        words.add("Holl");
        System.out.println(words);
        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            if (checkWithRegExp(word)) {
                newWords.add(word);
                System.out.println(word);
            }
        }
    }

    public static boolean checkWithRegExp(String arrayElement) {
        Pattern p = Pattern.compile("^[H-W].*", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(arrayElement);
        return m.matches();
    }
}
