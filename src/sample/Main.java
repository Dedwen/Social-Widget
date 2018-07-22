package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Widget");
        primaryStage.setScene(new Scene(root, 500, 100));
        primaryStage.initStyle(StageStyle.TRANSPARENT); // transparencity of stage
        //position of the screen
        Screen screen = Screen.getPrimary();
        Rectangle2D bounds = screen.getVisualBounds();
        primaryStage.setX( bounds.getHeight() / 1.5 ); // Center the screen
        primaryStage.setY( bounds.getMinY() ); // Up the screen

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
