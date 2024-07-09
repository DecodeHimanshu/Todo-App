package com.example.todoapp;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0012"}, d2 = {"Lcom/example/todoapp/TodoViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "dao", "Lcom/example/todoapp/db/TodoDao;", "todoList", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/todoapp/Todo;", "getTodoList", "()Landroidx/lifecycle/LiveData;", "addTodo", "", "title", "", "deleteTodo", "id", "", "app_debug"})
public final class TodoViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.todoapp.db.TodoDao dao = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.example.todoapp.Todo>> todoList = null;
    
    public TodoViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.example.todoapp.Todo>> getTodoList() {
        return null;
    }
    
    public final void addTodo(@org.jetbrains.annotations.NotNull
    java.lang.String title) {
    }
    
    public final void deleteTodo(int id) {
    }
}