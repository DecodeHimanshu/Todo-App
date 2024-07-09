package com.example.todoapp.db;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\'J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b0\nH\'\u00a8\u0006\f"}, d2 = {"Lcom/example/todoapp/db/TodoDao;", "", "addTodo", "", "todo", "Lcom/example/todoapp/Todo;", "deleteTodo", "id", "", "getAllTodo", "Landroidx/lifecycle/LiveData;", "", "app_debug"})
@androidx.room.Dao
public abstract interface TodoDao {
    
    @androidx.room.Query(value = "SELECT * FROM Todo ORDER BY createdAt DESC")
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.todoapp.Todo>> getAllTodo();
    
    @androidx.room.Insert
    public abstract void addTodo(@org.jetbrains.annotations.NotNull
    com.example.todoapp.Todo todo);
    
    @androidx.room.Query(value = "Delete FROM Todo where id = :id")
    public abstract void deleteTodo(int id);
}