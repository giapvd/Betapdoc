package vn.japit.betapdoc;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import vn.japit.betapdoc.SoundControl.SoundMaster;

public class HocchucaiActivity extends AppCompatActivity {
    private ImageButton ibtn_back;
    //private SoundMaster soundMaster;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hocchucai);

       // soundMaster = new SoundMaster();
       // soundMaster.initSounds(getBaseContext());
       // soundMaster.addSound(1,R.raw.sound_help);
        //soundMaster.playSound(1);
        MediaPlayer player = MediaPlayer.create(this, R.raw.sound_help);
        player.start();
        ibtn_back = (ImageButton) findViewById(R.id.ibtn_back);
        ibtn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HocchucaiActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
