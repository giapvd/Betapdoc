package vn.japit.betapdoc;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ScrollView;
import androidx.annotation.Nullable;

import androidx.appcompat.app.AppCompatActivity;

import vn.japit.betapdoc.SoundControl.SoundMaster;

public class HocchucaiActivity extends AppCompatActivity {
    private ImageButton btn_back;
    private ImageButton btn_back_to_top;
    private SoundMaster soundMaster;
    private ScrollView scrollView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hocchucai);
        scrollView = (ScrollView) findViewById(R.id.main_scrollView);
        soundMaster = new SoundMaster();
        // soundMaster.initSounds(getBaseContext());
        // soundMaster.addSound(1,R.raw.sound_help);
        //soundMaster.playSound(1);
        MediaPlayer player = MediaPlayer.create(this, R.raw.sound_help);
        player.start();
        btn_back = (ImageButton) findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HocchucaiActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        btn_back_to_top = (ImageButton) findViewById(R.id.btn_back_to_top);
        btn_back_to_top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doScrollUp();
            }
        });
    }
    private void doScrollUp() {
         this.scrollView.scrollTo(0,0);
    }
}
