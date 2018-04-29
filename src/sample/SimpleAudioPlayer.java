package sample;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


public class SimpleAudioPlayer {
    // a good deal of help for this part came from:
    // https://www.geeksforgeeks.org/play-audio-file-using-java/

    Long currentFrame;
    Clip clip;

    String status;

    AudioInputStream audioInputStream;
    public String filePath;

    public SimpleAudioPlayer(String fp)
            throws UnsupportedAudioFileException,
            IOException, LineUnavailableException {

        this.filePath = fp;

        audioInputStream = AudioSystem.getAudioInputStream(
                new File(this.filePath).getAbsoluteFile()
        );

        clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }

}
