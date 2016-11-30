package com.bwie.test;
/**
 * Created by Administrator on 2016/11/29.
 */

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * 1.
 * 2.作者：佀晋元 2016/11/23
 */
public class OneFragment extends Fragment {

//    @Nullable
//    @Override
//    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//           View view=inflater.inflate(R.layout.onefragment,null);
//        Bundle bundle=getArguments();
//      TextView  tv=(TextView)view.findViewById(R.id.tvss);
//
//        String s=bundle.getString("Key");
//        tv.setText(s.toString());
//
////        Log.e("kkkkkk",s);
//        return view;
//    }

//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//        Log.e("fragment_111111111","onAttach");
//       // s=((MainActivity)context).rr();
//    }
private static final String TAG = OneFragment.class.getSimpleName();

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.i(TAG, "onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.i(TAG, "onCreateView");
        View view=inflater.inflate(R.layout.onefragment,null);
        Bundle bundle=getArguments();
        TextView  tv=(TextView)view.findViewById(R.id.tvss);

        String s=bundle.getString("Key");
        tv.setText(s.toString());

//        Log.e("kkkkkk",s);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Log.i(TAG, "onViewCreated");
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onDestroy() {
        Log.i(TAG, "onDestroy");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.i(TAG, "onDetach");
        super.onDetach();
    }

    @Override
    public void onDestroyView() {
        Log.i(TAG, "onDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onStart() {
        Log.i(TAG, "onStart");
        super.onStart();
    }
    @Override
    public void onStop() {
        Log.i(TAG, "onStop");
        super.onStop();
    }

    @Override
    public void onResume() {
        Log.i(TAG, "onResume");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.i(TAG, "onPause");
        super.onPause();
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        Log.i(TAG, "onActivityCreated");
        super.onActivityCreated(savedInstanceState);
    }
}
