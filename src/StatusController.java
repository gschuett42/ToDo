import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import model.Priority;
import model.Status;

import java.io.IOException;

public class StatusController {
    public TextField nameTextField;
    public ListView<Status> statusListView;
    public Status selectedItem = null;


    public void initialize() {
        statusListView.setItems(Status.getList());
    }

    public void itemSelected(MouseEvent mouseEvent) {
        Status s = statusListView.getSelectionModel().getSelectedItem();

        if (s != null) {
            nameTextField.setText(s.getName());
            selectedItem = s;
        }

    }

    public void saveClicked(ActionEvent actionEvent) {
        if (selectedItem != null) {
            selectedItem.setName(nameTextField.getText());
        } else {
            Status s = new Status(0, nameTextField.getText());

            statusListView.getItems().add(s);
            statusListView.getSelectionModel().selectLast();
            selectedItem = s;
            statusListView.refresh();

        }
    }

    public void escapeClicked(ActionEvent actionEvent) {
        try {
            //close existing

            //get back by opening
            Parent root = FXMLLoader.load(getClass().getResource("scene.fxml"));
            Stage s = new Stage();
            s.setTitle("hello world");
            s.setScene(new Scene(root));
            s.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void newClicked(ActionEvent actionEvent) {
        selectedItem = null;
        nameTextField.clear();
        statusListView.getSelectionModel().clearSelection();
    }

    public void deleteClicked(ActionEvent actionEvent) {
        if (selectedItem != null) {
            //delete item
            if (statusListView.getItems().contains(selectedItem)) {
                statusListView.getItems().remove(selectedItem);
                selectedItem = null;
                nameTextField.clear();
            }
        }
    }
}
