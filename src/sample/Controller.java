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
    TextField text;
    //dont need an @FXML for each instance of TextField, because the type is already handleds

    @FXML
    ListView list;

    public void addItem() {
        System.out.println("addItem");
    }

    public void removeItem() {
        System.out.println("removeItem");
    }

    //implements Initializable (from public class Controller implements Initializable)
    //made the whole signature red, saying Class 'Controller' must either be declared
    //abstract or implement abstract method 'initialize(URL, ResourceBundle)' in 'Initializable'
    //solution was to add the below statement

    public void initialize(URL location, ResourceBundle resources) {
        list.setContacts(contacts);
    }
}
