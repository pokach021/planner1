package by.project.app;

import by.project.domain.Category;
import by.project.domain.Priority;
import by.project.domain.impl.ManyTimesTask;
import by.project.domain.impl.OneTimeTask;

public class App {
    public static void main(String[] args) {
        OneTimeTask oneTimeTask = new OneTimeTask("Buy some food", "27.11.2020",
                Category.SHOPPING, Priority.NOT_IMPORTANT, 666);
        ManyTimesTask manyTimesTask = new ManyTimesTask("Andrew's birthday", "21.03.1995",
                Category.OTHER, Priority.IMPORTANT, "every year");
//        oneTimeTask.inProcess();
//        manyTimesTask.complete();
//        System.out.println(manyTimesTask);
//        System.out.println(oneTimeTask.getAnything());
//        manyTimesTask.setHowOften("every five years");
//        System.out.println(manyTimesTask);
    }
}
