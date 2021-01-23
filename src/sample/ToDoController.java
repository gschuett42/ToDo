package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import sample.model.Priority;
import sample.model.Status;
import sample.model.ToDo;

public class ToDoController {


    public TextField nameTextField;
    public TextArea descriptionTextArea;
    public ComboBox<Status> statusComboBox;
    public ComboBox<Priority> priorityComboBox;
    private ToDo selectedItem;
    private Controller parent;

    public void initialize() {
        displayItem();
    }

    public void setParent(Controller parent) {
        this.parent = parent;
    }

    public void setSelectedItem(ToDo item) {
        selectedItem = item;
        displayItem();
    }

    private void displayItem() {
        if (selectedItem != null) {
            nameTextField.setText(selectedItem.getName());

            descriptionTextArea.setText(selectedItem.getDescription());

            statusComboBox.setItems(Status.getList());
            statusComboBox.getSelectionModel().select(selectedItem.getStatus());

            priorityComboBox.setItems(Priority.getList());
            priorityComboBox.getSelectionModel().select(selectedItem.getPriority());
        }
    }

}
