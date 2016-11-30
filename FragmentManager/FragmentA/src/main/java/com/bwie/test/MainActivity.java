package com.bwie.test;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
/**
 * autour: 佀晋元
 * date: 2016/11/29 21:32
 * update: 2016/11/29
 * 动态加载   Activity对Fragment之间通过bundle进行一个传值
 */

public class MainActivity extends AppCompatActivity {
    private Button btn1;
    private Button btn2;
    private EditText shuru;
    private EditText ru;

//    private OneFragment oneFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        changeFragment(new OneFragment());
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("activity1111","onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("activity1111","onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("activity1111","onResume");

    }

    public String rr(){
        return "lll";
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("activity1111","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("activity1111","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("activity1111","onDestroy");
    }

    private void changeFragment(Fragment fr) {
        //得到一个管理器
        FragmentManager manager = getSupportFragmentManager();
        //开启事物
        FragmentTransaction fragmentTransaction = manager.beginTransaction();
        //替换
        fragmentTransaction.replace(R.id.frame,fr);
        String zhi=shuru.getText().toString().trim();
        //创建一个bundle对象
        Bundle bundle=new Bundle();
        bundle.putString("Key",zhi);
        fr.setArguments(bundle);
        fragmentTransaction.commit();
        String zi=ru.getText().toString().trim();
        bundle.putString("Zi",zi);
        fr.setArguments(bundle);
    }

    private void initView() {
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        shuru=(EditText)findViewById(R.id.shuruq);
        ru=(EditText)findViewById(R.id.shuru);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeFragment(new OneFragment());
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeFragment(new TwoFragment());

            }
        });

    }

    //注意返回类型
//   // public String rr(){
//        return "lll";
//    }
}
