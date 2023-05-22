//package com.example.newgame;
//
//import javafx.scene.media.Media;
//import javafx.scene.media.MediaPlayer;
//import javafx.scene.media.MediaView;
//import javafx.util.Duration;
//
//import java.io.File;
//
//public class VideoPlayer {
//    private MediaPlayer mediaPlayer;
//    private MediaView mediaView;
//
//    public VideoPlayer(Media media) {
//        mediaPlayer = new MediaPlayer(media);
//        mediaView = new MediaView(mediaPlayer);
//    }
//
//    public MediaPlayer getMediaPlayer() {
//        return mediaPlayer;
//    }
//
//    public MediaView getMediaView() {
//        return mediaView;
//    }
//
//    public void play() {
//        mediaPlayer.play();
//    }
//
//    public void pause() {
//        mediaPlayer.pause();
//    }
//
//    public void stop() {
//        mediaPlayer.stop();
//    }
//
//    public void setVolume(double volume) {
//        mediaPlayer.setVolume(volume);
//    }
//
//    public void seekTo(double seconds) {
//        mediaPlayer.seek(Duration.seconds(seconds));
//    }
//
//    public Duration getTotalDuration() {
//        return mediaPlayer.getTotalDuration();
//    }
//
//    public Duration getCurrentTime() {
//        return mediaPlayer.getCurrentTime();
//    }
//
//    public boolean isPlaying() {
//        return mediaPlayer.getStatus() == MediaPlayer.Status.PLAYING;
//    }
//
//
//}
