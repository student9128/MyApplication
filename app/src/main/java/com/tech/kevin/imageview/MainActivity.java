package com.tech.kevin.imageview;

import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn:
                count++;
                if (count % 2 == 0) {
                    Drawable dr = getResources().getDrawable(R.drawable.ic_android_red_500_24dp);
                    dr.setBounds(0, 0, dr.getMinimumWidth(), dr.getMinimumHeight());
                    btn.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.grey_800));
                    btn.setCompoundDrawables(null, dr, null, null);
                } else {

                    Drawable dr = getResources().getDrawable(R.drawable.ic_accessibility_red_500_24dp);
                    btn.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.teal));
                    dr.setBounds(0, 0, dr.getMinimumWidth(), dr.getMinimumHeight());
                    btn.setCompoundDrawables(null, dr, null, null);
                }
                break;
        }
    }
}
