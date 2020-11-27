import javafx.event.ActionEvent;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import model.Status;

public class StatusController {
    public TextField nameTextField;
    public ListView<Status> statusListView;
    public void initialize(){
        statusListView.setItems(Status.getList());
    }
    public void itemSelected(MouseEvent mouseEvent) {
        Status s = statusListView.getSelectionModel().getSelectedItem();
        if(s != null){
            nameTextField.setText(s.getName());
        }
    }

    public void saveClicked(ActionEvent actionEvent) {
    }

    public void escapeClicked(ActionEvent actionEvent) {
    }

    public void newClicked(ActionEvent actionEvent) {
    }

    public void deleteClicked(ActionEvent actionEvent) {
    }
}
