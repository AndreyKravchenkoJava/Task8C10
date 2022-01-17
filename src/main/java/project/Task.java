package project;

import java.util.Date;

public class Task {
    public void alignLines() {
        System.out.println("Выполнить форматирование с выравниванием по обоим краям.");
        Data data = new Data();
        String poem = data.getPoem();
        String[] lines = poem.split("\\n");
        int maxLine = 0;
        for (String line : lines) {
            if (maxLine < line.length()) {
                maxLine = line.length();
            }
        }
        for (String line : lines) {
            String[] words = line.split("\\s");
            int n = maxLine - line.length();
            int k = n / (words.length - 1);
            String l = "";
            int d = n % (words.length - 1);
            String spaceLine = " ";
            for (int i = 0; i < k; i++) {
                spaceLine += " ";
            }
            for (int i = 0; i < words.length; i++) {
                if (i != words.length - 1) {
                    l = l + words[i] + spaceLine;
                    if (i < d) {
                        l += " ";
                    }
                } else {
                    l = l + words[i];
                }
            }
            System.out.println(l);
        }
    }
}
