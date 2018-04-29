package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

// to sleep between new scenes
import java.util.concurrent.TimeUnit;

public class Controller {
    // set up initial scenario
    public Scenario s = new Scenario();

    void populateScene() {
        s.new_scenario();
        lab.setText(s.info());
        // oLab.setText("");
    }

    @FXML // pull-lever button
    private Button pBtn;

    @FXML // leave-lever button
    private Button lBtn;

    @FXML // center image
    private ImageView imgv;

    @FXML // label for scenario info
    private Label lab;

    @FXML // label for scenario outcome
    private Label oLab;

    @FXML
    void pullLever(ActionEvent event) {
        System.out.println("The lever has been pulled.");
        s.kill(1);
        oLab.setText(s.conclusion);
        populateScene();
    }

    @FXML
    void leaveLever(ActionEvent event) {
        System.out.println("The lever has been left.");
        s.kill(0);
        oLab.setText(s.conclusion);
        populateScene();
    }
}
