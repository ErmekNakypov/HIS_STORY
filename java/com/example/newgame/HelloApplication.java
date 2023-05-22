package com.example.newgame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class HelloApplication extends Application {


    @Override
    public void start(Stage stage) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));

        Scene scene = createAdjustedScene(root, stage);

        scene.addEventFilter(KeyEvent.KEY_PRESSED, event -> {
            if (event.getCode() == KeyCode.ESCAPE && stage.isFullScreen()) {
                event.consume();
            }
        });

        stage.setTitle("His Story");
        stage.setFullScreenExitHint("");
        stage.setFullScreen(true);
        stage.setScene(scene);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();
    }

    private static Scene createAdjustedScene(Parent fxmlLoader, Stage stage) throws IOException {
        Scene scene = new Scene(fxmlLoader);

        Screen screen = Screen.getPrimary();
        Rectangle2D bounds = screen.getVisualBounds();

        stage.setWidth(bounds.getWidth());
        stage.setHeight(bounds.getHeight());

        return scene;
    }

    public static void main(String[] args) {
        launch();
    }
}