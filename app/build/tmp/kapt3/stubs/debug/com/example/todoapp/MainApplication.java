package com.example.todoapp;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0006"}, d2 = {"Lcom/example/todoapp/MainApplication;", "Landroid/app/Application;", "()V", "onCreate", "", "Companion", "app_debug"})
public final class MainApplication extends android.app.Application {
    public static com.example.todoapp.db.TodoDatabase todoDatabase;
    @org.jetbrains.annotations.NotNull
    public static final com.example.todoapp.MainApplication.Companion Companion = null;
    
    public MainApplication() {
        super();
    }
    
    @java.lang.Override
    public void onCreate() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/example/todoapp/MainApplication$Companion;", "", "()V", "todoDatabase", "Lcom/example/todoapp/db/TodoDatabase;", "getTodoDatabase", "()Lcom/example/todoapp/db/TodoDatabase;", "setTodoDatabase", "(Lcom/example/todoapp/db/TodoDatabase;)V", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.todoapp.db.TodoDatabase getTodoDatabase() {
            return null;
        }
        
        public final void setTodoDatabase(@org.jetbrains.annotations.NotNull
        com.example.todoapp.db.TodoDatabase p0) {
        }
    }
}