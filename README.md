# TwoWayDataBindingTest
Two Databinding for android. '@={variable}' is used for Two way DataBinding in android. If variable is a integer or float it can not bind directly to attribute which accept string as default syntax, it can bind in two ways. Easiest way is '@={""+variable}' and other is using BindingAdapter. 
Problem of first way is if there is one digit or enter wrong character other than digit cursor goes to left. 
Use of BindigAdapter can be used as

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
