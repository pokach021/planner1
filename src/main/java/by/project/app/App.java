package by.project.app;

import by.project.domain.impl.ManyTimesTask;
import by.project.domain.impl.OneTimeTask;

public class App {
    public static void main(String[] args) {
        OneTimeTask oneTimeTask = new OneTimeTask("Buy some food", "Shopping",
                "not important", "04.11.20", 666);
        ManyTimesTask manyTimesTask = new ManyTimesTask("Andrew's birthday", "holidays",
                "important", "21.03.1995", "every year");
        oneTimeTask.inProcess();
        manyTimesTask.complete();
        System.out.println(manyTimesTask);
        System.out.println(oneTimeTask.getAnything());
        manyTimesTask.setHowOften("every five years");
        System.out.println(manyTimesTask);
    }
}
