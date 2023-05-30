package ch.cern.todo;
import javax.persistence.*;

@Entity
@Table(name = "TASK_CATEGORIES")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CATEGORY_ID")
    private Long categoryId;

    @Column(name = "CATEGORY_NAME", length = 100, nullable = false, unique = true)
    private String categoryName;

    @Column(name = "CATEGORY_DESCRIPTION", length = 500)
    private String categoryDescription;

    // --------------- Getters and Setters ---------------
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
    
    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    
    public String getCategoryName() {
        return categoryName;
    }
    
    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }
}
