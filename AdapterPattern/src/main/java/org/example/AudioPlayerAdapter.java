package org.example;

public class AudioPlayerAdapter implements MediaPlayer {
    private AudioPlayer audioPlayer;

    public AudioPlayerAdapter() {
        audioPlayer = new AudioPlayer();
    }

    @Override
    public void play(String audioType, String fileName) {
        if ("audio".equalsIgnoreCase(audioType)) {
            audioPlayer.playAudio(fileName);
        } else {
            System.out.println("Invalid audio type: " + audioType);
        }
    }
}

