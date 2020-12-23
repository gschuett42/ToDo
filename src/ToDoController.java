import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import model.Status;
import model.ToDo;

public class ToDoController {

    public TextField nameTextField;
    public ComboBox statusComboBox;
    public ComboBox priorityComboBox;
    private ToDo selected = null;
    private ObservableList <ToDo> todoList;
    public void setToDo(ToDo item){
        selected = item;
       // displayItem();
    }
    private void displayItem(){
        int i = 0;
        nameTextField.setText(selected.getName());
        for(i = 0; i < statusComboBox.getItems().size();++i){
            if(statusComboBox.getId()=selected.getStatus_id){
                break;
            }
        }
        statusComboBox.getSelectionModel().select(i);
    }
    public void setToDoList(ObservableList<ToDo> list){
        this.todoList = list;
    }

}
