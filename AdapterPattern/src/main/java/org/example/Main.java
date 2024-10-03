package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MediaPlayer mediaPlayer = new AudioPlayerAdapter();
        mediaPlayer.play("audio", "song.mp3"); // Valid case
        mediaPlayer.play("video", "movie.mp4"); // Invalid case

    }
}