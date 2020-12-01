package by.project.domain.impl;

import by.project.domain.Category;
import by.project.domain.PlannerFields;
import by.project.domain.Priority;

public class ManyTimesTask extends PlannerFields {
    private String howOften;

    public ManyTimesTask(String taskName, String taskDate, Category category, Priority priority, String howOften) {
        super(taskName, taskDate, category, priority);
        this.howOften = howOften;
    }

    public String getHowOften() {
        return howOften;
    }

    public void setHowOften(String howOften) {
        this.howOften = howOften;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "ManyTimesTask:" + "\n" +
                "howOften:" + howOften;
    }
}
