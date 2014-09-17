package com.lemon.android;

import android.app.Activity;
import android.widget.TextView;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by lemon on 14-9-17.
 */
@RunWith(RobolectricTestRunner.class)
public class HelloAndroidActivityTest {

    @Test
    public void AppNameShouldCorrect() {
        Activity activity = Robolectric.setupActivity(HelloAndroidActivity.class);
        TextView results = (TextView) activity.findViewById(R.id.textView);
        assertThat(results.getText().toString(), equalTo("HelloDemo"));
    }
}
