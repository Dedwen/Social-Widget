package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import static java.lang.System.exit;


public class Controller {

    @FXML
    private Button facebook;
    @FXML
    private Button twitter;
    @FXML
    private Button googlePlus;
    @FXML
    private Button linkedin;
    @FXML
    private Button instagram;
    @FXML
    private Button pinterest;
    @FXML
    private Button close;

    @FXML
    private void openFacebook() {
        try {
            Desktop.getDesktop().browse(new URL("https://www.facebook.com").toURI());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void openTwitter() {
        try {
            Desktop.getDesktop().browse(new URL("https://www.twitter.com").toURI());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void openGooglePlus() {
        try {
            Desktop.getDesktop().browse(new URL("https://www.plus.google.com/").toURI());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void openLinkedin() {
        try {
            Desktop.getDesktop().browse(new URL("https://www.linkedin.com").toURI());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void openInstagram() {
        try {
            Desktop.getDesktop().browse(new URL("https://www.instagram.com").toURI());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void openPinterest() {
        try {
            Desktop.getDesktop().browse(new URL("https://www.pinterest.com").toURI());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void onClose() {
        exit(0);
    }


}