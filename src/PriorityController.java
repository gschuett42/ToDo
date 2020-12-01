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

public class PriorityController {
    public TextField nameTextField;
    public ListView<Priority> priorityListView;
    public Priority selectedItem = null;

    public void initialize(){
        priorityListView.setItems(Priority.getList());
    }
    public void itemSelected(MouseEvent mouseEvent) {
        Priority p = priorityListView.getSelectionModel().getSelectedItem();
        if(p != null){
            nameTextField.setText(p.getName());
            selectedItem = p;
        }
    }

    public void saveClicked(ActionEvent actionEvent) {
        //update existing one
        // insert new
        Priority p = priorityListView.getSelectionModel().getSelectedItem();
        p.setName(nameTextField.getText());
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
        priorityListView.getSelectionModel().clearSelection();
    }

    public void deleteClicked(ActionEvent actionEvent) {
        if (selectedItem != null) {
            //delete item
            if (priorityListView.getItems().contains(selectedItem)) {
                priorityListView.getItems().remove(selectedItem);
            }
        }
    }
}
