package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import sample.model.Status;

public class StatusController {

    public TextField nameTextField;
    public ListView<Status> statusListView;
    public Status selectedItem = null;

    public void initialize() {
        refreshList();
    }

    private void refreshList() {
        statusListView.setItems(Status.getList());
    }

    public void itemSelected(MouseEvent mouseEvent) {
        Status s = statusListView.getSelectionModel().getSelectedItem();
        if (s != null) {
            nameTextField.setText(s.getName());
            selectedItem = s;
        }
    }


    public void savedClicked(ActionEvent actionEvent) {

    }

    public void cancelClicked(ActionEvent actionEvent) {
        //close dialog

    }

    public void deleteClicked(ActionEvent actionEvent) {

    }

    public void newClicked(ActionEvent actionEvent) {
        selectedItem = null;
        nameTextField.clear();
        statusListView.getSelectionModel().clearSelection();
    }

}