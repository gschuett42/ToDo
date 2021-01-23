package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sample.model.Priority;
import sample.model.Status;
import sample.model.ToDo;
import sample.model.db.AbstractDatabase;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Database {
    private static AbstractDatabase connection;

    static {
        connection = Connect.connect();
    }


    public static Status getStatus(int id) {
        Status result = null;
        try {
            PreparedStatement statement = connection.getConnection().prepareStatement("SELECT * FROM gr3_Status WHERE status_id = " + id);
            ResultSet results = statement.executeQuery();

            results.next();
            result = new Status(results.getInt("status_id"), results.getString("name"));

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    public static ObservableList<Status> getStatusList() {
        ObservableList<Status> result = FXCollections.observableArrayList();

        try {
            PreparedStatement statement = connection.getConnection().prepareStatement("SELECT  * FROM gr3_Status");

            ResultSet results = statement.executeQuery();

            while (results.next()) {
                Status tmp = new Status(results.getInt("Status_id"), results.getString("name"));

                result.add(tmp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }
    




    public static Priority getPriority(int id) {
        Priority result = null;
        try {
            PreparedStatement statement = connection.getConnection().prepareStatement("SELECT * FROM gr3_Prioritaet WHERE prioritaet_id = " + id);
            ResultSet results = statement.executeQuery();

            results.next();
            result = new Priority(results.getInt("prioritaet_id"), results.getString("name"));

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    public static ObservableList<Priority> getPriorityList() {
        ObservableList<Priority> list = FXCollections.observableArrayList();

        try {
            PreparedStatement statement = connection.getConnection().prepareStatement("SELECT * FROM gr3_Prioritaet");

            ResultSet results = statement.executeQuery();

            while (results.next()) {
                Priority tmp = new Priority(results.getInt("prioritaet_id"), results.getString("name"));

                list.add(tmp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }


    public static ToDo getToDo(int id) {
        ToDo result = null;
        try {
            PreparedStatement statement = connection.getConnection().prepareStatement("SELECT * FROM gr3_ToDo WHERE todo_id = " + id);
            ResultSet results = statement.executeQuery();

            results.next();
            result = new ToDo(results.getInt("todo_id"), results.getString("name"), results.getString("beschreibung"), results.getInt("status_id"), results.getInt("prioritaet_id"));

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    public static ObservableList<ToDo> getToDoList() {
        ObservableList<ToDo> list = FXCollections.observableArrayList();

        AbstractDatabase conn = Connect.connect();
        try {
            PreparedStatement statement = conn.getConnection().prepareStatement("SELECT * FROM gr3_ToDo");

            ResultSet results = statement.executeQuery();

            while (results.next()) {
                ToDo tmp = new ToDo(results.getInt("todo_id"), results.getString("name"), results.getString("beschreibung"), results.getInt("status_id"), results.getInt("prioritaet_id"));

                list.add(tmp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }



}
