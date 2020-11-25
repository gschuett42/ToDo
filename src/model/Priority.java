package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.db.AbstractDatabase;
import model.db.MySQLConnector;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Priority {
    private String name;
    private int id;

    public Priority(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return name;
    }
    public static ObservableList<Priority> getList(){
    ObservableList<Priority> list = FXCollections.observableArrayList();
        AbstractDatabase conn = new MySQLConnector("d0345762", " 5AHEL2021","rathgeb.at",3306,"d0345762");
        try {
            PreparedStatement statement = conn.getConnection().prepareStatement("SELECT * FROM gr3_Prioritaet");
            ResultSet results = statement.executeQuery();
            while(results.next()){
                Priority tmp = new Priority(results.getInt("status_id"), results.getString("name"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}