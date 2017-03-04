package com.developers.coolprogressviews;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Amanjeet Singh on 19-Feb-17.
 */

public class CircleWithArcProgress extends View {

    Paint paint=new Paint();
    RectF oval=new RectF();
    int startAngle=0;
    int sweepAngle=120;

    private float radius;
    private int circleColor;
    private int arcColor;

    public CircleWithArcProgress(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray array=context.getTheme().obtainStyledAttributes(attrs,R.styleable.CircleWithArcProgress,0,0);
        try{
            radius=array.getDimension(R.styleable.CircleWithArcProgress_radius1,50);
            circleColor=array.getColor(R.styleable.CircleWithArcProgress_circleColor,Color.parseColor("#b0dbdb"));
            arcColor=array.getColor(R.styleable.CircleWithArcProgress_arcColor,Color.parseColor("#097669"));
        }
        catch (Exception e){
           e.printStackTrace();
        }
        finally {
            array.recycle();
        }
        post(animator);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(15);
        paint.setColor(circleColor);
        canvas.drawCircle(getWidth()/2,getHeight()/2,radius,paint);

        paint.setColor(arcColor);
        oval.set(getWidth()/2-radius,getHeight()/2-radius,getWidth()/2+radius,getHeight()/2+radius);
        canvas.drawArc(oval,startAngle,sweepAngle,false,paint);
    }

    Runnable animator=new Runnable() {
        @Override
        public void run() {
          if(startAngle<=360){
              startAngle+=10;
          }
            else{
              startAngle=0;
          }
            invalidate();
            postDelayed(this,30);
        }
    };
}
