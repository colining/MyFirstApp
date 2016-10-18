package com.example.asus.myfirstapp.Activity;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.asus.myfirstapp.Fragment.MainFragment;
import com.example.asus.myfirstapp.R;
import com.example.asus.myfirstapp.SingleFragmentActivity;

public class MainActivity extends SingleFragmentActivity {

@Override
    protected Fragment createFragment()
{
    return new MainFragment();
}
}
