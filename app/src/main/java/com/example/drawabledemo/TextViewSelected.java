package com.example.drawabledemo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

@SuppressLint("AppCompatCustomView")
public class TextViewSelected extends TextView implements View.OnClickListener {
    private Context mContext;
    public TextViewSelected(Context context) {
        this(context,null);
    }

    public TextViewSelected(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public TextViewSelected(final Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext=context;
        setClickable(true);
        setSelected(true);
        setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (isSelected()){
            setSelected(false);
        }else {
            setSelected(true);
        }
    }
}
