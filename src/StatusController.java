import javafx.event.ActionEvent;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import model.Status;

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
            //update existing one
        } else {
// insert new
        }
    }

    public void escapeClicked(ActionEvent actionEvent) {
        //close dialog
    }

    public void newClicked(ActionEvent actionEvent) {
        selectedItem = null;
        nameTextField.clear();
        statusListView.getSelectionModel().clearSelection();
    }

    public void deleteClicked(ActionEvent actionEvent) {
        if (selectedItem != null) {
            //delete item
        }
    }
}
