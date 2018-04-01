package com.example.tito.womensecurity.custom_font;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created by Tito on 01/04/2018.
 */

public class MyEditText extends EditText {

    public MyEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public MyEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyEditText(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
       //     Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "font/lato_regular.ttf");
         //   setTypeface(tf);
        }
    }

}
