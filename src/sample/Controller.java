package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    ObservableList<Contact> contacts = FXCollections.observableArrayList();

    @FXML
    TextField name;

    @FXML
    TextField phone;

    @FXML
    TextField email;

    @FXML
    ListView list;

    public void addItem() {
        if (name.getText().isEmpty() || phone.getText().isEmpty() || email.getText().isEmpty()) {
            return;
        }
        else {
            contacts.add(new Contact(name.getText(), phone.getText(), email.getText()));
            name.setText("");
            phone.setText("");
            email.setText("");

        }
    }

    public void removeItem() {
        Contact contactoid = (Contact) list.getSelectionModel().getSelectedItem();
        contacts.remove(contactoid);
    }

    //implements Initializable (from public class Controller implements Initializable)
    //made the whole signature red, saying Class 'Controller' must either be declared
    //abstract or implement abstract method 'initialize(URL, ResourceBundle)' in 'Initializable'
    //solution was to add the below statement
    //.setItems is a method from ListView, to make it use contacts, and its all inside the
    //initialize method

    public void initialize(URL location, ResourceBundle resources) {
        list.setItems(contacts);
    }
}
