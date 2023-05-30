package ch.cern.todo;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "TASKS")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TASK_ID")
    private Long taskId;

    @Column(name = "TASK_NAME", length = 100, nullable = false)
    private String taskName;

    @Column(name = "TASK_DESCRIPTION", length = 500)
    private String taskDescription;

    @Column(name = "DEADLINE", nullable = false)
    private LocalDateTime deadline;

    @ManyToOne
    @JoinColumn(name = "CATEGORY_ID", nullable = false)
    private Category category;
    
    // --------------- Getters and Setters ---------------
    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }
    
    public Long getTaskId() {
        return taskId;
    }
    
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskName() {
        return taskName;
    }
    
    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getTaskDescription() {
        return taskDescription;
    }
    
    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }
    
    public void setCategory(Category category) {
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }
}
