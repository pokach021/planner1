package by.project.domain.impl;

import by.project.domain.Category;
import by.project.domain.PlannerFields;
import by.project.domain.Priority;

public class OneTimeTask extends PlannerFields {
    private int anything;

    public OneTimeTask(String taskName, String taskDate, Category category, Priority priority, int anything) {
        super(taskName, taskDate, category, priority);
        this.anything = anything;
    }

    public int getAnything() {
        return anything;
    }

    public void setAnything(int anything) {
        this.anything = anything;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "OneTimeTask:" + "\n" +
                "anything:" + anything;
    }
}
