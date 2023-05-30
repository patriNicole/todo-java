package ch.cern.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDateTime;

@SpringBootApplication
public class TodoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(TodoApplication.class, args);

        TodoService todoService = context.getBean(TodoService.class);
        CategoryService categoryService = context.getBean(CategoryService.class);
        
    	// Create a new task
        Todo todo = new Todo();
        todo.setTaskName("Finish deadline due Tuesday");
        todo.setTaskDescription("Complete Java Spring task.");
        todo.setDeadline(LocalDateTime.of(2023, 6, 30, 0, 0));

        // Create a new category
        Category category = new Category();
        category.setCategoryName("Deadlines");
        category.setCategoryDescription("CERN task");

        // Save the category
        Category createdCategory = categoryService.createCategory(category);
        System.out.println("Created category: " + createdCategory);

        // Set the category for the task
        todo.setCategory(createdCategory);

        // Save the task
        Todo createdTodo = todoService.createTodo(todo);
        System.out.println("Created task: " + createdTodo);
    }
}