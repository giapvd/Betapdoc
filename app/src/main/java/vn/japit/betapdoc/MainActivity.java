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
    private ImageButton btn_hocchughep;
    private ImageButton btn_hocamvan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_hocchucai = (ImageButton) findViewById(R.id.btn_hocchucai);
        btn_hocchughep = (ImageButton) findViewById(R.id.btn_hocchughep);
        btn_hocamvan = (ImageButton) findViewById(R.id.btn_hocamvan);

        btn_hocchucai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,HocchucaiActivity.class);
                startActivity(intent);
            }
        });
    }
}