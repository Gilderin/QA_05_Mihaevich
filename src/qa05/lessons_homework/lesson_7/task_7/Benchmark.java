package lessons_homework.lesson_7.task_7;

import com.sun.jdi.InconsistentDebugInfoException;

public class Benchmark {
    public static void main(String[] args) {
        int iterations = 100_000;
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();
        String input = "";
        String letter = "API";
        long timeTestString = testString(iterations, input, letter);
        System.out.println("String test time: " + timeTestString + " ms");
        long timeStringBufferTest = stringBufferTest(iterations, stringBuffer, letter);
        System.out.println("StringBuffer test time: " + timeStringBufferTest + " ms");
        long timeStringBuilderTest = stringBuilderTest(iterations, stringBuilder, letter);
        System.out.println("StringBuilder test time: " + timeStringBuilderTest + " ms");
    }

    public static long testString(int iterations, String input, String letter) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            input += letter;
        }
        long finish = System.currentTimeMillis();
        return finish - start;
    }

    public static long stringBufferTest(int iterations, StringBuffer input, String letter) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            input.append(letter);
        }
        long finish = System.currentTimeMillis();
        return finish - start;
    }

    public static long stringBuilderTest(int iterations, StringBuilder input, String letter) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            input.append(letter);
        }
        long finish = System.currentTimeMillis();
        return finish - start;
    }
}
