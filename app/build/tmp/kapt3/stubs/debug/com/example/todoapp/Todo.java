package com.example.todoapp;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001e"}, d2 = {"Lcom/example/todoapp/Todo;", "", "id", "", "title", "", "createdAt", "Ljava/util/Date;", "(ILjava/lang/String;Ljava/util/Date;)V", "getCreatedAt", "()Ljava/util/Date;", "setCreatedAt", "(Ljava/util/Date;)V", "getId", "()I", "setId", "(I)V", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
@androidx.room.Entity
public final class Todo {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int id;
    @org.jetbrains.annotations.NotNull
    private java.lang.String title;
    @org.jetbrains.annotations.NotNull
    private java.util.Date createdAt;
    
    public Todo(int id, @org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.util.Date createdAt) {
        super();
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date getCreatedAt() {
        return null;
    }
    
    public final void setCreatedAt(@org.jetbrains.annotations.NotNull
    java.util.Date p0) {
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.todoapp.Todo copy(int id, @org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.util.Date createdAt) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}