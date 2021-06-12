package vn.japit.betapdoc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton btn_hocchucai;
    private ImageButton btn_hocso;
    private ImageButton btn_hocamvan;
    private ImageButton btn_ghepvan;
    private ImageButton btn_luyentapchucai;
    private ImageButton btn_luyentapchuso;
    private ImageButton btn_luyentapghepvan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_hocchucai = (ImageButton) findViewById(R.id.btn_hocchucai);
        btn_hocso = (ImageButton) findViewById(R.id.btn_hocso);
        btn_hocamvan = (ImageButton) findViewById(R.id.btn_hocamvan);
        btn_ghepvan = (ImageButton) findViewById(R.id.btn_ghepvan);
        btn_luyentapchucai = (ImageButton) findViewById(R.id.btn_luyentapchucai);
        btn_luyentapchuso = (ImageButton) findViewById(R.id.btn_luyentapchuso);
        btn_luyentapghepvan = (ImageButton) findViewById(R.id.btn_luyentapghepvan);

        btn_hocchucai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,HocchucaiActivity.class);
                startActivity(intent);
            }
        });
    }
}