import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import model.Status;
import model.ToDo;

public class ToDoController {

    public TextField nameTextField;
    public ComboBox statusComboBox;
    public ComboBox priorityComboBox;
    private ToDo selected = null;
    public void setToDo(ToDo item){
        selected = item;
        displayItem();
    }
    private void displayItem(){
        /**
        Hier sollen die Daten vom "selected" angezeigt werden.
         */statusComboBox.setItems(new Status().getList());
        int i = 0;
        nameTextField.setText(selected.getName());
        for(i = 0; i < statusComboBox.getItems().size();++i){
            if(statusComboBox.getItems().get(i).getId()==selected.getStatus().getId()){
                break;
            }
        }
        statusComboBox.getSelectionModel().select(i);
    }

}
