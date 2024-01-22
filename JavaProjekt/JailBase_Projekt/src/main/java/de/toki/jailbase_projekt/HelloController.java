package de.toki.jailbase_projekt;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;


public class HelloController implements Initializable {

    @FXML private Pane pane;
    @FXML
    private ComboBox<String> stateAuswahl;
    @FXML
    private ImageView inmate_Bild1;
    @FXML
    private TextArea state_text;

    public HelloController() {
    }

    // Diese Methode wird aufgerufen, wenn die FXML-Datei geladen wird
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        File directoryPath = new File("C:\\Users\\Donik\\Downloads\\IDs");
        //List of all files and directories
        String contents[] = directoryPath.list();

        //System.out.println("List of files and directories in the specified directory:");
        for (int i = 0; i < Objects.requireNonNull(contents).length; i++)
        {
            contents[i].replaceAll(".txt", " ");
        }
        // Hier kannst du die ComboBox initialisieren
        // Füge beispielsweise Optionen hinzu
        ObservableList<String> options = FXCollections.observableArrayList(

        contents

        );

        // Setze die Optionen für die ComboBox
        stateAuswahl.setItems(options);
        // Du kannst auch Listener hinzufügen, um auf Auswahländerungen zu reagieren
        stateAuswahl.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            // Hier kannst du auf Auswahländerungen reagieren
            System.out.println("Auswahl geändert zu: " + newValue);

            //state_text.setText(newValue);
        });

        inmate_Bild1.setImage(new Image("https://imgstore.jailbase.com/small/arrested/ky-hcj/2018-07-07/irving-dales-30953.pic1.jpg"));
    }


}
