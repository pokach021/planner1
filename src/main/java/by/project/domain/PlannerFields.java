package by.project.domain;

public class PlannerFields<T> implements Completing {
    private String taskName;
    private String taskDate;
    private Category category;
    private Priority priority;
    private T intId;

    public static class Builder {
        private String taskName;
        private String taskDate;
        private Category category;
        private Priority priority;

        public Builder(String taskName, String taskDate, Category category, Priority priority) {
            this.taskName = taskName;
            this.taskDate = taskDate;
            this.category = category;
            this.priority = priority;
        }

        public PlannerFields build() {
            PlannerFields plannerField = new PlannerFields();
            plannerField.taskName = this.taskName;
            plannerField.taskDate = this.taskDate;
            plannerField.category = this.category;
            plannerField.priority = this.priority;
            return plannerField;
        }
    }

    public PlannerFields() {

    }

    public T getIntId() {
        return intId;
    }

    public void setIntId(T intId) {
        this.intId = intId;
    }

    public PlannerFields(String taskName, String taskDate, Category category, Priority priority) {
        this.taskName = taskName;
        this.taskDate = taskDate;
        this.category = category;
        this.priority = priority;
    }

    public void complete() {
        System.out.println("Task is complete");
    }

    public void notComplete() {
        System.out.println("Task isn't complete");
    }

    public void inProcess() {
        System.out.println("Task is in process");
    }

    @Override
    public String toString() {
        return "PlannerFields{" +
                "taskName='" + taskName + '\'' +
                ", taskDate='" + taskDate + '\'' +
                ", category=" + category +
                ", priority=" + priority +
                '}';
    }
}
