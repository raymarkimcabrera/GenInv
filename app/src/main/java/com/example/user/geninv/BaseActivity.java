package com.example.user.geninv;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public abstract class BaseActivity extends AppCompatActivity {

    protected Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setResourceLayoutID());
        mContext = this;
    }

    protected abstract int setResourceLayoutID();
}
