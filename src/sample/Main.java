package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene scene = new Scene(root, 600, 400);

        primaryStage.setTitle("");
        primaryStage.setScene(scene);

        // scene.getStylesheets().add() // add the CSS for the scene.
        primaryStage.show();
    }

    public static void main(String[] args) {
        // start the audio player
        try {
            SimpleAudioPlayer aplayer = new SimpleAudioPlayer("file.wav");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        // start the GUI
        launch(args);
    }
}
