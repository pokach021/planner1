package by.project.domain.impl;

import by.project.domain.PlannerFields;

public class ManyTimesTask extends PlannerFields {private String howOften;

    public ManyTimesTask(String taskName, String taskCategory, String taskPriority,
                         String taskDate, String howOften) {
        super(taskName, taskCategory, taskPriority, taskDate);
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
