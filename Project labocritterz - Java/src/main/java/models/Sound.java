package models;

public class Sound {
    int waitTime;
    float volume;
    mp3 soundArchive;

    public Sound(mp3 soundArchive){
        this.soundArchive = soundArchive;
    }

    public int getWaitTime(){
        return waitTime;
    }
    public float getVolume(){
        return volume;
    }
    public mp3 getSoundArchive(){
        return soundArchive;
    }

    public void setWaitTime(int waitTime){
        this.waitTime = waitTime;
    }
    public void setVolume(float volume){
        this.volume = volume;
    }
}
