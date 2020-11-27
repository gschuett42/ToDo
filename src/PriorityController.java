import javafx.event.ActionEvent;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import model.Priority;
import model.Status;

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

    public void cancelClicked(ActionEvent actionEvent) {
        //close dialog
    }

    public void safeClicked(ActionEvent actionEvent) {
        if(selectedItem !=null){
            //update
        }else{
            //insert
        }
    }

    public void deleteClicked(ActionEvent actionEvent) {
        if(selectedItem!=null){
            //delete
        }
    }

    public void newClicked(ActionEvent actionEvent) {
        selectedItem = null;
        nameTextField.clear();
        priorityListView.getSelectionModel().clearSelection();
    }
}
