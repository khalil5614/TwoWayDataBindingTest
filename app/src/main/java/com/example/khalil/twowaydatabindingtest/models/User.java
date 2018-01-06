package com.example.khalil.twowaydatabindingtest.models;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.khalil.twowaydatabindingtest.BR;

import java.io.Serializable;

/**
 * Created by Khalil on 1/3/2018.
 */

public class User extends BaseObservable implements Serializable {
    private String firstName;
    private String lastName;
    private int age;

    @Bindable
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }

    @Bindable

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);
    }

    @Bindable
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //if (this.age != age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
        //   }
    }
}
