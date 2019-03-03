package com.example.launcher;

import android.support.v4.app.Fragment;
import android.os.Bundle;

public class LauncherActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return LauncherFragment.newInstance();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
    }
}
