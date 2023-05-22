package com.example.newgame;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;

public class DatabaseController {

    @FXML
    private TableView<VideoRecord> tableView;
    @FXML
    private TextField searchField;
    @FXML
    private Button searchButton;


    @FXML
    private TableColumn<VideoRecord, Integer> nums;
    @FXML
    private TableColumn<VideoRecord, String> vids;

    private ObservableList<VideoRecord> videoRecords = FXCollections.observableArrayList();
    private ObservableList<VideoRecord> searchResults = FXCollections.observableArrayList();
    //private VideoPlayer videoPlayer;

    private MediaPlayer mediaPlayer;
    @FXML
    private MediaView mediaView;

    private MediaPlayer backgroundMusicPlayer;

    public void initialize() {
        String musicFile = "C:\\Users\\space\\OneDrive\\Рабочий стол\\game_jv\\newgame\\src\\main\\resources\\com\\example\\newgame\\backmus.mp3";
        Media music = new Media(Paths.get(musicFile).toUri().toString());
        backgroundMusicPlayer = new MediaPlayer(music);
        backgroundMusicPlayer.setCycleCount(MediaPlayer.INDEFINITE);
        backgroundMusicPlayer.play();
        vids.setCellValueFactory(new PropertyValueFactory<>("title"));

        ArrayList<String> ls1 = new ArrayList<>();
        ls1.add("Рысбек");
        ls1.add("Женат");
        ls1.add("Убийство");
        VideoRecord vd1 = new VideoRecord("Video #1", ls1);
        vd1.setPath("C:\\Users\\space\\OneDrive\\Рабочий стол\\game_jv\\newgame\\src\\main\\resources\\com\\example\\newgame\\videos\\vid1.mp4");
        addVideoRecord(vd1);

        ArrayList<String> ls2 = new ArrayList<>();
        ls2.add("Эрика");
        ls2.add("Женат");
        VideoRecord vd2 = new VideoRecord("Video #2", ls2);
        vd2.setPath("C:\\Users\\space\\OneDrive\\Рабочий стол\\game_jv\\newgame\\src\\main\\resources\\com\\example\\newgame\\videos\\vid2.mp4");
        addVideoRecord(vd2);

        ArrayList<String> ls3 = new ArrayList<>();
        ls3.add("Она");
        ls3.add("Глаза");
        ls3.add("Очки");
        VideoRecord vd3 = new VideoRecord("Video #3", ls3);
        vd3.setPath("C:\\Users\\space\\OneDrive\\Рабочий стол\\game_jv\\newgame\\src\\main\\resources\\com\\example\\newgame\\videos\\vid3.mp4");
        addVideoRecord(vd3);

        ArrayList<String> ls4 = new ArrayList<>();
        ls4.add("Дом");
        ls4.add("Кровь");
        ls4.add("Очки");
        VideoRecord vd4 = new VideoRecord("Video #4", ls4);
        vd4.setPath("C:\\Users\\space\\OneDrive\\Рабочий стол\\game_jv\\newgame\\src\\main\\resources\\com\\example\\newgame\\videos\\vid4.mp4");
        addVideoRecord(vd4);

        ArrayList<String> ls5 = new ArrayList<>();
        ls5.add("Кража");
        ls5.add("Мотив");
        ls5.add("Убийца");
        ls5.add("Личный");
        VideoRecord vd5 = new VideoRecord("Video #5", ls5);
        vd5.setPath("C:\\Users\\space\\OneDrive\\Рабочий стол\\game_jv\\newgame\\src\\main\\resources\\com\\example\\newgame\\videos\\vid5.mp4");
        addVideoRecord(vd5);

        ArrayList<String> ls6 = new ArrayList<>();
        ls6.add("Ссора");
        ls6.add("Жизнь");
        VideoRecord vd6 = new VideoRecord("Video #6", ls6);
        vd6.setPath("C:\\Users\\space\\OneDrive\\Рабочий стол\\game_jv\\newgame\\src\\main\\resources\\com\\example\\newgame\\videos\\vid6.mp4");
        addVideoRecord(vd6);

        ArrayList<String> ls7 = new ArrayList<>();
        ls7.add("Ссора");
        ls7.add("Ругань");
        ls7.add("Паб");
        ls7.add("Работа");
        ls7.add("Забыть");
        ls7.add("Арсен");
        ls7.add("Алтынай");
        VideoRecord vd7 = new VideoRecord("Video #7", ls7);
        vd7.setPath("C:\\Users\\space\\OneDrive\\Рабочий стол\\game_jv\\newgame\\src\\main\\resources\\com\\example\\newgame\\videos\\vid7.mp4");
        addVideoRecord(vd7);

        ArrayList<String> ls8 = new ArrayList<>();
        ls8.add("Работа");
        ls8.add("Мама");
        ls8.add("Дети");
        ls8.add("Мысли");
        VideoRecord vd8 = new VideoRecord("Video #8", ls8);
        vd8.setPath("C:\\Users\\space\\OneDrive\\Рабочий стол\\game_jv\\newgame\\src\\main\\resources\\com\\example\\newgame\\videos\\vid8.mp4");
        addVideoRecord(vd8);

        ArrayList<String> ls9 = new ArrayList<>();
        ls9.add("Арсен");
        ls9.add("Алтынай");
        ls9.add("Дети");
        VideoRecord vd9 = new VideoRecord("Video #9", ls9);
        vd9.setPath("C:\\Users\\space\\OneDrive\\Рабочий стол\\game_jv\\newgame\\src\\main\\resources\\com\\example\\newgame\\videos\\vid9.mp4");
        addVideoRecord(vd9);

        ArrayList<String> ls10 = new ArrayList<>();
        ls10.add("Спор");
        ls10.add("Рустам");
        ls10.add("Друг");
        VideoRecord vd10 = new VideoRecord("Video #10", ls10);
        vd10.setPath("C:\\Users\\space\\OneDrive\\Рабочий стол\\game_jv\\newgame\\src\\main\\resources\\com\\example\\newgame\\videos\\vid10.mp4");
        addVideoRecord(vd10);

        ArrayList<String> ls11 = new ArrayList<>();
        ls11.add("Глаза");
        ls11.add("Рустам");
        ls11.add("Друг");
        ls11.add("Детсво");
        VideoRecord vd11 = new VideoRecord("Video #11", ls11);
        vd11.setPath("C:\\Users\\space\\OneDrive\\Рабочий стол\\game_jv\\newgame\\src\\main\\resources\\com\\example\\newgame\\videos\\vid11.mp4");
        addVideoRecord(vd11);

        ArrayList<String> ls12 = new ArrayList<>();
        ls12.add("Деньги");
        VideoRecord vd12 = new VideoRecord("Video #12", ls12);
        vd12.setPath("C:\\Users\\space\\OneDrive\\Рабочий стол\\game_jv\\newgame\\src\\main\\resources\\com\\example\\newgame\\videos\\vid12.mp4");
        addVideoRecord(vd12);

        ArrayList<String> ls13 = new ArrayList<>();
        ls13.add("Она");
        ls13.add("Документы");
        VideoRecord vd13 = new VideoRecord("Video #13", ls13);
        vd13.setPath("C:\\Users\\space\\OneDrive\\Рабочий стол\\game_jv\\newgame\\src\\main\\resources\\com\\example\\newgame\\videos\\vid13.mp4");
        addVideoRecord(vd13);

        ArrayList<String> ls14 = new ArrayList<>();
        ls14.add("Она");
        ls14.add("Дневник");
        VideoRecord vd14 = new VideoRecord("Video #14", ls14);
        vd14.setPath("C:\\Users\\space\\OneDrive\\Рабочий стол\\game_jv\\newgame\\src\\main\\resources\\com\\example\\newgame\\videos\\vid14.mp4");
        addVideoRecord(vd14);

        ArrayList<String> ls15 = new ArrayList<>();
        ls15.add("Дом");
        VideoRecord vd15 = new VideoRecord("Video #15", ls15);
        vd15.setPath("C:\\Users\\space\\OneDrive\\Рабочий стол\\game_jv\\newgame\\src\\main\\resources\\com\\example\\newgame\\videos\\vid15.mp4");
        addVideoRecord(vd15);

        ArrayList<String> ls16 = new ArrayList<>();
        ls16.add("Дом");
        ls16.add("Паб");
        ls16.add("Убийца");
        VideoRecord vd16 = new VideoRecord("Video #16", ls16);
        vd16.setPath("C:\\Users\\space\\OneDrive\\Рабочий стол\\game_jv\\newgame\\src\\main\\resources\\com\\example\\newgame\\videos\\vid16.mp4");
        addVideoRecord(vd16);

        ArrayList<String> ls17 = new ArrayList<>();
        ls17.add("Эрика");
        ls17.add("Убийца");
        VideoRecord vd17 = new VideoRecord("Video #17", ls17);
        vd17.setPath("C:\\Users\\space\\OneDrive\\Рабочий стол\\game_jv\\newgame\\src\\main\\resources\\com\\example\\newgame\\videos\\vid17.mp4");
        addVideoRecord(vd17);

        ArrayList<String> ls18 = new ArrayList<>();
        ls18.add("Работа");
        ls18.add("Расследование");
        VideoRecord vd18 = new VideoRecord("Video #18", ls18);
        vd18.setPath("C:\\Users\\space\\OneDrive\\Рабочий стол\\game_jv\\newgame\\src\\main\\resources\\com\\example\\newgame\\videos\\vid18.mp4");
        addVideoRecord(vd18);

        ArrayList<String> ls19 = new ArrayList<>();
        ls19.add("Рустам");
        ls19.add("Нурзада");
        VideoRecord vd19 = new VideoRecord("Video #19", ls19);
        vd19.setPath("C:\\Users\\space\\OneDrive\\Рабочий стол\\game_jv\\newgame\\src\\main\\resources\\com\\example\\newgame\\videos\\vid19.mp4");
        addVideoRecord(vd19);

        ArrayList<String> ls20 = new ArrayList<>();
        ls20.add("Рустам");
        ls20.add("Опрос");
        VideoRecord vd20 = new VideoRecord("Video #20", ls20);
        vd20.setPath("C:\\Users\\space\\OneDrive\\Рабочий стол\\game_jv\\newgame\\src\\main\\resources\\com\\example\\newgame\\videos\\vid20.mp4");
        addVideoRecord(vd20);

        ArrayList<String> ls21 = new ArrayList<>();
        ls21.add("Дом");
        ls21.add("Личный");
        VideoRecord vd21 = new VideoRecord("Video #21", ls21);
        vd21.setPath("C:\\Users\\space\\OneDrive\\Рабочий стол\\game_jv\\newgame\\src\\main\\resources\\com\\example\\newgame\\videos\\vid21.mp4");
        addVideoRecord(vd21);

        ArrayList<String> ls22 = new ArrayList<>();
        ls22.add("Друг");
        ls22.add("Друзья");
        VideoRecord vd22 = new VideoRecord("Video #22", ls22);
        vd22.setPath("C:\\Users\\space\\OneDrive\\Рабочий стол\\game_jv\\newgame\\src\\main\\resources\\com\\example\\newgame\\videos\\vid22.mp4");
        addVideoRecord(vd22);

        ArrayList<String> ls23 = new ArrayList<>();
        ls23.add("Эрика");
        ls23.add("Помню");
        VideoRecord vd23 = new VideoRecord("Video #23", ls23);
        vd23.setPath("C:\\Users\\space\\OneDrive\\Рабочий стол\\game_jv\\newgame\\src\\main\\resources\\com\\example\\newgame\\videos\\vid23.mp4");
        addVideoRecord(vd23);

        ArrayList<String> ls24 = new ArrayList<>();
        ls24.add("Беременна");
        VideoRecord vd24 = new VideoRecord("Video #24", ls24);
        vd24.setPath("C:\\Users\\space\\OneDrive\\Рабочий стол\\game_jv\\newgame\\src\\main\\resources\\com\\example\\newgame\\videos\\vid24.mp4");
        addVideoRecord(vd24);

        ArrayList<String> ls25 = new ArrayList<>();
        ls25.add("Родители");
        ls25.add("Аборт");
        ls25.add("Свадьба");
        ls25.add("Дети");
        VideoRecord vd25 = new VideoRecord("Video #25", ls25);
        vd25.setPath("C:\\Users\\space\\OneDrive\\Рабочий стол\\game_jv\\newgame\\src\\main\\resources\\com\\example\\newgame\\videos\\vid25.mp4");
        addVideoRecord(vd25);

        ArrayList<String> ls26 = new ArrayList<>();
        ls26.add("Жизнь");
        ls26.add("Нурзада");
        ls26.add("Свадьба");
        VideoRecord vd26 = new VideoRecord("Video #26", ls26);
        vd26.setPath("C:\\Users\\space\\OneDrive\\Рабочий стол\\game_jv\\newgame\\src\\main\\resources\\com\\example\\newgame\\videos\\vid26.mp4");
        addVideoRecord(vd26);

        ArrayList<String> ls27 = new ArrayList<>();
        ls27.add("Жизнь");
        ls27.add("Иссык-куль");
        VideoRecord vd27 = new VideoRecord("Video #27", ls27);
        vd27.setPath("C:\\Users\\space\\OneDrive\\Рабочий стол\\game_jv\\newgame\\src\\main\\resources\\com\\example\\newgame\\videos\\vid27.mp4");
        addVideoRecord(vd27);

        ArrayList<String> ls28 = new ArrayList<>();
        ls28.add("Мама");
        ls28.add("Книги");
        ls28.add("Рождение");
        ls28.add("Дети");
        ls28.add("Родители");
        VideoRecord vd28 = new VideoRecord("Video #28", ls28);
        vd28.setPath("C:\\Users\\space\\OneDrive\\Рабочий стол\\game_jv\\newgame\\src\\main\\resources\\com\\example\\newgame\\videos\\vid28.mp4");
        addVideoRecord(vd28);

        ArrayList<String> ls29 = new ArrayList<>();
        ls29.add("Алтынай");
        ls29.add("Счастлив");
        ls29.add("Рождение");
        ls29.add("Отец");
        VideoRecord vd29 = new VideoRecord("Video #29", ls29);
        vd29.setPath("C:\\Users\\space\\OneDrive\\Рабочий стол\\game_jv\\newgame\\src\\main\\resources\\com\\example\\newgame\\videos\\vid29.mp4");
        addVideoRecord(vd29);

        ArrayList<String> ls30 = new ArrayList<>();
        ls30.add("Алтынай");
        ls30.add("Арсен");
        ls30.add("Рождение");
        ls30.add("Мальчик");
        VideoRecord vd30 = new VideoRecord("Video #30", ls30);
        vd30.setPath("C:\\Users\\space\\OneDrive\\Рабочий стол\\game_jv\\newgame\\src\\main\\resources\\com\\example\\newgame\\videos\\vid30.mp4");
        addVideoRecord(vd30);

        ArrayList<String> ls31 = new ArrayList<>();
        ls31.add("Жизнь");
        ls31.add("Арсен");
        ls31.add("Квартира");
        ls31.add("Машина");
        ls31.add("Родители");
        VideoRecord vd31 = new VideoRecord("Video #31", ls31);
        vd31.setPath("C:\\Users\\space\\OneDrive\\Рабочий стол\\game_jv\\newgame\\src\\main\\resources\\com\\example\\newgame\\videos\\vid31.mp4");
        addVideoRecord(vd31);

        ArrayList<String> ls32 = new ArrayList<>();
        ls32.add("Отпечатки");
        VideoRecord vd32 = new VideoRecord("Video #32", ls32);
        vd32.setPath("C:\\Users\\space\\OneDrive\\Рабочий стол\\game_jv\\newgame\\src\\main\\resources\\com\\example\\newgame\\videos\\vid32.mp4");
        addVideoRecord(vd32);

        ArrayList<String> ls33 = new ArrayList<>();
        ls33.add("Кровь");
        ls33.add("Запись");
        VideoRecord vd33 = new VideoRecord("Video #33", ls33);
        vd33.setPath("C:\\Users\\space\\OneDrive\\Рабочий стол\\game_jv\\newgame\\src\\main\\resources\\com\\example\\newgame\\videos\\vid33.mp4");
        addVideoRecord(vd33);

        ArrayList<String> ls34 = new ArrayList<>();
        ls34.add("Кофе");
        ls34.add("Врач");
        VideoRecord vd34 = new VideoRecord("Video #34", ls34);
        vd34.setPath("C:\\Users\\space\\OneDrive\\Рабочий стол\\game_jv\\newgame\\src\\main\\resources\\com\\example\\newgame\\videos\\vid34.mp4");
        addVideoRecord(vd34);

        ArrayList<String> ls35 = new ArrayList<>();
        ls35.add("Больница");
        ls35.add("Отрава");
        ls35.add("Отравление");
        VideoRecord vd35 = new VideoRecord("Video #35", ls35);
        vd35.setPath("C:\\Users\\space\\OneDrive\\Рабочий стол\\game_jv\\newgame\\src\\main\\resources\\com\\example\\newgame\\videos\\vid35.mp4");
        addVideoRecord(vd35);

        ArrayList<String> ls36 = new ArrayList<>();
        ls36.add("Насекомые");
        VideoRecord vd36 = new VideoRecord("Video #36", ls36);
        vd36.setPath("C:\\Users\\space\\OneDrive\\Рабочий стол\\game_jv\\newgame\\src\\main\\resources\\com\\example\\newgame\\videos\\vid36.mp4");
        addVideoRecord(vd36);

        ArrayList<String> ls37 = new ArrayList<>();
        ls37.add("Насекомые");
        ls37.add("Отрава");
        ls37.add("Отравление");
        VideoRecord vd37 = new VideoRecord("Video #37", ls37);
        vd37.setPath("C:\\Users\\space\\OneDrive\\Рабочий стол\\game_jv\\newgame\\src\\main\\resources\\com\\example\\newgame\\videos\\vid37.mp4");
        addVideoRecord(vd37);

        ArrayList<String> ls38 = new ArrayList<>();
        ls38.add("Жена");
        ls38.add("Дом");
        ls38.add("Туман");
        VideoRecord vd38 = new VideoRecord("Video #38", ls38);
        vd38.setPath("C:\\Users\\space\\OneDrive\\Рабочий стол\\game_jv\\newgame\\src\\main\\resources\\com\\example\\newgame\\videos\\vid38.mp4");
        addVideoRecord(vd38);

        ArrayList<String> ls39 = new ArrayList<>();
        ls39.add("Подозреваемый");
        VideoRecord vd39 = new VideoRecord("Video #39", ls39);
        vd39.setPath("C:\\Users\\space\\OneDrive\\Рабочий стол\\game_jv\\newgame\\src\\main\\resources\\com\\example\\newgame\\videos\\vid39.mp4");
        addVideoRecord(vd39);

        ArrayList<String> ls40 = new ArrayList<>();
        ls40.add("Эрика");
        ls40.add("Глаза");
        VideoRecord vd40 = new VideoRecord("Video #40", ls40);
        vd40.setPath("C:\\Users\\space\\OneDrive\\Рабочий стол\\game_jv\\newgame\\src\\main\\resources\\com\\example\\newgame\\videos\\vid40.mp4");
        addVideoRecord(vd40);

        ArrayList<String> ls41 = new ArrayList<>();
        ls41.add("Эрика");
        ls41.add("Глаза");
        VideoRecord vd41 = new VideoRecord("Video #41", ls41);
        vd41.setPath("C:\\Users\\space\\OneDrive\\Рабочий стол\\game_jv\\newgame\\src\\main\\resources\\com\\example\\newgame\\videos\\vid41.mp4");
        addVideoRecord(vd41);

        ArrayList<String> ls42 = new ArrayList<>();
        ls42.add("Отец");
        ls42.add("Родители");
        ls42.add("Детство");
        VideoRecord vd42 = new VideoRecord("Video #42", ls42);
        vd42.setPath("C:\\Users\\space\\OneDrive\\Рабочий стол\\game_jv\\newgame\\src\\main\\resources\\com\\example\\newgame\\videos\\vid42.mp4");
        addVideoRecord(vd42);

        ArrayList<String> ls43 = new ArrayList<>();
        ls43.add("Развод");
        VideoRecord vd43 = new VideoRecord("Video #43", ls43);
        vd43.setPath("C:\\Users\\space\\OneDrive\\Рабочий стол\\game_jv\\newgame\\src\\main\\resources\\com\\example\\newgame\\videos\\vid43.mp4");
        addVideoRecord(vd43);

        ArrayList<String> ls44 = new ArrayList<>();
        ls44.add("Развод");
        ls44.add("Туман");
        VideoRecord vd44 = new VideoRecord("Video #44", ls44);
        vd44.setPath("C:\\Users\\space\\OneDrive\\Рабочий стол\\game_jv\\newgame\\src\\main\\resources\\com\\example\\newgame\\videos\\vid44.mp4");
        addVideoRecord(vd44);



        searchButton.setOnAction(e -> searchVideos());
        tableView.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            if (newSelection != null) {
                playVideo(newSelection);
            }
        });
    }

    private void searchVideos() {
        String searchTerm = searchField.getText().toLowerCase().trim();

        if (searchTerm.isEmpty()) {
            tableView.setItems(videoRecords);
        } else {
            searchResults.clear();


            for (VideoRecord record : videoRecords) {
                if (record.containsKeyword(searchTerm)) {
                    searchResults.add(record);
                }
            }
            tableView.setItems(searchResults);
        }
    }

    public void addVideoRecord(VideoRecord videoRecord) {
        videoRecords.add(videoRecord);
    }


    private void playVideo(VideoRecord videoRecord) {
        String videoPath = videoRecord.getPath();
        System.out.println("Video Path: " + videoPath);
        Media media = new Media(Paths.get(videoPath).toUri().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaView.setMediaPlayer(mediaPlayer);
        mediaPlayer.setOnEndOfMedia(() -> {
            mediaPlayer.stop();
        });


        mediaPlayer.play();
    }

//    private String getVideoPath(String keyword) {
//        String videoDirPath = "C:\\Users\\space\\OneDrive\\Рабочий стол\\game_jv\\newgame\\src\\main\\resources\\com\\example\\newgame\\videos";
//        File videoDir = new File(videoDirPath);
//        if (videoDir.exists() && videoDir.isDirectory()) {
//            File[] videoFiles = videoDir.listFiles();
//            if (videoFiles != null) {
//                for (File videoFile : videoFiles) {
//                    System.out.println("Video File: " + videoFile.getName()); // Print video file names for debugging
//                    if (videoFile.isFile()) {
//                        for (VideoRecord searchResult : searchResults) {
//                            if (searchResult.getKeywords().equals(keyword)) {
//                                return videoFile.getAbsolutePath();
//                            }
//                        }
//                    }
//                }
//            }
//        }
//        return null;
//    }
}

