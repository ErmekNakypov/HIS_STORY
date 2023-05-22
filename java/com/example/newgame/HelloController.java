package com.example.newgame;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;


import java.io.IOException;
import java.nio.file.Paths;


public class HelloController {

    @FXML
    private MediaView mediaView;

    @FXML
    private VBox mainPane;

    @FXML
    private Button playButton;

    @FXML
    private Button exitButton;

    private MediaPlayer mediaPlayer;
    private MediaPlayer backgroundMusicPlayer;

    @FXML
    private void initialize() {
        String videoFile = "C:\\Users\\space\\OneDrive\\Рабочий стол\\game_jv\\newgame\\src\\main\\resources\\com\\example\\newgame\\main_intro.mp4";
        Media media = new Media(Paths.get(videoFile).toUri().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaView.setMediaPlayer(mediaPlayer);

        mediaPlayer.setOnEndOfMedia(() -> {
            mediaPlayer.stop();
            Platform.runLater(this::showMainScreen);
        });

        mediaPlayer.setOnReady(() -> {
            Stage stage = (Stage) mediaView.getScene().getWindow();
            stage.setFullScreen(true);
            mediaPlayer.play();
        });


        mediaPlayer.play();
    }

    private void showMainScreen() {
        mainPane.setVisible(true);
        playBackgroundMusic();
    }

    private void playBackgroundMusic() {
        String musicFile = "C:\\Users\\space\\OneDrive\\Рабочий стол\\game_jv\\newgame\\src\\main\\resources\\com\\example\\newgame\\main_screen_music.mp3";
        Media music = new Media(Paths.get(musicFile).toUri().toString());
        backgroundMusicPlayer = new MediaPlayer(music);
        backgroundMusicPlayer.setCycleCount(MediaPlayer.INDEFINITE);
        backgroundMusicPlayer.play();
    }

    @FXML
    private void handlePlayButton(ActionEvent event) throws IOException {
        backgroundMusicPlayer.stop();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("database.fxml"));
        Parent gameRoot = loader.load();
        Scene gameScene = new Scene(gameRoot);
        Stage stage = (Stage) mediaView.getScene().getWindow();
        stage.setScene(gameScene);
    }

    @FXML
    private void handleExitButton(ActionEvent event) {
        showAlert("Exit button clicked!");
        System.exit(0);
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}