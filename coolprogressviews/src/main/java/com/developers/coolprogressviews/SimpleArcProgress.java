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

public class SimpleArcProgress extends View {

    private Paint paint=new Paint();
    private int startAngle=120;
    private RectF oval=new RectF();
    private int sweepAngle=150;

    private float rad;
    private int colorArc;

    public SimpleArcProgress(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint.setStyle(Paint.Style.STROKE);
        TypedArray array=context.getTheme().obtainStyledAttributes(attrs,R.styleable.SimpleArcProgress,0,0);
        try{
            rad=array.getDimension(R.styleable.SimpleArcProgress_arcRadius,50);
            colorArc=array.getColor(R.styleable.SimpleArcProgress_colorofArc,Color.parseColor("#009688"));
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
        paint.setColor(colorArc);
        paint.setStrokeWidth(7);
        oval.set(getWidth()/2-rad,getHeight()/2-rad,getWidth()/2+rad,getHeight()/2+rad);
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
