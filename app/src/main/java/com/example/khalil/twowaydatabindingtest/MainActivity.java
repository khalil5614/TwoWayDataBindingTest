package com.example.khalil.twowaydatabindingtest;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;

import com.example.khalil.twowaydatabindingtest.databinding.ActivityMainBinding;
import com.example.khalil.twowaydatabindingtest.databinding.UserlistlayoutBinding;
import com.example.khalil.twowaydatabindingtest.models.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User user = new User();
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setNewUser(user);
        //   UserlistlayoutBinding userlistlayoutBinding = DataBindingUtil.setContentView(this, R.layout.userlistlayout);
        //  userlistlayoutBinding.setUserData(user);
        //LayoutInflater inflater = LayoutInflater.from(this);
        //  View l = (View) findViewById(R.id.userListLayout);
       // UserlistlayoutBinding userlistlayoutBinding = UserlistlayoutBinding.inflate(getLayoutInflater());
      //  userlistlayoutBinding.setUserData(user);
    }
}
