package com.bwie.test;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
/**
 * autour: 佀晋元
 * date: 2016/11/29 21:31
 * update: 2016/11/29
 * Activity对fragment之间的管理
 */

public class MainActivity extends AppCompatActivity {
    String TAG="TAG";
    FragmentTransaction transaction = null;
    mainFragment fm_main = null;
    FragmentManager fm = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFM();

    }
    private void initFM() {
        fm = getFragmentManager();
        transaction = fm.beginTransaction();
        if (fm_main == null) {
            fm_main = new mainFragment();
            transaction.add(R.id.fragment_container, fm_main);
            Log.i("TAG", "主Fragment");
        } else {
            transaction.show(fm_main);
        }
        transaction.commit();
    }

}
