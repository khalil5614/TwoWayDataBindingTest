package com.example.khalil.twowaydatabindingtest.helpers;

import android.databinding.BindingAdapter;
import android.databinding.InverseBindingAdapter;
import android.widget.TextView;

/**
 * Created by Khalil on 1/6/2018.
 */

public class BindingAdapters {
    @BindingAdapter("android:text")
    public static void setText(TextView view, int value) {
        if (view.getText() != null
                && (!view.getText().toString().isEmpty())
                && Integer.parseInt(view.getText().toString()) != value) {
            view.setText(Integer.toString(value));
        }
    }

    @InverseBindingAdapter(attribute = "android:text")
    public static int getText(TextView view) {
        try {
            return Integer.parseInt(view.getText().toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
