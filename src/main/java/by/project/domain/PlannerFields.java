package by.project.domain;

public abstract class PlannerFields implements Completing {
    private String taskName;
    private String taskDate;
    private Category category;
    private Priority priority;

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
