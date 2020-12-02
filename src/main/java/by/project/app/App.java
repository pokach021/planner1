package by.project.app;

import by.project.domain.Category;
import by.project.domain.PlannerFields;
import by.project.domain.Priority;
import by.project.domain.impl.ManyTimesTask;
import by.project.domain.impl.OneTimeTask;

public class App {
    public static void main(String[] args) {
        OneTimeTask oneTimeTask = new OneTimeTask("Buy some food", "27.11.2020",
                Category.SHOPPING, Priority.NOT_IMPORTANT, 666);
        ManyTimesTask manyTimesTask = new ManyTimesTask("Andrew's birthday", "21.03.1995",
                Category.OTHER, Priority.IMPORTANT, "Every year");

        PlannerFields.Builder builder=new PlannerFields.Builder("Lecture","20.12.2020", Category.WORK,
                Priority.IMPORTANT);
        PlannerFields plannerField= builder.build();
        System.out.println(plannerField);

        oneTimeTask.inProcess();
        manyTimesTask.complete();
        System.out.println(manyTimesTask);
        System.out.println(oneTimeTask.getAnything());
        manyTimesTask.setHowOften("every five years");
        System.out.println(manyTimesTask);
    }
}
