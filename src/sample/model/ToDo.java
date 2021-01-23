package sample.model;

import javafx.collections.ObservableList;
import sample.Database;

public class ToDo {
    private int id;
    private String name;
    private String description;
    private Status status;
    private Priority priority;

    public ToDo(int id, String name, String description, int status_id, int prioritaet_id) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.status = Database.getStatus(status_id);
        this.priority = Database.getPriority(prioritaet_id);
    }

    public static ObservableList<ToDo> getList() {
        return Database.getToDoList();
    }




    @Override
    public String toString() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }
}
