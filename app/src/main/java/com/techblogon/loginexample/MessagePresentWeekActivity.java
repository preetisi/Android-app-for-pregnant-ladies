package com.techblogon.loginexample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
/**
 * Created by psingh on 7/17/15.
 */
public class MessagePresentWeekActivity extends Activity {
    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.setContentView(R.layout.messagescreen);
    }
}
