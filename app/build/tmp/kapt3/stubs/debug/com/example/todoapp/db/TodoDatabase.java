package com.example.todoapp.db;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/todoapp/db/TodoDatabase;", "Landroidx/room/RoomDatabase;", "()V", "getTodoDao", "Lcom/example/todoapp/db/TodoDao;", "Companion", "app_debug"})
@androidx.room.Database(entities = {com.example.todoapp.Todo.class}, version = 1)
@androidx.room.TypeConverters(value = {com.example.todoapp.db.Converters.class})
public abstract class TodoDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String NAME = "Todo_DB";
    @org.jetbrains.annotations.NotNull
    public static final com.example.todoapp.db.TodoDatabase.Companion Companion = null;
    
    public TodoDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.todoapp.db.TodoDao getTodoDao();
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/todoapp/db/TodoDatabase$Companion;", "", "()V", "NAME", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}