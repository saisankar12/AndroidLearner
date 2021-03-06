package com.example.venkatasaisankar.androidlearner.androidtutorialvideo;

import android.os.Bundle;

import com.example.venkatasaisankar.androidlearner.R;
import com.example.venkatasaisankar.androidlearner.youtubeapikey.AndroidTutorialKey;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

/**
 * Created by Sai Sankar on 02-08-2017.
 */

public class WebviewHTML extends YouTubeBaseActivity {

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

                /*Android Activity life Cycle  Youtube Video String Key*/

                youTubePlayer.loadVideo("6C7st1H6_eI");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };
        youTubePlayerView.initialize(AndroidTutorialKey.API_KEY,onInitializedListener);


    }
}
