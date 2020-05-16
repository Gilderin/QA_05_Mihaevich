package lessons_homework.lesson_8.task_11;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/ форматируй код
public class Task_11 {
    public static void main(String[] args) {
        // Set<String> words=new TreeSet();
        TreeSet<String> words=new TreeSet();
        words.add("Holl");
        words.add("Words");
        words.add("Clocs");
        words.add("Holl");
        words.add("Holl");
        words.add("Holl");
        words.add("Holl");
        System.out.println(words);
        / здесь итератор не нужен, обычный цикл по коллекции
        Iterator<String> iterator= words.iterator();
        while(iterator.hasNext()) {
            String word = iterator.next();
            if(checkWithRegExp(word)) {
                / в задаче сказано "выбрать все" - это значит нужно из одного списка выбрать все нужные, а печатать их или нет это уже на усмотрение твое
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
