package website.copyandpaste.bottombarnavigationwithnavigationdrawer;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

/**
 * Created by root on 11/9/17.
 */

public class About extends AppCompatActivity{
    String SrcPath = "rtsp://r4---sn-a5meknl7.googlevideo.com/Cj0LENy73wIaNAkHQScq1w4DPxMYDSANFC0YywVaMOCoAUIASARgyK2wotH_sfhZigELajY5NkxFWUdxRkEM/5EDE5465132C43FB28F92FD318B303CACA9D283D.6F8D043BEF69A9CD5649AEC8F03F5EE5A483F225/yt6/1/video.3gp";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
       /* VideoView myVideoView = (VideoView)findViewById(R.id.videoView);
        myVideoView.setVideoURI(Uri.parse(SrcPath));
        myVideoView.setMediaController(new MediaController(this));
        myVideoView.requestFocus();
        myVideoView.start();*/
    }

    }

