package by.project.domain;

public abstract class PlannerFields implements Completing {
    private String taskName;
    private String taskCategory;
    private String taskPriority;
    private String taskDate;

    public PlannerFields(String taskName, String taskCategory, String taskPriority, String taskDate) {
        this.taskName = taskName;
        this.taskCategory = taskCategory;
        this.taskPriority = taskPriority;
        this.taskDate = taskDate;
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
        return "PlannerFields:" + "\n" +
                "taskName:'" + taskName + '\'' +
                ", taskCategory:'" + taskCategory + '\'' +
                ", taskPriority:'" + taskPriority + '\'' +
                ", taskDate:'" + taskDate;
    }
}
