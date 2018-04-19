package com.example.venkatasaisankar.androidlearner.androidtutorialvideo;

import android.os.Bundle;

import com.example.venkatasaisankar.androidlearner.R;
import com.example.venkatasaisankar.androidlearner.youtubeapikey.AndroidTutorialKey;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class AndroidFeatures extends YouTubeBaseActivity {

    YouTubePlayerView youTubePlayerView;
    YouTubePlayer.OnInitializedListener onInitializedListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.android_tutorial_youtube);
        youTubePlayerView=(YouTubePlayerView)findViewById(R.id.androidtutorialyoutubeview);
        onInitializedListener=new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {

                /*Android Features  Youtube Video String Key*/

                youTubePlayer.loadVideo("X35-GDT4_4Q");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };
        youTubePlayerView.initialize(AndroidTutorialKey.API_KEY,onInitializedListener);


    }
}
