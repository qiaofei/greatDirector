package com.yashili.greatdirector.greatdirector;

import android.app.Activity;
import android.media.session.MediaController;
import android.os.Bundle;
import android.util.Log;
import android.widget.VideoView;

import java.io.File;

/**
 * Created by LaoZhuang on 2015/7/28.
 */
public class PlayMovieActivity extends Activity{
    private VideoView videoview;
    MediaController mediaController;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_movie_layout);
        videoview=(VideoView)findViewById(R.id.videoview1);
        //mediaController=new MediaController(MainActivity);
        File file=new File("/storage/emulated/0/Download/sample.mp4");
        Log.v("media","播放本地视频前");
        if(file.exists()){
            Log.v("media","播放本地视频");
            //VideoView与MediaController进行关联
            videoview.setVideoPath(file.getAbsolutePath());
            //videoview.setMediaController(mediaController);
            //mediaController.setMediaPlayer(videoview);
            //让VideiView获取焦点
            videoview.requestFocus();
        }
        else{
           // Toast.makeText(this,"没找到路径",Toast.LENGTH_SHORT).show();
        }
    }
}
