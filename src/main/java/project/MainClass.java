package project;

import java.util.Collections;
import java.util.Date;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        Data data = new Data();
        System.out.println(data.getPoem());
        System.out.println("--------------------------------");
        Task task = new Task();
        task.alignLines();
    }
}
