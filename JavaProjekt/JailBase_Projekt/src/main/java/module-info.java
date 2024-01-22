module de.toki.jailbase_projekt {
    requires javafx.controls;
    requires javafx.fxml;


    opens de.toki.jailbase_projekt to javafx.fxml;
    exports de.toki.jailbase_projekt;
}