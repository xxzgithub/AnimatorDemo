package com.example.animatordemo;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView icon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        icon = (ImageView) findViewById(R.id.cion);
    }

    public void onClick(View v) {

        //属性动画  ValueAnimator 的用法  ,属性动画本质是值动画
//        ValueAnimator valueAnimator = ValueAnimator.ofFloat(0f, 1f);
//        valueAnimator.setDuration(2000);
//        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
//            @Override
//            public void onAnimationUpdate(ValueAnimator animation) {
//                float animatedValue = (float) animation.getAnimatedValue();
//                Log.e("TAG", "=========== animatedValue == " + animatedValue);
//                ViewGroup.LayoutParams layoutParams = icon.getLayoutParams();
//                layoutParams.width = (int) (animatedValue*1000);
//                layoutParams.height = (int) (animatedValue*1000);
//                icon.setLayoutParams(layoutParams);
//            }
//        });
//        valueAnimator.start();


        //ObjectAnimator的用法

        //透明度变化
//        ObjectAnimator alphaObjectAnimator = ObjectAnimator.ofFloat(icon, "alpha", 0f, 1f, 0.5f);
//        alphaObjectAnimator.setDuration(2000)
//                .start();

//        ObjectAnimator scaleXObjectAnimator = ObjectAnimator.ofFloat(icon, "scaleX",0f,1f,0.5f);
//        scaleXObjectAnimator.setDuration(2000)
//                .start();

//        ObjectAnimator translationXObjectAnimator = ObjectAnimator.ofFloat(icon, "translationX",0f,1000f);
//        translationXObjectAnimator.setDuration(2000)
//                .start();

        ObjectAnimator rotationObjectAnimator = ObjectAnimator.ofFloat(icon, "rotation",0f,-360f);
        rotationObjectAnimator.setDuration(2000);
        rotationObjectAnimator.setRepeatCount(3);
        rotationObjectAnimator.setRepeatMode(ValueAnimator.REVERSE);
        rotationObjectAnimator.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {

            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });
        rotationObjectAnimator.start();


        //ViewPropertyAnimator的用法
//        icon.animate().alpha(0.5f)
//                .translationX(100f)
//                .rotation(180)
//                .scaleX(2)
//                .scaleY(2)
//                .setStartDelay(2000)
//                .setDuration(3000);
    }
}
