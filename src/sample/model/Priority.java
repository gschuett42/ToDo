package sample.model;

import javafx.collections.ObservableList;
import sample.Database;

public class Priority {
    private int id;
    private String name;

    public Priority(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Priority{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }


    public static ObservableList<Priority> getList() {
        return Database.getPriorityList();
    }
}
