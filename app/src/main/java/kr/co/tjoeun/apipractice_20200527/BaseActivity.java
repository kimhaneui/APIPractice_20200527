package kr.co.tjoeun.apipractice_20200527;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {

    public Context mContext = this;

    public abstract void setupEvents();
    public abstract void setValues();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setTitle(Html.fromHtml("<font color='#000000'>Toron App</font>"));
    }
}
