package ch.cern.todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Performing operations on Todo
@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;

    public Todo createTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    public Todo updateTodo(Todo todo) {
        if (todoRepository.existsById(todo.getTaskId())) {
            return todoRepository.save(todo);
        } else {
            throw new IllegalArgumentException("Task not found for ID: " + todo.getTaskId());
        }
    }

    public void deleteTodo(Long todoId) {
        if (todoRepository.existsById(todoId)) {
            todoRepository.deleteById(todoId);
        } else {
            throw new IllegalArgumentException("Task not found for ID: " + todoId);
        }
    }
}

