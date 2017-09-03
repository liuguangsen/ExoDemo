package com.exoplayerdemo.stick.exodemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.exoplayerdemo.stick.exodemo.entity.Temple;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Temple temple = new Temple();
        changeStr1(temple);
        Log.d("liugs", temple.getName() + "  " + temple.getNums()[0]);

        /*int a = 1;
        String s = "test";
        char[] nums = {'a', 'b'};
        char b = 'b';
        changeStr(a, s, nums, b);
        Log.d("liugs", a + "  " + s + "  " + nums[0]+"   "+b);*/
    }

    private void changeStr1(Temple temple) {
        temple.setName("aaa");
        temple.setNums(new char[]{'1', '2'});
    }

    public void changeStr(int a, String s, char[] nums, char b) {
        a = 2;
        s = "aaa";
        //nums[0] = '1';
        b = 'c';
    }
}
