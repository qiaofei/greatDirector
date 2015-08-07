package com.yanshili.greatdirector.activities;

import android.app.Activity;
import android.widget.MediaController;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

import com.yashili.greatdirector.greatdirector.R;

/**
 * Created by LaoZhuang on 2015/7/28.
 */
public class PlayMovieActivity extends Activity{
    private VideoView videoview;
    MediaController mediaController;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_movie_layout);
        videoview = (VideoView) findViewById(R.id.videoview1);
        String uri = "android.resource://" + getPackageName() + "/" + R.raw.sample;
        videoview.setVideoURI(Uri.parse(uri));
        mediaController = new MediaController(this);
        videoview.setMediaController(mediaController);
        mediaController.setMediaPlayer(videoview);
        mediaController.setPadding(0,0,0,480);
        videoview.requestFocus();
    }
}
