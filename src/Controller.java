import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.Priority;
import model.Status;
import model.ToDo;

import java.io.IOException;

public class Controller {
    public ListView<ToDo> todoListView;
    public ComboBox<Priority> priorityComboBox;
    public ComboBox<Status> statusComboBox;
    public TextField ticketnameTextField;
    public Pane contentPane;

    public void onStatusClicked(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("status.fxml"));
            Stage s = new Stage();
            s.setTitle("Stati");
            s.setScene(new Scene(root));
            s.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void onPriorityClicked(ActionEvent actionEvent) {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("priority.fxml"));
            Stage s = new Stage();
            s.setTitle("Prioritäten");
            s.setScene(new Scene(root));
            s.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

