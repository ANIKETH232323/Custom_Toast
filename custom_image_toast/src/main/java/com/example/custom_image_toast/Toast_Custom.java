package com.example.custom_image_toast;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;

public class Toast_Custom extends Toast {

    /**
     * Construct an empty Toast object.  You must call {@link #setView} before you
     * can call {@link #show}.
     *
     * @param context The context to use.  Usually your {@link Application}
     *                or {@link Activity} object.
     */
    public Toast_Custom(Context context) {
        super(context);
    }

    public static Toast ImgToast(Context context, String msg,  int  drawable, int duration,int background){
        Toast toast = new Toast(context);
        toast.setDuration(duration);

        View layout = LayoutInflater.from(context).inflate(R.layout.custom_toast,null,false);
        ConstraintLayout constraintLayout =layout.findViewById(R.id.toast_layout);

        TextView textView =layout.findViewById(R.id.textView);
        ImageView imageView = layout.findViewById(R.id.imageView);


        textView.setText(msg);
        imageView.setImageResource(drawable);
        /**
         * You can create background in your drawable to give the outer shape of the toast body
         * and call it in main file
         * where you want to use.
         */
        constraintLayout.setBackgroundResource(background);
        toast.setView(layout);

        return toast;

    }
}
