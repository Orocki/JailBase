package de.toki.jailbase_projekt;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class InmatesController implements Initializable {

    @FXML
    private ImageView inmate_Bild, inmate_Bild1, inmate_Bild2, inmate_Bild3, inmate_Bild4, inmate_Bild5, inmate_Bild6, inmate_Bild7, inmate_Bild8, inmate_Bild9;
    @FXML
    private Label inmate_Name, inmate_Name1, inmate_Name2, inmate_Name3, inmate_Name4, inmate_Name5, inmate_Name6, inmate_Name7, inmate_Name8, inmate_Name9;
    @FXML
    private Label inmate_BookD, inmate_BookD1, inmate_BookD2, inmate_BookD3, inmate_BookD4, inmate_BookD5, inmate_BookD6, inmate_BookD7, inmate_BookD8, inmate_BookD9;
    @FXML
    private TextArea charges_field, charges_field1, charges_field2, charges_field3, charges_field4, charges_field5, charges_field6, charges_field7, charges_field8, charges_field9;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        String auswahl = JailAuswahl.getAuswahl();
        Inmate inmate = new Inmate();
        //Hier werden die IDs der Jails
        inmate.fill(
                auswahl
        );


        Records r;

        /*for (int i = 0; i <= 9; i++ )
        {
            r = inmate.getInmates().get(i);
            if (r.getMugshot() == "https://imgstore.jailbase.com/widgets/NoMug.gif")
            {
                r.setMugshot("https://th.bing.com/th/id/OIP.0QG5BDtlFMLl66Qe_UG1gAHaHr?rs=1&pid=ImgDetMain");
            }
        }*/

        r = inmate.getInmates().get(0);
        inmate_Bild.setImage(new Image(r.getMugshot()));
        inmate_Name.setText(r.getName());
        inmate_BookD.setText(r.getBook_date_formatted());
        for (var charge: r.getCharges())
        {
            charges_field.setText(charges_field.getText() + charge + "\n");
        }

        r = inmate.getInmates().get(1);
        inmate_Bild1.setImage(new Image(r.getMugshot()));
        inmate_Name1.setText(r.getName());
        inmate_BookD1.setText(r.getBook_date_formatted());
        for (var charge: r.getCharges())
        {
            charges_field1.setText(charges_field1.getText() + charge + "\n");
        }

        r = inmate.getInmates().get(2);
        inmate_Bild2.setImage(new Image(r.getMugshot()));
        inmate_Name2.setText(r.getName());
        inmate_BookD2.setText(r.getBook_date_formatted());
        for (var charge: r.getCharges())
        {
            charges_field2.setText(charges_field2.getText() + charge + "\n");
        }

        r = inmate.getInmates().get(3);
        inmate_Bild3.setImage(new Image(r.getMugshot()));
        inmate_Name3.setText(r.getName());
        inmate_BookD3.setText(r.getBook_date_formatted());
        for (var charge: r.getCharges())
        {
            charges_field3.setText(charges_field3.getText() + charge + "\n");
        }

        r = inmate.getInmates().get(4);
        inmate_Bild4.setImage(new Image(r.getMugshot()));
        inmate_Name4.setText(r.getName());
        inmate_BookD4.setText(r.getBook_date_formatted());
        for (var charge: r.getCharges())
        {
            charges_field4.setText(charges_field4.getText() + charge + "\n");
        }

        r = inmate.getInmates().get(5);
        inmate_Bild5.setImage(new Image(r.getMugshot()));
        inmate_Name5.setText(r.getName());
        inmate_BookD5.setText(r.getBook_date_formatted());
        for (var charge: r.getCharges())
        {
            charges_field5.setText(charges_field5.getText() + charge + "\n");
        }

        r = inmate.getInmates().get(6);
        inmate_Bild6.setImage(new Image(r.getMugshot()));
        inmate_Name6.setText(r.getName());
        inmate_BookD6.setText(r.getBook_date_formatted());
        for (var charge: r.getCharges())
        {
            charges_field6.setText(charges_field6.getText() + charge + "\n");
        }

        r = inmate.getInmates().get(7);
        inmate_Bild7.setImage(new Image(r.getMugshot()));
        inmate_Name7.setText(r.getName());
        inmate_BookD7.setText(r.getBook_date_formatted());
        for (var charge: r.getCharges())
        {
            charges_field7.setText(charges_field7.getText() + charge + "\n");
        }

        r = inmate.getInmates().get(8);
        inmate_Bild8.setImage(new Image(r.getMugshot()));
        inmate_Name8.setText(r.getName());
        inmate_BookD8.setText(r.getBook_date_formatted());
        for (var charge: r.getCharges())
        {
            charges_field8.setText(charges_field8.getText() + charge + "\n");
        }

        r = inmate.getInmates().get(9);
        inmate_Bild9.setImage(new Image(r.getMugshot()));
        inmate_Name9.setText(r.getName());
        inmate_BookD9.setText(r.getBook_date_formatted());
        for (var charge: r.getCharges())
        {
            charges_field9.setText(charges_field9.getText() + charge + "\n");
        }



        //charges1_field.setText(r.getCharges().get(0));

    }
}
