module de.toki.jailbase_projekt {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires com.google.gson;


    opens de.toki.jailbase_projekt to javafx.fxml, com.google.gson;
    exports de.toki.jailbase_projekt;
}