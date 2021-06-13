package vn.japit.betapdoc.SoundControl;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;

import static android.content.Context.AUDIO_SERVICE;

public class SoundMaster {

    private boolean playing = false;
    private boolean loaded = false;
    private boolean playingCalled = false;
    private float actualVolume;
    private float maxVolume;
    private float volume;
    private AudioManager audioManager;
    private SoundPool soundPool;
    private int soundId;
    private int ringingStreamId;
    private int rawid;

    public SoundMaster(Context context, int sposition) {
        // AudioManager audio settings for adjusting the volume
        // AudioManager audio settings for adjusting the volume
        audioManager = (AudioManager) context.getSystemService(AUDIO_SERVICE);
        actualVolume = (float) audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);
        maxVolume = (float) audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        volume = actualVolume / maxVolume;
        this.rawid =sposition;
        // Load the sounds
        int maxStreams = 1;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            soundPool = new SoundPool.Builder()
                    .setMaxStreams(maxStreams)
                    .build();
        } else {
            soundPool = new SoundPool(maxStreams, AudioManager.STREAM_MUSIC, 0);
        }

        soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {
            @Override
            public void onLoadComplete(SoundPool soundPool, int sampleId, int status) {
                loaded = true;
                if (playingCalled) {
                    playRinging();
                    playingCalled = false;
                }
            }

        });
        soundId = soundPool.load(context, rawid, 1);

    }
    public void playRinging() {
        if (loaded && !playing) {
            ringingStreamId = soundPool.play(soundId, volume, volume, 1, -1, 1f);
            playing = true;
        } else {
            playingCalled = true;
        }
    }

}
