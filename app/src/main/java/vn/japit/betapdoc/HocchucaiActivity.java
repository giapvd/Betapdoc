package vn.japit.betapdoc;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
    private ImageButton btn_char_a;
    private ImageButton btn_char_aw;
    private ImageButton btn_char_aa;
    private ImageButton btn_char_b;
    private ImageButton btn_char_c;
    private ImageButton btn_char_d;
    private ImageButton btn_char_dd;
    private ImageButton btn_char_e;
    private ImageButton btn_char_ee;
    private ImageButton btn_char_g;
    private ImageButton btn_char_h;
    private ImageButton btn_char_i;
    private ImageButton btn_char_k;
    private ImageButton btn_char_l;
    private ImageButton btn_char_m;
    private ImageButton btn_char_n;
    private ImageButton btn_char_o;
    private ImageButton btn_char_oo;
    private ImageButton btn_char_ow;
    private ImageButton btn_char_p;
    private ImageButton btn_char_q;
    private ImageButton btn_char_r;
    private ImageButton btn_char_s;
    private ImageButton btn_char_t;
    private ImageButton btn_char_u;
    private ImageButton btn_char_uw;
    private ImageButton btn_char_v;
    private ImageButton btn_char_x;
    private ImageButton btn_char_y;
    private ImageButton btn_dau_sac;
    private ImageButton btn_dau_huyen;
    private ImageButton btn_dau_hoi;
    private ImageButton btn_dau_nga;
    private ImageButton btn_dau_nang;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hocchucai);
        scrollView = (ScrollView) findViewById(R.id.main_scrollView);
        soundMaster = new SoundMaster();
        soundMaster.initSounds(getBaseContext());
        addSoundChuCai();

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

        ImageButton btn_char_a = (ImageButton) findViewById(R.id.btn_char_a);
        btn_char_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundMaster.playSound(1);
            }
        });

        ImageButton btn_char_aw = (ImageButton) findViewById(R.id.btn_char_aw);
        btn_char_aw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundMaster.playSound(2);
            }
        });

        ImageButton btn_char_aa = (ImageButton) findViewById(R.id.btn_char_aa);
        btn_char_aa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundMaster.playSound(3);
            }
        });

        ImageButton btn_char_b = (ImageButton) findViewById(R.id.btn_char_b);
        btn_char_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundMaster.playSound(4);
            }
        });

        ImageButton btn_char_c = (ImageButton) findViewById(R.id.btn_char_c);
        btn_char_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundMaster.playSound(5);
            }
        });

        ImageButton btn_char_d = (ImageButton) findViewById(R.id.btn_char_d);
        btn_char_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundMaster.playSound(6);
            }
        });
        ImageButton btn_char_dd = (ImageButton) findViewById(R.id.btn_char_dd);
        btn_char_dd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundMaster.playSound(7);
            }
        });

        ImageButton btn_char_e = (ImageButton) findViewById(R.id.btn_char_e);
        btn_char_e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundMaster.playSound(8);
            }
        });

        ImageButton btn_char_ee = (ImageButton) findViewById(R.id.btn_char_ee);
        btn_char_ee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundMaster.playSound(9);
            }
        });

        ImageButton btn_char_g = (ImageButton) findViewById(R.id.btn_char_g);
        btn_char_g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundMaster.playSound(10);
            }
        });

        ImageButton btn_char_h = (ImageButton) findViewById(R.id.btn_char_h);
        btn_char_h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundMaster.playSound(11);
            }
        });

        ImageButton btn_char_i = (ImageButton) findViewById(R.id.btn_char_i);
        btn_char_i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundMaster.playSound(12);
            }
        });

        ImageButton btn_char_k = (ImageButton) findViewById(R.id.btn_char_k);
        btn_char_k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundMaster.playSound(13);
            }
        });

        ImageButton btn_char_l = (ImageButton) findViewById(R.id.btn_char_l);
        btn_char_l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundMaster.playSound(14);
            }
        });

        ImageButton btn_char_m = (ImageButton) findViewById(R.id.btn_char_m);
        btn_char_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundMaster.playSound(15);
            }
        });

        ImageButton btn_char_n = (ImageButton) findViewById(R.id.btn_char_n);
        btn_char_n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundMaster.playSound(16);
            }
        });

        ImageButton btn_char_o = (ImageButton) findViewById(R.id.btn_char_o);
        btn_char_o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundMaster.playSound(17);
            }
        });

        ImageButton btn_char_oo = (ImageButton) findViewById(R.id.btn_char_oo);
        btn_char_oo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundMaster.playSound(18);
            }
        });

        ImageButton btn_char_ow = (ImageButton) findViewById(R.id.btn_char_ow);
        btn_char_ow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundMaster.playSound(19);
            }
        });

        ImageButton btn_char_p = (ImageButton) findViewById(R.id.btn_char_p);
        btn_char_p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundMaster.playSound(20);
            }
        });

        ImageButton btn_char_q= (ImageButton) findViewById(R.id.btn_char_q);
        btn_char_q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundMaster.playSound(21);
            }
        });

        ImageButton btn_char_r = (ImageButton) findViewById(R.id.btn_char_r);
        btn_char_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundMaster.playSound(22);
            }
        });

        ImageButton btn_char_s = (ImageButton) findViewById(R.id.btn_char_s);
        btn_char_s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundMaster.playSound(23);
            }
        });

        ImageButton btn_char_t = (ImageButton) findViewById(R.id.btn_char_t);
        btn_char_t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundMaster.playSound(24);
            }
        });

        ImageButton btn_char_u = (ImageButton) findViewById(R.id.btn_char_u);
        btn_char_u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundMaster.playSound(25);
            }
        });

        ImageButton btn_char_uw = (ImageButton) findViewById(R.id.btn_char_uw);
        btn_char_uw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundMaster.playSound(26);
            }
        });

        ImageButton btn_char_v = (ImageButton) findViewById(R.id.btn_char_v);
        btn_char_v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundMaster.playSound(27);
            }
        });

        ImageButton btn_char_x = (ImageButton) findViewById(R.id.btn_char_x);
        btn_char_x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundMaster.playSound(28);
            }
        });

        ImageButton btn_char_y = (ImageButton) findViewById(R.id.btn_char_y);
        btn_char_y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundMaster.playSound(29);
            }
        });

        btn_dau_sac = (ImageButton) findViewById(R.id.btn_dau_sac);
        btn_dau_sac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundMaster.playSound(30);
            }
        });

        btn_dau_huyen = (ImageButton) findViewById(R.id.btn_dau_huyen);
        btn_dau_huyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundMaster.playSound(31);
            }
        });

        btn_dau_hoi = (ImageButton) findViewById(R.id.btn_dau_hoi);
        btn_dau_hoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundMaster.playSound(32);
            }
        });

        btn_dau_nga = (ImageButton) findViewById(R.id.btn_dau_nga);
        btn_dau_nga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundMaster.playSound(33);
            }
        });

        btn_dau_nang = (ImageButton) findViewById(R.id.btn_dau_nang);
        btn_dau_nang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundMaster.playSound(34);
            }
        });
    }
    private void doScrollUp() {
         this.scrollView.scrollTo(0,0);
    }
    private void addSoundChuCai()
    {
        //Add char a
        soundMaster.addSound(1,R.raw.char_a);
        //Add char ă
        soundMaster.addSound(2,R.raw.char_aw);
        //Add char â
        soundMaster.addSound(3,R.raw.char_aa);
        //Add char b
        soundMaster.addSound(4,R.raw.char_b);
        //Add char c
        soundMaster.addSound(5,R.raw.char_c);
        //Add char d
        soundMaster.addSound(6,R.raw.char_d);
        //Add char đ
        soundMaster.addSound(7,R.raw.char_dd);
        //Add char e
        soundMaster.addSound(8,R.raw.char_e);
        //Add char ê
        soundMaster.addSound(9,R.raw.char_ee);
        //Add char g
        soundMaster.addSound(10,R.raw.char_g);
        //Add char h
        soundMaster.addSound(11,R.raw.char_h);
        //Add char i
        soundMaster.addSound(12,R.raw.char_i);
        //Add char k
        soundMaster.addSound(13,R.raw.char_k);
        //Add char l
        soundMaster.addSound(14,R.raw.char_l);
        //Add char m
        soundMaster.addSound(15,R.raw.char_m);
        //Add char n
        soundMaster.addSound(16,R.raw.char_n);
        //Add char o
        soundMaster.addSound(17,R.raw.char_o);
        //Add char ô
        soundMaster.addSound(18,R.raw.char_oo);
        //Add char ơ
        soundMaster.addSound(19,R.raw.char_ow);
        //Add char p
        soundMaster.addSound(20,R.raw.char_p);
        //Add char q
        soundMaster.addSound(21,R.raw.char_q);
        //Add char r
        soundMaster.addSound(22,R.raw.char_r);
        //Add char s
        soundMaster.addSound(23,R.raw.char_s);
        //Add char t
        soundMaster.addSound(24,R.raw.char_t);
        //Add char u
        soundMaster.addSound(25,R.raw.char_u);
        //Add char ư
        soundMaster.addSound(26,R.raw.char_uw);
        //Add char v
        soundMaster.addSound(27,R.raw.char_v);
        //Add char x
        soundMaster.addSound(28,R.raw.char_x);
        //Add char y
        soundMaster.addSound(29,R.raw.char_y);
        //Add char sắc
        soundMaster.addSound(30,R.raw.char_dau_sac);
        //Add char huyền
        soundMaster.addSound(31,R.raw.char_dau_huyen);
        //Add char hỏi
        soundMaster.addSound(32,R.raw.char_dau_hoi);
        //Add char ngã
        soundMaster.addSound(33,R.raw.char_dau_nga);
        //Add char nặng
        soundMaster.addSound(34,R.raw.char_dau_nang);
    }
}
