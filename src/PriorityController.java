import javafx.event.ActionEvent;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import model.Priority;
import model.Status;

public class PriorityController {
    public TextField nameTextField;
    public ListView<Priority> priorityListView;

    public void initialize(){
        priorityListView.setItems(Priority.getList());
    }
    public void itemSelected(MouseEvent mouseEvent) {
        Priority p = priorityListView.getSelectionModel().getSelectedItem();
        if(p != null){
            nameTextField.setText(p.getName());
        }
    }

    public void cancelClicked(ActionEvent actionEvent) {
    }

    public void safeClicked(ActionEvent actionEvent) {
    }

    public void deleteClicked(ActionEvent actionEvent) {
    }

    public void newClicked(ActionEvent actionEvent) {
    }
}
