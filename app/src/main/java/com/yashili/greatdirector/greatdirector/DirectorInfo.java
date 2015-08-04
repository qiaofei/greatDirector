package com.yashili.greatdirector.greatdirector;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by LaoZhuang on 2015/7/28.
 */
public class DirectorInfo extends Activity {
    private ImageView imageview1;
    private ImageView imageview2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.director_info_layout);
        imageview1 = (ImageView) findViewById(R.id.imageview_for_director1);
        imageview2 = (ImageView) findViewById(R.id.imageview_for_director2);
        imageview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DirectorInfo.this, PlayMovieActivity.class);
                startActivity(intent);
            }
        });
        imageview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DirectorInfo.this, PlayMovieActivity.class);
                startActivity(intent);
            }
        });
    }
}
