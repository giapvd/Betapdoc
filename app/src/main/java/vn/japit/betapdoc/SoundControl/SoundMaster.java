package vn.japit.betapdoc.SoundControl;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;
import java.util.HashMap;

public class SoundMaster {

    private SoundPool mSoundPool;
    private HashMap<Integer,Integer> mSoundPoolMap;
    private AudioManager mAudioManager;
    private Context mContext;

    public SoundMaster() {

    }
    public void initSounds(Context context)
    {
        mContext = context;
        mSoundPool = new SoundPool(4, AudioManager.STREAM_MUSIC,0);
        mSoundPoolMap = new HashMap<Integer,Integer>();
        mAudioManager = (AudioManager) mContext.getSystemService(Context.AUDIO_SERVICE);
    }
    public void addSound(int index, int soundId){
        mSoundPoolMap.put(index,mSoundPool.load(mContext,soundId,1));
    }
    public void playSound(int index){
        int streamVoume = mAudioManager.getStreamVolume(AudioManager.STREAM_MUSIC);
        mSoundPool.play(mSoundPoolMap.get(index),streamVoume,streamVoume,1,0,1f);
    }
}
