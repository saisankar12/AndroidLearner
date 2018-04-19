package com.example.venkatasaisankar.androidlearner.androidtutorialvideo;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.venkatasaisankar.androidlearner.R;
import com.example.venkatasaisankar.androidlearner.youtubeapikey.AndroidTutorialKey;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

/**
 * Created by Sai Sankar on 14-07-2017.
 */

public class AndroidComponents extends YouTubeBaseActivity {

    YouTubePlayerView youTubePlayerView;
    YouTubePlayer.OnInitializedListener onInitializedListener;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.android_tutorial_youtube);
        youTubePlayerView=(YouTubePlayerView)findViewById(R.id.androidtutorialyoutubeview);
        onInitializedListener=new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {

                /*Android Component  Youtube Video String Key*/

                youTubePlayer.loadVideo("aduC_n_WVfQ");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };
        youTubePlayerView.initialize(AndroidTutorialKey.API_KEY,onInitializedListener);


    }
}
