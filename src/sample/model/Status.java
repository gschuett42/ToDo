package sample.model;

import javafx.collections.ObservableList;
import sample.Database;

public class Status {

    private int id;
    private String name;


    public Status(int id, String name) {
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
        return "Status{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }

    public static ObservableList<Status> getList(){
        return Database.getStatusList();
    }




}