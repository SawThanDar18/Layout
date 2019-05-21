package myapp.com.layout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;

/**
 * Created by User on 5/21/2019.
 */

public class Frame_Layout extends AppCompatActivity{

    FrameLayout frame1, frame2, frame3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frame1 = findViewById(R.id.frame1);
        frame2 = findViewById(R.id.frame2);
        frame3 = findViewById(R.id.frame3);

        frame1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frame1.setVisibility(v.GONE);
                frame2.setVisibility(v.VISIBLE);
            }
        });

        frame2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frame2.setVisibility(v.GONE);
                frame3.setVisibility(v.VISIBLE);
            }
        });

        frame3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frame3.setVisibility(v.GONE);
                frame1.setVisibility(v.VISIBLE);
            }
        });
    }
}
