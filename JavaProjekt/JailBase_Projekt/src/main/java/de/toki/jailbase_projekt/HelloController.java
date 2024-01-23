package de.toki.jailbase_projekt;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.stream.Collectors;


public class HelloController implements Initializable {

    @FXML private Pane pane;
    @FXML
    private ComboBox<String> cb_stateauswahl;
    @FXML
    private ImageView inmate_Bild1;
    @FXML
    private TextArea state_text;
    @FXML
    private Button btn_inmatesanzeigen;
    @FXML
    private ComboBox<String> cb_jailauswahl;


    public HelloController() {
    }

    // Diese Methode wird aufgerufen, wenn die FXML-Datei geladen wird
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        File directoryPath = new File("C:\\Users\\jajag_6\\Downloads\\IDs");
        //List of all files and directories
        String contents[] = directoryPath.list();

        //System.out.println("List of files and directories in the specified directory:");

        for (int i = 0; i < Objects.requireNonNull(contents).length; i++)
        {
            contents[i] = contents[i].replaceAll(".txt", "");
        }

        // Hier kannst du die ComboBox initialisieren
        // Füge beispielsweise Optionen hinzu
        ObservableList<String> options = FXCollections.observableArrayList(
                contents
        );

        // Setze die Optionen für die ComboBox
        cb_stateauswahl.setItems(options);
        // Du kannst auch Listener hinzufügen, um auf Auswahländerungen zu reagieren
        cb_stateauswahl.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            // Hier kannst du auf Auswahländerungen reagieren
            System.out.println("Auswahl geändert zu: " + newValue);
            state_text.setText(newValue);

            try {
                BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\jajag_6\\Downloads\\IDs\\" + newValue +".txt" ));
                var lines = in.lines().toList();
                ObservableList<String> jails = FXCollections.observableArrayList(
                        lines
                );
                cb_jailauswahl.setItems(jails);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }

            String s = cb_jailauswahl.getSelectionModel().getSelectedItem();

        });


        btn_inmatesanzeigen.setOnAction(event -> openNewView());


        inmate_Bild1.setImage(new Image("https://imgstore.jailbase.com/small/arrested/ky-hcj/2018-07-07/irving-dales-30953.pic1.jpg"));
    }

    private void openNewView() {
        try {
            // Load the new FXML file
            Stage stage2 = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Inmates.fxml"));
            Scene scene2 = new Scene(fxmlLoader.load(), 751, 518);
            stage2.setTitle("Hello!");
            //stage.getIcons().add(new Image("https://th.bing.com/th/id/OIP.0QG5BDtlFMLl66Qe_UG1gAHaHr?rs=1&pid=ImgDetMain"));
            stage2.setScene(scene2);
            stage2.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
